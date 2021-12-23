package me.renespies.luftpost.application

import android.app.Application
import timber.log.Timber

class LuftpostApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}