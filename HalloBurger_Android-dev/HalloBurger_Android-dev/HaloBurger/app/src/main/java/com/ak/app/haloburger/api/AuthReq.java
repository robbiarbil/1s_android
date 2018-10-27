package com.ak.app.haloburger.api;

import com.google.gson.Gson;

/**
 * Created by el on 04/06/18.
 */

public class AuthReq extends RelevantApi {
    private String auth_token;

    public AuthReq(){

    }

    public String toJson() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }
}
