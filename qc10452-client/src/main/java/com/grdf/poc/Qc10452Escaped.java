
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452Escaped complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452Escaped"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data2escape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Escaped", propOrder = {
    "data2Escape"
})
public class Qc10452Escaped {

    @XmlElement(name = "data2escape")
    protected String data2Escape;

    /**
     * Gets the value of the data2Escape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData2Escape() {
        return data2Escape;
    }

    /**
     * Sets the value of the data2Escape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData2Escape(String value) {
        this.data2Escape = value;
    }

}
