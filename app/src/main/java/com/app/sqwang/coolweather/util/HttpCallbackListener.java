package com.app.sqwang.coolweather.util;

/**
 * Created by WangShunQing on 2016/12/10.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
