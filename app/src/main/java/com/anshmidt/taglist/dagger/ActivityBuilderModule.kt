package com.anshmidt.taglist.dagger

import com.anshmidt.taglist.view.ui.BaseActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun providesBaseActivity(): BaseActivity
}