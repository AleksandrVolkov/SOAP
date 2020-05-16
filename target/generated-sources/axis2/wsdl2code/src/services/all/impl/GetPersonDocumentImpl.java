/*
 * An XML document type.
 * Localname: getPerson
 * Namespace: http://all.Services/
 * Java type: services.all.GetPersonDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getPerson(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetPersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonDocument
{
    
    public GetPersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSON$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getPerson");
    
    
    /**
     * Gets the "getPerson" element
     */
    public services.all.GetPersonDocument.GetPerson getGetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonDocument.GetPerson target = null;
            target = (services.all.GetPersonDocument.GetPerson)get_store().find_element_user(GETPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPerson" element
     */
    public void setGetPerson(services.all.GetPersonDocument.GetPerson getPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonDocument.GetPerson target = null;
            target = (services.all.GetPersonDocument.GetPerson)get_store().find_element_user(GETPERSON$0, 0);
            if (target == null)
            {
                target = (services.all.GetPersonDocument.GetPerson)get_store().add_element_user(GETPERSON$0);
            }
            target.set(getPerson);
        }
    }
    
    /**
     * Appends and returns a new empty "getPerson" element
     */
    public services.all.GetPersonDocument.GetPerson addNewGetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonDocument.GetPerson target = null;
            target = (services.all.GetPersonDocument.GetPerson)get_store().add_element_user(GETPERSON$0);
            return target;
        }
    }
    /**
     * An XML getPerson(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetPersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonDocument.GetPerson
    {
        
        public GetPersonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HUMANID$0 = 
            new javax.xml.namespace.QName("", "humanId");
        
        
        /**
         * Gets the "humanId" element
         */
        public int getHumanId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUMANID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "humanId" element
         */
        public org.apache.xmlbeans.XmlInt xgetHumanId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HUMANID$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "humanId" element
         */
        public boolean isNilHumanId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HUMANID$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "humanId" element
         */
        public void setHumanId(int humanId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HUMANID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HUMANID$0);
                }
                target.setIntValue(humanId);
            }
        }
        
        /**
         * Sets (as xml) the "humanId" element
         */
        public void xsetHumanId(org.apache.xmlbeans.XmlInt humanId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HUMANID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HUMANID$0);
                }
                target.set(humanId);
            }
        }
        
        /**
         * Nils the "humanId" element
         */
        public void setNilHumanId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HUMANID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HUMANID$0);
                }
                target.setNil();
            }
        }
    }
}
