package com.example.lesson4_5

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ActivityViewModel: ViewModel() {

    private val repository = Repository()

    private var test = "test1"

    fun makeRequest(firstName: String, secondName: String): LiveData<CalculateModel> {
        return repository.makeRequest(firstName, secondName)

    }

    fun getTest(): String {
        return test
    }

    fun setTest(test: String) {
        this.test = test
    }
}