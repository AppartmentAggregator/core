package com.appartmentaggregator.core.controller

import com.appartmentaggregator.core.model.Flat
import com.appartmentaggregator.core.service.FlatService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FlatController @Autowired constructor(val flatService: FlatService) {
    @GetMapping("/flats")
    private fun getFlats(): List<Flat> {
        return flatService.getFlats()
    }
}