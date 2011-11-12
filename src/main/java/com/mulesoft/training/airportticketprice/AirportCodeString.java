/*
 * $Id: NameString.java 19191 2010-08-25 21:05:23Z tcarlson $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package com.mulesoft.training.airportticketprice;

import java.io.Serializable;

/**
 * <code>NameString</code> is a simple string wrapper that holds a name and a greeting string
 */
public class AirportCodeString implements Serializable
{
    /**
     * Serial version
     */
	/* TODO: Confirm use of UID here?? How to?? */
    private static final long serialVersionUID = 7010138636008560022L;

    private String airportCode;

    public AirportCodeString()
    {
        this.airportCode = null;
    }
    
    public AirportCodeString(String airportCode)
    {
        this.airportCode = airportCode;
    }

    /**
     * @return Returns the AirportCode.
     */
    public String getAirportCode()
    {
        return airportCode;
    }

    /**
     * @param AirportCode The AirportCode to set.
     */
    public void setAirportCode(String airportCode)
    {
        this.airportCode = airportCode;
    }

    public boolean isValid()
    {
        return airportCode != null && airportCode.length() > 0;
    }
}
