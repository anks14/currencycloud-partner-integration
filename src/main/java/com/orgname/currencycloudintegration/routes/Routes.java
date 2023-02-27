package com.orgname.currencycloudintegration.routes;

public enum Routes {

    AUTH_TOKEN("direct:authTokenRequest"),

    GET_BALANCE("direct:getBalance"), ACCOUNT_DETAILS("direct:acctDetails"),
    FUNDING_ACCT_DETAILS("direct:fundingAcctDetails");

    private String routeCode;

    Routes(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getRoutes() {
        return routeCode;
    }

}

