package code.elif.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {
    @GetMapping("/hello")
    public String hello (Model model){
        model.addAttribute("user","Elif");
        log.info("model : {}",model);
        return "hello";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() is called.");
        return "This is a welcome message.";
    }
}
