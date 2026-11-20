package com.example.cursoralign

import android.graphics.Rect

object Config {

    // Detection processing width.
    // Lower = faster but less accurate.
    // Higher = more accurate but slower.
    const val PROCESS_WIDTH = 640

    // Confidence thresholds.
    // 0.0 to 1.0.
    // Increase if false detection happens.
    // Decrease if target not detected.
    const val TARGET_THRESHOLD = 0.72
    const val ACTIVE_THRESHOLD = 0.75

    // If trigger active state is detected, but normal state matches much stronger,
    // then ignore active.
    const val NORMAL_ACTIVE_MARGIN = 0.03

    // Cursor deadzone.
    // If target is inside this distance from cursor, no swipe will be done.
    const val DEADZONE = 24

    // Swipe control.
    const val SWIPE_INTERVAL_MS = 250L
    const val SWIPE_DURATION_MS = 120

    // Swipe distance factor.
    // 0.5 means swipe half of the error distance.
    const val SWIPE_FACTOR = 0.55f

    // IMPORTANT:
    // If swipe direction is opposite, change this to false.
    //
    // true:
    //   Swipe away from target.
    //   Useful when screen content follows finger drag.
    //
    // false:
    //   Swipe from target to cursor.
    const val SWIPE_MODE_AWAY_FROM_TARGET = true

    // If your trigger button is fixed, set its screen area here.
    // Example:
    // val TRIGGER_ROI: Rect? = Rect(100, 1500, 300, 1700)
    //
    // Currently null means full screen search.
    val TRIGGER_ROI: Rect? = null
}
