package com.bendroid.kotlinapp.domain
/**
 * Created by albert on 05/09/2017.
 */
interface Command<out T> {
    fun execute(): T
}
