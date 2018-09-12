package com.test.exam.realtimeairquality.connectmanage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class WifiNetworkManager {
    //Whether there is a Wi-Fi connection.
    private static boolean wifiConnected = false;
    //Whether there is a mobile connection.
    private static boolean mobileConnected = false;
    /**
     * Check whether the device is connected, and if so, whether the connection
     * is wifi or mobile (it could be something else).
     */
    private void checkNetworkConnection(Context context){
        ConnectivityManager connMgr =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
        if(activeInfo != null && activeInfo.isConnected()){
            wifiConnected = activeInfo.getType() == ConnectivityManager.TYPE_WIFI;
            mobileConnected = activeInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            if(wifiConnected){
                //wifi connect
            }else if(mobileConnected){
                //mobile connect
            }
        }else{
            //not network info
        }
    }

}
