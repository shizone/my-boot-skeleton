package hello.controller;

import hello.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@ImportResource("applicationContext.xml")
@ComponentScan("hello.service")
public class SampleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    String home(Model model){
        model.addAttribute("name", personService.findPerson(1).getName());
        return "sample";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}