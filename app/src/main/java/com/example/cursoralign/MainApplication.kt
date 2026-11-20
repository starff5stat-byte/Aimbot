package com.example.cursoralign

import android.app.Application
import org.opencv.android.OpenCVLoader

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Prefs.init(this)

        try {
            OpenCVLoader.initLocal()
        } catch (_: Exception) {
        }
    }
}
