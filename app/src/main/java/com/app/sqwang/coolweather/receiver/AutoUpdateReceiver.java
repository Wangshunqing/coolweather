package com.app.sqwang.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.app.sqwang.coolweather.service.AutoUpdateService;

/**
 * Created by WangShunQing on 2016/12/11.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
