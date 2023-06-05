package com.nikhil.jpmcassessment.ui.screens.home

import com.nikhil.jpmcassessment.data.model.WeatherResponse

// class to handle state of api result
data class HomeState(
    val isLoading: Boolean = false,
    val data: WeatherResponse? = null,
    val error: String = ""

)
