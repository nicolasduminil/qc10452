
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452LiteralResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452LiteralResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="literalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452LiteralResponse", propOrder = {
    "literalData"
})
public class Qc10452LiteralResponse {

    protected String literalData;

    /**
     * Gets the value of the literalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteralData() {
        return literalData;
    }

    /**
     * Sets the value of the literalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteralData(String value) {
        this.literalData = value;
    }

}
