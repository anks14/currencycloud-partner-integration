

package com.orgname.currencycloudintegration.models.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

@Data
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountResponse implements Serializable {


    @JsonProperty(value = "id")
    private String accountId;

    @JsonProperty(value = "account_name")
    private String accountName;

    @JsonProperty(value = "currency")
    private String currency;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "settlement_type")
    private String settlementType;


    @JsonProperty(value = "process_third_party_funds")
    private String processThirdPartyFunds;


}
