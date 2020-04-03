package com.example.coruotineretroit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coruotineretroit.R
import com.example.coruotineretroit.viewmodel.CountriesViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: CountriesViewModel
    private val countriesAdapter = CountryListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
