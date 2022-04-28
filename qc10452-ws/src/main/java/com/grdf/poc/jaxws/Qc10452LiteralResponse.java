
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452LiteralResponse", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452LiteralResponse", namespace = "http://poc.grdf.com/")
public class Qc10452LiteralResponse {

    @XmlElement(name = "literalData", namespace = "")
    private String literalData;

    /**
     * 
     * @return
     *     returns String
     */
    public String getLiteralData() {
        return this.literalData;
    }

    /**
     * 
     * @param literalData
     *     the value for the literalData property
     */
    public void setLiteralData(String literalData) {
        this.literalData = literalData;
    }

}
