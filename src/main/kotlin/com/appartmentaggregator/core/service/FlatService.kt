package com.appartmentaggregator.core.service

import com.appartmentaggregator.core.model.Flat
import org.springframework.stereotype.Service

@Service
class FlatService {

    fun getFlats(): List<Flat> {
        val flats = ArrayList<Flat>()
        flats.add(Flat("TestName", "TestDescription", "Test St.", 100))
        return flats
    }
}