
package com.grdf.poc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grdf.poc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Qc10452Escaped_QNAME = new QName("http://poc.grdf.com/", "qc10452Escaped");
    private final static QName _Qc10452EscapedResponse_QNAME = new QName("http://poc.grdf.com/", "qc10452EscapedResponse");
    private final static QName _Qc10452Literal_QNAME = new QName("http://poc.grdf.com/", "qc10452Literal");
    private final static QName _Qc10452LiteralResponse_QNAME = new QName("http://poc.grdf.com/", "qc10452LiteralResponse");
    private final static QName _Qc10452Unescaped_QNAME = new QName("http://poc.grdf.com/", "qc10452Unescaped");
    private final static QName _Qc10452UnescapedResponse_QNAME = new QName("http://poc.grdf.com/", "qc10452UnescapedResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grdf.poc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Qc10452Escaped }
     * 
     */
    public Qc10452Escaped createQc10452Escaped() {
        return new Qc10452Escaped();
    }

    /**
     * Create an instance of {@link Qc10452EscapedResponse }
     * 
     */
    public Qc10452EscapedResponse createQc10452EscapedResponse() {
        return new Qc10452EscapedResponse();
    }

    /**
     * Create an instance of {@link Qc10452Literal }
     * 
     */
    public Qc10452Literal createQc10452Literal() {
        return new Qc10452Literal();
    }

    /**
     * Create an instance of {@link Qc10452LiteralResponse }
     * 
     */
    public Qc10452LiteralResponse createQc10452LiteralResponse() {
        return new Qc10452LiteralResponse();
    }

    /**
     * Create an instance of {@link Qc10452Unescaped }
     * 
     */
    public Qc10452Unescaped createQc10452Unescaped() {
        return new Qc10452Unescaped();
    }

    /**
     * Create an instance of {@link Qc10452UnescapedResponse }
     * 
     */
    public Qc10452UnescapedResponse createQc10452UnescapedResponse() {
        return new Qc10452UnescapedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452Escaped }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452Escaped }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452Escaped")
    public JAXBElement<Qc10452Escaped> createQc10452Escaped(Qc10452Escaped value) {
        return new JAXBElement<Qc10452Escaped>(_Qc10452Escaped_QNAME, Qc10452Escaped.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452EscapedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452EscapedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452EscapedResponse")
    public JAXBElement<Qc10452EscapedResponse> createQc10452EscapedResponse(Qc10452EscapedResponse value) {
        return new JAXBElement<Qc10452EscapedResponse>(_Qc10452EscapedResponse_QNAME, Qc10452EscapedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452Literal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452Literal }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452Literal")
    public JAXBElement<Qc10452Literal> createQc10452Literal(Qc10452Literal value) {
        return new JAXBElement<Qc10452Literal>(_Qc10452Literal_QNAME, Qc10452Literal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452LiteralResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452LiteralResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452LiteralResponse")
    public JAXBElement<Qc10452LiteralResponse> createQc10452LiteralResponse(Qc10452LiteralResponse value) {
        return new JAXBElement<Qc10452LiteralResponse>(_Qc10452LiteralResponse_QNAME, Qc10452LiteralResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452Unescaped }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452Unescaped }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452Unescaped")
    public JAXBElement<Qc10452Unescaped> createQc10452Unescaped(Qc10452Unescaped value) {
        return new JAXBElement<Qc10452Unescaped>(_Qc10452Unescaped_QNAME, Qc10452Unescaped.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Qc10452UnescapedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Qc10452UnescapedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://poc.grdf.com/", name = "qc10452UnescapedResponse")
    public JAXBElement<Qc10452UnescapedResponse> createQc10452UnescapedResponse(Qc10452UnescapedResponse value) {
        return new JAXBElement<Qc10452UnescapedResponse>(_Qc10452UnescapedResponse_QNAME, Qc10452UnescapedResponse.class, null, value);
    }

}
