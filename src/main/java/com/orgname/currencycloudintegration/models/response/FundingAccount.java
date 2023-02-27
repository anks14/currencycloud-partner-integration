package com.orgname.currencycloudintegration.models.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundingAccount {

    @JsonProperty(value = "account_id")
    private String accountId;
    @JsonProperty(value = "account_number")
    private String acctNumber;

    @JsonProperty(value = "account_number_type")
    private String acctType;
    @JsonProperty(value = "account_holder_name")
    private String acctHolderName;
    @JsonProperty(value = "bank_name")
    private String bankName;
    @JsonProperty(value = "bank_address")
    private String bankAddress;
    @JsonProperty(value = "bank_country")
    private String bankCountry;
    @JsonProperty(value = "routing_code")
    private String routingCode;
    @JsonProperty(value = "routing_code_type")
    private String routingType;
    @JsonProperty(value = "payment_type")
    private String paymentType;
    @JsonProperty(value = "currency")
    private String currency;

}
