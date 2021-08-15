package com.doubdou.homework.week02;

import okhttp3.OkHttpClient;

import java.io.IOException;

public class DemoRequest {

    public String getReq(String url){
        MyOkHttpClient myOkHttpClient =  new MyOkHttpClient();
        String resp;
        try{
            resp = myOkHttpClient.get(url);
            System.out.println("Receive: " +  resp);
            return resp;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
