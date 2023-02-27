package com.orgname.currencycloudintegration.models.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceResponse implements Serializable {


    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "account_id")
    private String accountId;

    @JsonProperty(value = "currency")
    private String currency;

    @JsonProperty(value = "amount")
    private String amount;

    @JsonProperty(value = "created_at")
    private String createdAt;


    @JsonProperty(value = "updated_at")
    private String updatedAt;


}
