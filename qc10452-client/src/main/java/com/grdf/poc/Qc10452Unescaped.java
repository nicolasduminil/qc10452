
package com.grdf.poc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for qc10452Unescaped complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qc10452Unescaped"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data2unescape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Unescaped", propOrder = {
    "data2Unescape"
})
public class Qc10452Unescaped {

    @XmlElement(name = "data2unescape")
    protected String data2Unescape;

    /**
     * Gets the value of the data2Unescape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData2Unescape() {
        return data2Unescape;
    }

    /**
     * Sets the value of the data2Unescape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData2Unescape(String value) {
        this.data2Unescape = value;
    }

}
