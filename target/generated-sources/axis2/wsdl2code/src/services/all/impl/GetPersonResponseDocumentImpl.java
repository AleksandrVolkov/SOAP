/*
 * An XML document type.
 * Localname: getPersonResponse
 * Namespace: http://all.Services/
 * Java type: services.all.GetPersonResponseDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getPersonResponse(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetPersonResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonResponseDocument
{
    
    public GetPersonResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getPersonResponse");
    
    
    /**
     * Gets the "getPersonResponse" element
     */
    public services.all.GetPersonResponseDocument.GetPersonResponse getGetPersonResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (services.all.GetPersonResponseDocument.GetPersonResponse)get_store().find_element_user(GETPERSONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonResponse" element
     */
    public void setGetPersonResponse(services.all.GetPersonResponseDocument.GetPersonResponse getPersonResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (services.all.GetPersonResponseDocument.GetPersonResponse)get_store().find_element_user(GETPERSONRESPONSE$0, 0);
            if (target == null)
            {
                target = (services.all.GetPersonResponseDocument.GetPersonResponse)get_store().add_element_user(GETPERSONRESPONSE$0);
            }
            target.set(getPersonResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonResponse" element
     */
    public services.all.GetPersonResponseDocument.GetPersonResponse addNewGetPersonResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (services.all.GetPersonResponseDocument.GetPersonResponse)get_store().add_element_user(GETPERSONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getPersonResponse(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetPersonResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonResponseDocument.GetPersonResponse
    {
        
        public GetPersonResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public services.all.Person getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Person target = null;
                target = (services.all.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Person target = null;
                target = (services.all.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(services.all.Person xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Person target = null;
                target = (services.all.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Person)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public services.all.Person addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Person target = null;
                target = (services.all.Person)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Person target = null;
                target = (services.all.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Person)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
