package biblioteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;

public class Main {

	// Método para registrar objetos en la base de datos
	public static void creaObjetos(String hostname, String dbname) {
		System.out.println("====================== Crear Objetos =====================\n");
		try {
			// Abre la base de datos con el Hostname(localhost), dbname(biblioteca) y el
			// namespace"biblioteca".
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "biblioteca"));
			db.open();
			db.startTransaction();
			System.out.println("Conectado a la base de datos " + db.toString() + " de Matisse");
			// Crea un objeto Autor
			Autor a1 = new Autor(db);
			a1.setNombre("Antonio");
			a1.setApellidos("MuRo");
			a1.setEdad(31);
			System.out.println("Autor "+a1.getNombre()+" "+a1.getApellidos()+" creado...");
			

			// Crea un objeto Libro
			Libro l1 = new Libro(db);
			l1.setTitulo("Programación de Sistemas Informáticos");
			l1.setEditorial("Amuro");
			l1.setPaginas(420);
			System.out.println("Libro "+l1.getTitulo()+" creado...");

			// Crea otro objeto Libro
			Libro l2 = new Libro(db);
			l2.setTitulo("Desarrollo de Aplicaciones Multiplataforma");
			l2.setEditorial("Amuro");
			l2.setPaginas(513);
			System.out.println("Libro "+l2.getTitulo()+" creado...");

			// Crea un array de Obras para guardar los libros y hacer las relaciones
			Obra o1[] = new Obra[2];
			o1[0] = l1;
			o1[1] = l2;
			// Guarda las relaciones del autor con los libros que ha escrito.
			a1.setEscribe(o1);
			// Ejecuta un commit para materializar las peticiones.
			db.commit();
			// Cierra la base de datos.
			db.close();
			System.out.println("\nHecho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	// Borrartodoslosobjetosdeunaclase
	public static void borrarTodos(String hostname, String dbname) {
		System.out.println("====================== Borrar Todos =====================\n");
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "biblioteca"));
			db.open();
			db.startTransaction();
			// ListatodoslosobjetosObraquehay enlabase dedatos, conel
			// método//getInstanceNumber
			if(Obra.getInstanceNumber(db)<1)
			{
				System.out.println("\nNo Existen Obras en la base de datos.");
			}
			else if (Obra.getInstanceNumber(db)<2)
			{
				System.out.println("\n" + Obra.getInstanceNumber(db) + " Obra en la DB.");
			}
			else
			{
				System.out.println("\n" + Obra.getInstanceNumber(db) + " Obras en la DB.");
			}
	
			// BorratodaslasinstanciasdeObra
			Obra.getClass(db).removeAllInstances();
			
			// materializaloscambiosy cierralaBD
			db.commit();
			db.close();
			System.out.println("\nHecho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
	
	//Método para modificar la edad de un autor pasando su nombre y edad como parámetro.
	public static void modificaObjeto(String hostname, String dbname, String nombre, Integer nuevaEdad) {
		System.out.println("=========== Modifica un objeto ==========\n");
		int nAutores = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "biblioteca"));
			db.open();
			db.startTransaction();
			// ListacuántosobjetosObraconel métodogetInstanceNumber
			System.out.println("\n" + Autor.getInstanceNumber(db) + " Autores en la DB.");
			nAutores = (int) Autor.getInstanceNumber(db);
			// CreaunIterador(propiodeJava)
			MtObjectIterator<Autor> iter = Autor.<Autor>instanceIterator(db);
			System.out.println("Recorro los autores de uno en uno y cambio la edad a "+nuevaEdad+" cuando encuentre el nombre "+nombre);
			while (iter.hasNext()) {
				Autor[] autores = iter.next(nAutores);
				for (int i = 0; i < autores.length; i++) {
					// Buscaunaautorconnombre'nombre'
					if (autores[i].getNombre().compareTo(nombre) == 0) {
						autores[i].setEdad(nuevaEdad);
					} else {
					}
				}
			}
			iter.close();
			// materializaloscambiosy cierralaBD
			db.commit();
			db.close();
			System.out.println("\nHecho.\n");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	public static void ejecutaOQL(String hostname, String dbname) {
		MtDatabase dbcon = new MtDatabase(hostname, dbname);
		// Abreunaconexióna labase dedatos
		dbcon.open();
		System.out.println("====================== Consultar Objetos =====================\n");
		try {
			// CreaunainstanciadeStatement
			Statement stmt = dbcon.createStatement();
			// AsignaunaconsultaOQL. EstaconsultaloquehaceesutilizarREF() para obtenerel
			// objeto
			// directamenteenvezdeobtenervaloresconcretos(quetambiénpodríaser).
			String commandText = "SELECT REF(a) from biblioteca.Autor a;";
			// Ejecutalaconsultay obtieneunResultSet
			ResultSet rset = stmt.executeQuery(commandText);
			Autor a1;
			// Lee rsetunoa uno.
			while (rset.next()) {
				// ObtienelosobjetosAutor.
				a1 = (Autor) rset.getObject(1);
				// Imprimelosatributosdecadaobjetoconunformatodeterminado.

				System.out.println("Autor: " + String.format("%16s", a1.getNombre())
				+ String.format("%16s", a1.getApellidos()) + " Spouse: " + String.format("%16s", a1.getEdad()));
			}
			// Cierralasconexiones
			rset.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQLException:  " + e.getMessage());
		}
	}

	static String hostname = "localhost";
	static String dbname = "biblioteca";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		creaObjetos(hostname, dbname);
		borrarTodos(hostname, dbname);
		modificaObjeto(hostname, dbname, "Antonio", 29);
		ejecutaOQL(hostname, dbname);
	}

}
