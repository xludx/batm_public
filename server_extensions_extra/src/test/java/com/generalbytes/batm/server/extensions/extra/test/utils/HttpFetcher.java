package com.generalbytes.batm.server.extensions.extra.test.utils;

import org.apache.http.client.fluent.Request;

import java.io.IOException;

/**
 * @author ludx
 */
public class HttpFetcher {

    public String fetchAsString(String url) throws IOException {
        return Request.Get(url).execute().returnContent().asString();
    }
}
