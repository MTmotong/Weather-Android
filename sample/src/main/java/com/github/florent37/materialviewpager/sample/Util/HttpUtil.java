package com.github.florent37.materialviewpager.sample.Util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dzy on 2017/7/19.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
