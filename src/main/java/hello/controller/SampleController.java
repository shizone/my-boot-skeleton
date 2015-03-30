package hello.controller;

import hello.entity.Person;
import hello.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@ComponentScan("hello.service")
public class SampleController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    String home(Model model){
        List<Person> people = personService.findAllPeople();
        log.info("People: " + people);
        model.addAttribute("people", people);
        return "sample";
    }

    @RequestMapping("/login")
    String login(Model model){
        return "login";
    }
}