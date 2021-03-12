package com.example.kotlinflowtutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    lateinit var languagesData: LiveData<String>

    fun getLanguages(): Flow<String> {
        return flow {
            val languages = listOf(
                "Kotlin",
                "Javascript",
                "Dart",
                "GO",
                "Elixir",
                "Swift",
                "PHP"
            )

            for (language in languages) {
                emit(language)
                delay(1000L)
            }
        }
    }
}