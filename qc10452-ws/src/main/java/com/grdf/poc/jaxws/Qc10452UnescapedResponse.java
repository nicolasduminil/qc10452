
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452UnescapedResponse", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452UnescapedResponse", namespace = "http://poc.grdf.com/")
public class Qc10452UnescapedResponse {

    @XmlElement(name = "unescapedData", namespace = "")
    private String unescapedData;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUnescapedData() {
        return this.unescapedData;
    }

    /**
     * 
     * @param unescapedData
     *     the value for the unescapedData property
     */
    public void setUnescapedData(String unescapedData) {
        this.unescapedData = unescapedData;
    }

}
