
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452EscapedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452EscapedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="escapedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452EscapedResponse", propOrder = {
    "escapedData"
})
public class Qc10452EscapedResponse {

    protected String escapedData;

    /**
     * Gets the value of the escapedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapedData() {
        return escapedData;
    }

    /**
     * Sets the value of the escapedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapedData(String value) {
        this.escapedData = value;
    }

}
