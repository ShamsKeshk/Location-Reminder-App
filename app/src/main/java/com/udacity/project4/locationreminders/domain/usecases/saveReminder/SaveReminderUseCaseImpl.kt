package com.udacity.project4.locationreminders.domain.usecases.saveReminder

import com.udacity.project4.locationreminders.framework.repo.ReminderRepository
import com.udacity.project4.locationreminders.framework.model.ReminderDataItem

//Tested Correctly
class SaveReminderUseCaseImpl constructor(private val reminderRepository: ReminderRepository): SaveReminderUseCase {

    /**
     * Save the reminder to the data source
     */
    override suspend fun saveReminder(reminderDataItem: ReminderDataItem) {
        reminderRepository.saveReminder(reminderDataItem)
    }
}