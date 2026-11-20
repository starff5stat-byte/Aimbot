package com.example.cursoralign

import android.graphics.Point

object AppState {
    var enabled: Boolean = false
    var triggerActive: Boolean = false
    var targetPoint: Point? = null

    var screenW: Int = 0
    var screenH: Int = 0

    var cursorX: Int = 0
    var cursorY: Int = 0

    var floatingServiceRunning: Boolean = false
    var screenCaptureServiceRunning: Boolean = false
}
