package com.orgname.currencycloudintegration.service;

import com.orgname.currencycloudintegration.models.response.BalanceResponse;
import com.orgname.currencycloudintegration.routes.Routes;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BalanceService {

    @Autowired
    private ProducerTemplate producerTemplate;

    public BalanceResponse getBalance(String currency) {


        Map<String, Object> headers = buildHeaders(currency);
        BalanceResponse balanceResponse = (BalanceResponse) producerTemplate.requestBodyAndHeaders(Routes.GET_BALANCE.getRoutes(), null, headers);
        return balanceResponse;
    }

    private Map<String, Object> buildHeaders(String currency) {
        Map<String, Object> headers = new HashMap<>();
        headers.put("currency", currency);
        return headers;
    }

}
