package com.orgname.currencycloudintegration.controller;


import com.orgname.currencycloudintegration.models.response.AccountResponse;
import com.orgname.currencycloudintegration.models.response.BalanceResponse;
import com.orgname.currencycloudintegration.models.response.FundingAccountsResponse;
import com.orgname.currencycloudintegration.service.AcctService;
import com.orgname.currencycloudintegration.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyCloudController {

    @Autowired
    private BalanceService balanceService;

    @Autowired
    private AcctService acctService;

    @GetMapping("/balance/{currency}")
    public BalanceResponse getBalance(@PathVariable("currency") String currency) {
        BalanceResponse balanceResponse = null;
        try {
            balanceResponse = balanceService.getBalance(currency);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return balanceResponse;

    }


    @GetMapping("/account")
    public AccountResponse getAccountDetails() {
        AccountResponse accountResponse = null;
        try {
            accountResponse = acctService.getAcountDetails();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return accountResponse;

    }

    @GetMapping("/funding/account/{currency}")
    public FundingAccountsResponse getFundingAccountDetails(@PathVariable("currency") String currency) {
        FundingAccountsResponse fundingAccountsResponse = null;
        try {
            fundingAccountsResponse = acctService.getFundingAcctDetails(currency);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return fundingAccountsResponse;

    }






}
