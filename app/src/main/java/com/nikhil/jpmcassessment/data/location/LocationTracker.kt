package com.nikhil.jpmcassessment.data.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}