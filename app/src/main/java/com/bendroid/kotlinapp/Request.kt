package com.bendroid.kotlinapp

import android.util.Log
import java.net.URL

/**
 * Created by albert on 05/09/2017.
 */
class Request(private val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d (javaClass.simpleName, forecastJsonStr)
    }
}
