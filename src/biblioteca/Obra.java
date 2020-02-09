/*
 * Obra.java
 *
 * Generated with Matisse Schema Definition Language 9.1.12
 * Generation date: Sun Feb 09 16:24:47 2020
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package biblioteca;

import com.matisse.reflect.*;

/**
 * <code>Obra</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Obra extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.12
     * Generation Date: Sun Feb 09 16:24:47 2020
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Obra</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("biblioteca.Obra"));

    /**
     * Gets the <code>Obra</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Obra(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Obra(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Obra.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Obra.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Obra.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Obra.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'titulo' */

    /** Attribute <code>titulo</code> cache ID */
    private static int tituloCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("titulo",CID));

    /**
     * Gets the <code>titulo</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getTituloAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(tituloCID);
    }


    /**
     * Gets the <code>titulo</code> attribute value.
     * @return the value
     *
     * @see #setTitulo
     * @see #removeTitulo
     */
    public final String getTitulo() {
        return getString(getTituloAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>titulo</code> attribute value.
     * @param val the new value
     *
     * @see #getTitulo
     * @see #removeTitulo
     */
    public final void setTitulo(String val) {
        setString(getTituloAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>titulo</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getTitulo
     * @see #setTitulo
     */
    public final void removeTitulo() {
        removeValue(getTituloAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getTitulo
     * @see #setTitulo
     */
    public final boolean isTituloNull() {
        return isNull(getTituloAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getTitulo
     * @see #setTitulo
     */
    public final boolean isTituloDefaultValue() {
        return isDefaultValue(getTituloAttribute(getMtDatabase()));
    }


    /* Attribute 'paginas' */

    /** Attribute <code>paginas</code> cache ID */
    private static int paginasCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("paginas",CID));

    /**
     * Gets the <code>paginas</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getPaginasAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(paginasCID);
    }


    /**
     * Gets the <code>paginas</code> attribute value.
     * @return the value
     *
     * @see #setPaginas
     * @see #removePaginas
     */
    public final int getPaginas() {
        return getInteger(getPaginasAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>paginas</code> attribute value.
     * @param val the new value
     *
     * @see #getPaginas
     * @see #removePaginas
     */
    public final void setPaginas(int val) {
        setInteger(getPaginasAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>paginas</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getPaginas
     * @see #setPaginas
     */
    public final void removePaginas() {
        removeValue(getPaginasAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getPaginas
     * @see #setPaginas
     */
    public final boolean isPaginasNull() {
        return isNull(getPaginasAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getPaginas
     * @see #setPaginas
     */
    public final boolean isPaginasDefaultValue() {
        return isDefaultValue(getPaginasAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'escrito_por' */

    /** Relationship <code>escrito_por</code> cache ID */
    private static int escrito_porCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("escrito_por",CID));

    /**
     * Gets the <code>escrito_por</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getEscrito_porRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(escrito_porCID);
    }

    /**
     * Gets the <code>escrito_por</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     * @see #setEscrito_por
     * @see #removeEscrito_por
     */
    public final biblioteca.Autor[] getEscrito_por() {
        return (biblioteca.Autor[])getSuccessors(getEscrito_porRelationship(getMtDatabase()), biblioteca.Autor.class);
    }

    /**
     * Counts the <code>escrito_por</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getEscrito_por
     * @see #escrito_porIterator
     * @see #setEscrito_por
     * @see #removeEscrito_por
     */
    public final int getEscrito_porSize() {
        return getSuccessorSize(getEscrito_porRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>escrito_por</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getEscrito_por
     * @see #getEscrito_porSize
     * @see #setEscrito_por
     * @see #removeEscrito_por
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> escrito_porIterator() {
        return this.<E>successorIterator(getEscrito_porRelationship(getMtDatabase()), biblioteca.Autor.class);
    }

    /**
     * Sets the <code>escrito_por</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     * @see #removeEscrito_por
     */
    public final void setEscrito_por(biblioteca.Autor[] succs) {
        setSuccessors(getEscrito_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>escrito_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     * @see #setEscrito_por
     * @see #removeEscrito_por
     */
    public final void prependEscrito_por(biblioteca.Autor succ) {
        prependSuccessor(getEscrito_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>escrito_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getEscrito_por
     * @see #setEscrito_por
     * @see #removeEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     */
    public final void appendEscrito_por(biblioteca.Autor succ) {
        appendSuccessor(getEscrito_porRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>escrito_por</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getEscrito_por
     * @see #setEscrito_por
     * @see #removeEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     */
    public final void appendEscrito_por(biblioteca.Autor[] succs) {
        addSuccessors(getEscrito_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>escrito_por</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getEscrito_por
     * @see #setEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     */
    public void removeEscrito_por(biblioteca.Autor[] succs) {
        removeSuccessors(getEscrito_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>escrito_por</code> successors list.
     * @param succ the object to remove
     *
     * @see #getEscrito_por
     * @see #setEscrito_por
     * @see #getEscrito_porSize
     * @see #escrito_porIterator
     */
    public void removeEscrito_por(biblioteca.Autor succ) {
        removeSuccessor(getEscrito_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>escrito_por</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearEscrito_por() {
        clearSuccessors(getEscrito_porRelationship(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Obra(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Obra]";
    }
}
