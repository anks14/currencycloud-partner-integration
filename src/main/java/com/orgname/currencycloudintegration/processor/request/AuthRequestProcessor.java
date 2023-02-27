package com.orgname.currencycloudintegration.processor.request;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthRequestProcessor implements Processor {


    @Value("${login.id}")
    private String loginId;

    @Value("${partner.api.key}")
    private String apiKey;



    @Override
    public void process(Exchange exchange) throws Exception {

        StringBuilder authString = new StringBuilder();
        authString.append("login_id=")
                .append(loginId)
                .append("&api_key=")
                .append(apiKey);
        exchange.getIn().setBody(authString);

    }
}
