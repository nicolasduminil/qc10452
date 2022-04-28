
package com.grdf.poc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "qc10452Unescaped", namespace = "http://poc.grdf.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qc10452Unescaped", namespace = "http://poc.grdf.com/")
public class Qc10452Unescaped {

    @XmlElement(name = "data2unescape", namespace = "")
    private String data2Unescape;

    /**
     * 
     * @return
     *     returns String
     */
    public String getData2Unescape() {
        return this.data2Unescape;
    }

    /**
     * 
     * @param data2Unescape
     *     the value for the data2Unescape property
     */
    public void setData2Unescape(String data2Unescape) {
        this.data2Unescape = data2Unescape;
    }

}
