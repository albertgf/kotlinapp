package com.bendroid.kotlinapp.domain

import com.bendroid.kotlinapp.data.ForecastRequest
import com.bendroid.kotlinapp.domain.mappers.ForecastDataMapper
import com.bendroid.kotlinapp.domain.model.ForecastList
import com.bendroid.kotlinapp.domain.model.Forecast as ModelForecast

/**
 * Created by albert on 05/09/2017.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}