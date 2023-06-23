package com.nalandya.ppdbtracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.nalandya.ppdbtracker.model.ResponseSchool
import com.nalandya.ppdbtracker.network.API
import com.nalandya.ppdbtracker.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var api: API
    private var schoolOne: ResponseSchool? = null
    private var schoolTwo: ResponseSchool? = null
    private var schoolThree: ResponseSchool? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNetwork()
        callApi()
    }

    private fun setupNetwork() {
        api = RetrofitClient.getInstance().create(API::class.java)
    }

    private fun callApi() {
        lifecycleScope.launch(Dispatchers.IO) {
            val responseSchooleOne = api.getDataSchoolOne()
            val responseSchoolTwo = api.getDataSchoolTwo()
            val responseSchoolThree = api.getDataSchoolThree()
            if (responseSchooleOne.isSuccessful) {
                responseSchooleOne.body()?.let {
                    schoolOne = it
                }
            }
            if (responseSchoolTwo.isSuccessful) {
                responseSchoolTwo.body()?.let {
                    schoolTwo = it
                }
            }
            if (responseSchoolThree.isSuccessful) {
                responseSchoolThree.body()?.let {
                    schoolThree = it
                }
            }
        }

    }
}