/*
 * An XML document type.
 * Localname: getPersonsByAge
 * Namespace: http://all.Services/
 * Java type: services.all.GetPersonsByAgeDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getPersonsByAge(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetPersonsByAgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonsByAgeDocument
{
    
    public GetPersonsByAgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONSBYAGE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getPersonsByAge");
    
    
    /**
     * Gets the "getPersonsByAge" element
     */
    public services.all.GetPersonsByAgeDocument.GetPersonsByAge getGetPersonsByAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeDocument.GetPersonsByAge target = null;
            target = (services.all.GetPersonsByAgeDocument.GetPersonsByAge)get_store().find_element_user(GETPERSONSBYAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonsByAge" element
     */
    public void setGetPersonsByAge(services.all.GetPersonsByAgeDocument.GetPersonsByAge getPersonsByAge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeDocument.GetPersonsByAge target = null;
            target = (services.all.GetPersonsByAgeDocument.GetPersonsByAge)get_store().find_element_user(GETPERSONSBYAGE$0, 0);
            if (target == null)
            {
                target = (services.all.GetPersonsByAgeDocument.GetPersonsByAge)get_store().add_element_user(GETPERSONSBYAGE$0);
            }
            target.set(getPersonsByAge);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonsByAge" element
     */
    public services.all.GetPersonsByAgeDocument.GetPersonsByAge addNewGetPersonsByAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeDocument.GetPersonsByAge target = null;
            target = (services.all.GetPersonsByAgeDocument.GetPersonsByAge)get_store().add_element_user(GETPERSONSBYAGE$0);
            return target;
        }
    }
    /**
     * An XML getPersonsByAge(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetPersonsByAgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonsByAgeDocument.GetPersonsByAge
    {
        
        public GetPersonsByAgeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AGE$0 = 
            new javax.xml.namespace.QName("", "age");
        
        
        /**
         * Gets the "age" element
         */
        public int getAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "age" element
         */
        public org.apache.xmlbeans.XmlInt xgetAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AGE$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "age" element
         */
        public boolean isNilAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AGE$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "age" element
         */
        public void setAge(int age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGE$0);
                }
                target.setIntValue(age);
            }
        }
        
        /**
         * Sets (as xml) the "age" element
         */
        public void xsetAge(org.apache.xmlbeans.XmlInt age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AGE$0);
                }
                target.set(age);
            }
        }
        
        /**
         * Nils the "age" element
         */
        public void setNilAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AGE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AGE$0);
                }
                target.setNil();
            }
        }
    }
}
