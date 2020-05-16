/*
 * An XML document type.
 * Localname: person
 * Namespace: http://all.Services/
 * Java type: services.all.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one person(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.PersonDocument
{
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "person");
    
    
    /**
     * Gets the "person" element
     */
    public services.all.Person getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Person target = null;
            target = (services.all.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(services.all.Person person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Person target = null;
            target = (services.all.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                target = (services.all.Person)get_store().add_element_user(PERSON$0);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public services.all.Person addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.Person target = null;
            target = (services.all.Person)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
}
