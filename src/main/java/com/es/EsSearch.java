package com.es;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;

public class EsSearch {

    private static TransportClient client = EsClient.getEsclient();

    public void SearchAll(){
        SearchRequestBuilder searchRequestBuilder = client.prepareSearch();

    }
}
