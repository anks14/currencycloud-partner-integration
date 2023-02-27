package com.orgname.currencycloudintegration.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data

public class AuthToken implements Serializable {

    @JsonProperty(value = "login_id")
    private String loginId;

    @JsonProperty(value = "api_key")
    private String apiKey;

    @JsonProperty(value = "auth_token")
    private String authToken;
}
