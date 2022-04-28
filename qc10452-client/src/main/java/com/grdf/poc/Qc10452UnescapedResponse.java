
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452UnescapedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452UnescapedResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unescapedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452UnescapedResponse", propOrder = {
    "unescapedData"
})
public class Qc10452UnescapedResponse {

    protected String unescapedData;

    /**
     * Gets the value of the unescapedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnescapedData() {
        return unescapedData;
    }

    /**
     * Sets the value of the unescapedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnescapedData(String value) {
        this.unescapedData = value;
    }

}
