package com.cogitator.kotlincoroutines.helpers

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * @author Ankit Kumar on 03/09/2018
 */

fun launchCotrouine() {
    launch {
        // launch new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}