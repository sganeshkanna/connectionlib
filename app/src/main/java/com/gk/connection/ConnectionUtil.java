package com.gk.connection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionUtil {

    public static boolean isNetworkAvailable(Context context){
        try {
            ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivity != null && connectivity.getAllNetworkInfo() != null) {
                for (NetworkInfo anInfo : connectivity.getAllNetworkInfo())
                    if (anInfo.getState() == NetworkInfo.State.CONNECTED)
                        return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
