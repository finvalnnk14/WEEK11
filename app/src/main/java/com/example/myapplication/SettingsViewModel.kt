package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SettingsViewModel(private val settingsStore: SettingsStore) :
    ViewModel() {

    private val _textLiveData = MutableLiveData<String>()
    val textLiveData: LiveData<String> = _textLiveData
    init {

        viewModelScope.launch {
            settingsStore.text.collect {
                _textLiveData.value = it
            }
        }
    }
    // Save the text to the data store
    fun saveText(text: String) {

        viewModelScope.launch {
            settingsStore.saveText(text)
        }
    }
}