
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452Literal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452Literal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data2literal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Literal", propOrder = {
    "data2Literal"
})
public class Qc10452Literal {

    @XmlElement(name = "data2literal")
    protected String data2Literal;

    /**
     * Gets the value of the data2Literal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData2Literal() {
        return data2Literal;
    }

    /**
     * Sets the value of the data2Literal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData2Literal(String value) {
        this.data2Literal = value;
    }

}
