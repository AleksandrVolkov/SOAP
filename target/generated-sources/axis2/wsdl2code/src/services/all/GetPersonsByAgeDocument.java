/*
 * An XML document type.
 * Localname: getPersonsByAge
 * Namespace: http://all.Services/
 * Java type: services.all.GetPersonsByAgeDocument
 *
 * Automatically generated - do not modify.
 */
package services.all;


/**
 * A document containing one getPersonsByAge(@http://all.Services/) element.
 *
 * This is a complex type.
 */
public interface GetPersonsByAgeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsByAgeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA735D3F043ED2A3BF5AA6AE0B2DD7F91").resolveHandle("getpersonsbyagecc4bdoctype");
    
    /**
     * Gets the "getPersonsByAge" element
     */
    services.all.GetPersonsByAgeDocument.GetPersonsByAge getGetPersonsByAge();
    
    /**
     * Sets the "getPersonsByAge" element
     */
    void setGetPersonsByAge(services.all.GetPersonsByAgeDocument.GetPersonsByAge getPersonsByAge);
    
    /**
     * Appends and returns a new empty "getPersonsByAge" element
     */
    services.all.GetPersonsByAgeDocument.GetPersonsByAge addNewGetPersonsByAge();
    
    /**
     * An XML getPersonsByAge(@http://all.Services/).
     *
     * This is a complex type.
     */
    public interface GetPersonsByAge extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsByAge.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA735D3F043ED2A3BF5AA6AE0B2DD7F91").resolveHandle("getpersonsbyage6bdfelemtype");
        
        /**
         * Gets the "age" element
         */
        int getAge();
        
        /**
         * Gets (as xml) the "age" element
         */
        org.apache.xmlbeans.XmlInt xgetAge();
        
        /**
         * Tests for nil "age" element
         */
        boolean isNilAge();
        
        /**
         * Sets the "age" element
         */
        void setAge(int age);
        
        /**
         * Sets (as xml) the "age" element
         */
        void xsetAge(org.apache.xmlbeans.XmlInt age);
        
        /**
         * Nils the "age" element
         */
        void setNilAge();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.all.GetPersonsByAgeDocument.GetPersonsByAge newInstance() {
              return (services.all.GetPersonsByAgeDocument.GetPersonsByAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.all.GetPersonsByAgeDocument.GetPersonsByAge newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.all.GetPersonsByAgeDocument.GetPersonsByAge) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.all.GetPersonsByAgeDocument newInstance() {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.all.GetPersonsByAgeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.all.GetPersonsByAgeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.all.GetPersonsByAgeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.all.GetPersonsByAgeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.all.GetPersonsByAgeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.all.GetPersonsByAgeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetPersonsByAgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.all.GetPersonsByAgeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.all.GetPersonsByAgeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
