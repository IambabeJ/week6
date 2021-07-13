package com.judy.JudyContactApp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.judy.JudyContactApp.models.Contact
import com.judy.JudyContactApp.models.ContactDatabase

class MainActivityViewModel : ViewModel() {

     val contactLiveData = MutableLiveData<List<Contact>>()

    fun getContact(database: ContactDatabase) {
        contactLiveData.postValue(database.contactDao().getAllContact())
    }

    fun addContact(database: ContactDatabase, contact: Contact) {
        database.contactDao().addContact(contact)
        getContact(database)
    }
}