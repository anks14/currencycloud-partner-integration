package com.orgname.currencycloudintegration.models.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundingAccountsResponse {
    @JsonProperty(value = "funding_accounts")
    private List<FundingAccount> fundingAccounts;
    @JsonProperty(value = "pagination")
    private Pagination pagination;
}
