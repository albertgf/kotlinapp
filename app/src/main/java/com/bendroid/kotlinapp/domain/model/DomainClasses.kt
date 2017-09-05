package com.bendroid.kotlinapp.domain.model

/**
 * Created by albert on 05/09/2017.
 */

data class ForecastList(val city: String, val country: String, private val dailyForecast: List<Forecast>) {

    val size: Int get() = dailyForecast.size

    operator fun get(position: Int): Forecast = dailyForecast[position]
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int, val iconUrl : String)
