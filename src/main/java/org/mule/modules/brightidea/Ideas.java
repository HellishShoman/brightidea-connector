/**
 * Mule BrightIdea Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.brightidea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IDEAS")
public class Ideas {

    @XmlElement(name = "IDEA")
    private List<Idea> idea;

    public List<Idea> getIdea() {
        return idea;
    }

    public void setIdea(List<Idea> idea) {
        this.idea = idea;
    }

    @Override
    public String toString() {
        return "Ideas{" +
                "idea=" + idea +
                '}';
    }
}