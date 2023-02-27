package com.orgname.currencycloudintegration.service;

import com.orgname.currencycloudintegration.models.response.AccountResponse;
import com.orgname.currencycloudintegration.models.response.FundingAccountsResponse;
import com.orgname.currencycloudintegration.routes.Routes;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AcctService {

    @Autowired
    private ProducerTemplate producerTemplate;

    public AccountResponse getAcountDetails() {


        AccountResponse accountResponse = (AccountResponse) producerTemplate.requestBodyAndHeaders(Routes.ACCOUNT_DETAILS.getRoutes(),null,null);
        return accountResponse;
    }


    public FundingAccountsResponse getFundingAcctDetails(String currency) {

        Map<String, Object> headers = buildHeaders(currency);
        FundingAccountsResponse fundingAccountsResponse = (FundingAccountsResponse) producerTemplate.requestBodyAndHeaders(Routes.FUNDING_ACCT_DETAILS.getRoutes(),null,headers);
        return fundingAccountsResponse;
    }



    private Map<String, Object> buildHeaders(String currency) {
        Map<String, Object> headers = new HashMap<>();
        headers.put("currency", currency);
        return headers;
    }

}
