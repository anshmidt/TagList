package com.anshmidt.taglist

import android.app.Activity
import android.app.Application
import com.anshmidt.taglist.dagger.AppModule
import com.anshmidt.taglist.dagger.DaggerAppComponent
import com.anshmidt.taglist.dagger.DatabaseModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TagListApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .databaseModule(DatabaseModule())
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}