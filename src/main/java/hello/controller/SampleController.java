package hello.controller;

import hello.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan("hello.service")
public class SampleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    String home(Model model){
        model.addAttribute("people", personService.findAllPeople());
        return "sample";
    }
}