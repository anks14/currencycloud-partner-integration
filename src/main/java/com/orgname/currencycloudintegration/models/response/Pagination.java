package com.orgname.currencycloudintegration.models.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination {

    @JsonProperty(value = "total_entries")
    private String totalEntries;

    @JsonProperty(value = "total_pages")
    private String totalPages;
    @JsonProperty(value = "current_page")
    private String currentPage;
    @JsonProperty(value = "per_page")
    private String perPage;
    @JsonProperty(value = "previous_page")
    private String prevPage;
    @JsonProperty(value = "next_page")
    private String nextPage;
    @JsonProperty(value = "order_asc_desc")
    private String order;

}
