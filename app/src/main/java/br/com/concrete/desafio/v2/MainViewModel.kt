package br.com.concrete.desafio.v2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {

    private val _mainLiveData = MutableLiveData<String>()
    val mainLiveData: LiveData<String> = _mainLiveData

    init {
        changeText()
    }

    private fun changeText() {
        _mainLiveData.value = Date().time.toString()
    }
}