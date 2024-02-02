package gr.hyphestus.hyphestuservice.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping
    fun root() : String = "redirect:/home"

    @GetMapping("/home")
    fun homePage() : String = "home.html"


}