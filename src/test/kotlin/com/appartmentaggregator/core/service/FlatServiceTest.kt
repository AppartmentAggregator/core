package com.appartmentaggregator.core.service

import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FlatServiceTest {
    @Autowired
    lateinit var flatService: FlatService
    @Test
    fun getFlats_checkFulfilmetn_notEmpty() {
        assert(!flatService.getFlats().isEmpty())
    }
}