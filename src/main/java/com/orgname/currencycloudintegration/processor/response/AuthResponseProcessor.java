package com.orgname.currencycloudintegration.processor.response;

import com.orgname.currencycloudintegration.constants.ExchangeProperty;
import com.orgname.currencycloudintegration.models.request.AuthToken;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AuthResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        AuthToken authToken = exchange.getIn().getBody(AuthToken.class);
        exchange.getIn().setHeader(ExchangeProperty.AUTH_TOKEN.getValue(),authToken.getAuthToken());

    }
}
