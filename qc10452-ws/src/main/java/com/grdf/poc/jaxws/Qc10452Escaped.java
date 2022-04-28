
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452Escaped", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Escaped", namespace = "http://poc.grdf.com/")
public class Qc10452Escaped {

    @XmlElement(name = "data2escape", namespace = "")
    private String data2Escape;

    /**
     * 
     * @return
     *     returns String
     */
    public String getData2Escape() {
        return this.data2Escape;
    }

    /**
     * 
     * @param data2Escape
     *     the value for the data2Escape property
     */
    public void setData2Escape(String data2Escape) {
        this.data2Escape = data2Escape;
    }

}
