/*
 * An XML document type.
 * Localname: getPersonsByAgeResponse
 * Namespace: http://all.Services/
 * Java type: services.all.GetPersonsByAgeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package services.all.impl;
/**
 * A document containing one getPersonsByAgeResponse(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public class GetPersonsByAgeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonsByAgeResponseDocument
{
    
    public GetPersonsByAgeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONSBYAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://all.Services/", "getPersonsByAgeResponse");
    
    
    /**
     * Gets the "getPersonsByAgeResponse" element
     */
    public services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse getGetPersonsByAgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse target = null;
            target = (services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse)get_store().find_element_user(GETPERSONSBYAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonsByAgeResponse" element
     */
    public void setGetPersonsByAgeResponse(services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse getPersonsByAgeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse target = null;
            target = (services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse)get_store().find_element_user(GETPERSONSBYAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse)get_store().add_element_user(GETPERSONSBYAGERESPONSE$0);
            }
            target.set(getPersonsByAgeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonsByAgeResponse" element
     */
    public services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse addNewGetPersonsByAgeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse target = null;
            target = (services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse)get_store().add_element_user(GETPERSONSBYAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getPersonsByAgeResponse(@http://all.Services/).
     *
     * This is a complex type.
     */
    public static class GetPersonsByAgeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.all.GetPersonsByAgeResponseDocument.GetPersonsByAgeResponse
    {
        
        public GetPersonsByAgeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public services.all.Repository getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Repository target = null;
                target = (services.all.Repository)get_store().find_element_user(RETURN$0, 0);
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
                services.all.Repository target = null;
                target = (services.all.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(services.all.Repository xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Repository target = null;
                target = (services.all.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Repository)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public services.all.Repository addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                services.all.Repository target = null;
                target = (services.all.Repository)get_store().add_element_user(RETURN$0);
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
                services.all.Repository target = null;
                target = (services.all.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (services.all.Repository)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
