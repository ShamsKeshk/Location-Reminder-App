package com.udacity.project4.locationreminders.framework.di

import com.udacity.project4.locationreminders.framework.managers.GeofencingManager
import com.udacity.project4.locationreminders.framework.repo.RemindersRepositoryImpl
import com.udacity.project4.locationreminders.framework.managers.GeofencingManagerImpl
import com.udacity.project4.locationreminders.framework.repo.ReminderRepository
import kotlinx.coroutines.CoroutineDispatcher

import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

class FrameworkModule {

    companion object{

        fun provideFrameworkModule(): org.koin.core.module.Module{
            return module {
                single<CoroutineDispatcher> {
                    return@single Dispatchers.IO
                }
                single<ReminderRepository> {
                    return@single  RemindersRepositoryImpl(get(),get())
                }
                single<GeofencingManager> {
                    return@single  GeofencingManagerImpl(get())
                }
            }
        }
    }
}