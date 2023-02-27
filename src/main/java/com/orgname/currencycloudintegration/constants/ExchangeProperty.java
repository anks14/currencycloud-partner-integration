package com.orgname.currencycloudintegration.constants;

public enum ExchangeProperty {
    AUTH_TOKEN("X-Auth-Token");

    public String getValue() {
        return value;
    }

    private String value;

    ExchangeProperty(String value) {
        this.value = value;
    }


}
