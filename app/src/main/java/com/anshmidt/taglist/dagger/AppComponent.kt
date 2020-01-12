package com.anshmidt.taglist.dagger

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
import dagger.BindsInstance




@Singleton
@Component(
        modules = [
                AndroidInjectionModule::class,
                AppModule::class,
                ActivityBuilderModule::class,
                DatabaseModule::class
        ]
)
interface AppComponent {

    fun inject(app: Application)
}