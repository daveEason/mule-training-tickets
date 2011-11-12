package com.mulesoft.training.airportticketprice;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: davideason
 * Date: 11/11/11
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */

@WebService(endpointInterface = "com.mulesoft.training.airportticketprice.SimpleTicketPrice", serviceName = "SimpleTicketPrice")
public class SimpleTicketPriceImpl extends UnitedTicketPrice implements SimpleTicketPrice {
}
