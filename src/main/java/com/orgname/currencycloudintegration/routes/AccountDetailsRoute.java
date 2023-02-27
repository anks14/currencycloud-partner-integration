package com.orgname.currencycloudintegration.routes;

import com.orgname.currencycloudintegration.models.response.AccountResponse;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class AccountDetailsRoute extends RouteBuilder {

    @Value("${throttle.value}")
    private long throttleValue;


    @Value("${throttle.time.period}")
    private long throttleTimePeriod;


    @Override
    public void configure() throws Exception {
        from(Routes.ACCOUNT_DETAILS.getRoutes())
                .to(Routes.AUTH_TOKEN.getRoutes())
                .throttle(throttleValue)
                .timePeriodMillis(throttleTimePeriod)
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .setHeader(Exchange.CONTENT_TYPE, constant(MediaType.APPLICATION_JSON_VALUE))
                .to("{{acct.url")
                .unmarshal().json(JsonLibrary.Jackson, AccountResponse.class)
                .end();
    }


}

