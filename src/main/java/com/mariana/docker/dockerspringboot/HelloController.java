package com.mariana.docker.dockerspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String control(@RequestParam(name="name", required=false, defaultValue="somename") String name, Model model) {
        model.addAttribute("name", name);
        return "controller";
    }

}
