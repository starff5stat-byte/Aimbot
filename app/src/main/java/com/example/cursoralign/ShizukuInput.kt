package com.example.cursoralign

import rikka.shizuku.Shizuku

object ShizukuInput {

    fun swipe(x1: Int, y1: Int, x2: Int, y2: Int, durationMs: Int) {
        if (!Shizuku.pingBinder()) return

        val command = "input swipe $x1 $y1 $x2 $y2 $durationMs"

        Thread {
            try {
                Shizuku.newProcess(arrayOf("sh", "-c", command), null, null).waitFor()
            } catch (_: Exception) {
            }
        }.start()
    }
}
