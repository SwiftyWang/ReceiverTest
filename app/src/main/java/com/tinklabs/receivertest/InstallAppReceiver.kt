package com.tinklabs.receivertest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

/**
 * Created by swifty on 27/10/2016.
 */
class InstallAppReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("HandyDebug","receiver launcher broadcast")
        Toast.makeText(context, "test app receiverd the launcher broadcast", Toast.LENGTH_SHORT).show()
    }
}