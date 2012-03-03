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

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");

    @Override
    public Date unmarshal(String v) throws Exception {
        return DATE_FORMAT.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return DATE_FORMAT.format(v);
    }
}