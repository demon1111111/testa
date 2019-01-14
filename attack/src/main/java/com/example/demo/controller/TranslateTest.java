package com.example.demo.controller;

import com.example.demo.translateUtils.TransApi;
import net.sf.json.JSONObject;

public class TranslateTest {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20181227000252739";
    private static final String SECURITY_KEY = "VIy93w2H2P2yBeg9JWNt";

    public static void main(String[] args)  throws Exception{
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String query = "apple";
        String result = api.getTransResult(query, "en", "zh");

        JSONObject json = JSONObject.fromObject(result);
        String dst = json.getJSONArray("trans_result").getJSONObject(0).getString("dst");
        System.out.print(dst);
    }
}

