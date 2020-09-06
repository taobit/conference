package com.taobit.conference.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlControllers {

    @GetMapping("/greeting")
    fun getGreeting(model: Model): String {
        model["message"] = "Tao"
        return "greeting"
    }
}