
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452EscapedResponse", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452EscapedResponse", namespace = "http://poc.grdf.com/")
public class Qc10452EscapedResponse {

    @XmlElement(name = "escapedData", namespace = "")
    private String escapedData;

    /**
     * 
     * @return
     *     returns String
     */
    public String getEscapedData() {
        return this.escapedData;
    }

    /**
     * 
     * @param escapedData
     *     the value for the escapedData property
     */
    public void setEscapedData(String escapedData) {
        this.escapedData = escapedData;
    }

}
