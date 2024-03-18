package com.zulfen.zulfchat.ui.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
// consider switching to MutableStateFlow?
class SharedViewModel @Inject constructor() : ViewModel() {

    private val _showProfile = MutableLiveData(false)
    val showProfile: LiveData<Boolean> = _showProfile

    private val _showCreateChat = MutableLiveData(true)
    val showCreateChat: LiveData<Boolean> = _showCreateChat

    fun updateScaffolding() {
        _showCreateChat.value = false
    }

}

