package com.orgname.currencycloudintegration.routes;

import com.orgname.currencycloudintegration.constants.ExchangeProperty;
import com.orgname.currencycloudintegration.models.request.AuthToken;
import com.orgname.currencycloudintegration.processor.request.AuthRequestProcessor;
import com.orgname.currencycloudintegration.processor.response.AuthResponseProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationRoute extends RouteBuilder {

    @Value("${throttle.value}")
    private long throttleValue;


    @Value("${throttle.time.period}")
    private long throttleTimePeriod;

    @Autowired
    private AuthRequestProcessor authRequestProcessor;

    @Autowired
    private AuthResponseProcessor authResponseProcessor;

    @Override
    public void configure() throws Exception {
        from(Routes.AUTH_TOKEN.getRoutes())
                .throttle(throttleValue)
                .timePeriodMillis(throttleTimePeriod)
                .process(authRequestProcessor)
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
                .to("{{auth.url}}")
                .unmarshal().json(JsonLibrary.Jackson, AuthToken.class)
                .process(authResponseProcessor)
                .end();
    }


}

