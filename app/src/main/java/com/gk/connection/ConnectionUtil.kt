package com.gk.internetreceiver

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

open class ConnectionUtil {

    companion object {
        public fun isNetworkAvailable(context: Context): Boolean {
            try {
                val connectivity = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                if (connectivity != null && connectivity.allNetworkInfo != null) {
                    for (anInfo in connectivity.allNetworkInfo)
                        if (anInfo.state == NetworkInfo.State.CONNECTED)
                            return true
                }
            } catch (e: Exception) {
                e.printStackTrace()
                return false
            }

            return false
        }
    }

}
