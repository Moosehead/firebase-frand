package com.tmfrand.app;
        import android.app.Application;
        import com.tmfrand.helper.MyPreferenceManager;
        import android.content.Context;
/**
 * Created by Soloman on 6/25/2016.
 */
public class MyApplication {
    public static final String TAG = MyApplication.class
            .getSimpleName();

    private static MyApplication mInstance;

    private MyPreferenceManager pref;


    public void onCreate() {
        mInstance.onCreate();
        mInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }


    public MyPreferenceManager getPrefManager() {
        if (pref == null) {
            pref = new MyPreferenceManager(this);

        }
        return pref;
    }
}
