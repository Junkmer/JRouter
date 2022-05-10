package com.junker.jrouter;

import android.app.Application;
import android.content.Context;

import com.junker.library.jrouter.JRouter;

public class DemoApplication extends Application {

    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        JRouter.init(context);
    }
}
