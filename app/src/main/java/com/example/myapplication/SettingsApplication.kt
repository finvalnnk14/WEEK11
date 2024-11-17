package com.example.myapplication

import android.app.Application

class SettingsApplication : Application() {
    lateinit var settingsStore: SettingsStore
    override fun onCreate() {
        super.onCreate()
// Initialize the settings store
// The settings store is used to access the data store
        settingsStore = SettingsStore(this)
    }
}