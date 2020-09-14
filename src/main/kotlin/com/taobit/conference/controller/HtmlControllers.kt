package com.taobit.conference.controller

import com.taobit.conference.Registration
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HtmlControllers {

    @GetMapping("/greeting")
    fun getGreeting(model: Model): String {
        model["message"] = "Tao"
        return "greeting"
    }

    @GetMapping("registration")
    fun getRegistration(@ModelAttribute registration: Registration) = "registration"

    @PostMapping("registration")
    fun addRegistration(@ModelAttribute registration: Registration): String {
        println("Registration : ${registration.name}")
        return "registration"
    }

}