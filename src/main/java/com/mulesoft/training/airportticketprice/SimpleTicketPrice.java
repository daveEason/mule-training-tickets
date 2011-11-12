package com.mulesoft.training.airportticketprice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 11/11/11
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */

@WebService
public interface SimpleTicketPrice {

    public String priceRequest(@WebParam(name = "airportCode") String airportCode) throws Exception;

}
