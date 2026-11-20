package com.example.cursoralign

import android.content.Context
import android.content.SharedPreferences

object Prefs {

    private const val PREF_NAME = "cursor_align_prefs"
    private const val KEY_ENABLED = "cursor_align_enabled"

    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun isEnabled(): Boolean {
        return prefs.getBoolean(KEY_ENABLED, false)
    }

    fun setEnabled(value: Boolean) {
        prefs.edit().putBoolean(KEY_ENABLED, value).apply()
    }
}
