package br.com.concrete.desafio.v2

import android.app.Application
import br.com.concrete.desafio.v2.module.KoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Always remember to start Koin on your Application Context
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(KoinModules().mainModules)
        }
    }
}