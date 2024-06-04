package com.zulfen.zulfchat.ui.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zulfen.zulfchat.common.Profile
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
// consider switching to MutableStateFlow?
class SharedViewModel @Inject constructor() : ViewModel() {


    private val _showProfile = MutableLiveData(false)
    val showProfile: LiveData<Boolean> = _showProfile

    // TODO: Don't test like this. Use unit testing in future.
    private val _currentProfile = MutableLiveData(Profile(UUID.randomUUID(), "John Doe"))
    val currentProfile: LiveData<Profile> = _currentProfile

    fun setProfile(profile: Profile) {
        _currentProfile.value = profile
    }

}

