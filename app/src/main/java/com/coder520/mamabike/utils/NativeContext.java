package com.coder520.mamabike.utils;

import android.content.Context;

/**
 * Created by yadong on 2017/8/3.
 */
public class NativeContext {
    /**
     * App context
     */
    private static Context sAppContext;

    /**
     * 得到 app context
     */
    public static Context getAppContext() {
        return sAppContext;
    }

    /**
     * Set the app context
     */
    static void setAppContext(Context appContext) {
        sAppContext = appContext;
    }
}
