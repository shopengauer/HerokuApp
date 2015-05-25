package com.vspavlov.herokuapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuAppApplication {



    @ModelAttribute(value = "var")
    public String attr(){
        return "Model attribute";
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "This is response body!!!";
    }

    @RequestMapping(value = "/index")
    public String index2(Model model){

        return "index";
    }




    public static void main(String[] args) {
        SpringApplication.run(HerokuAppApplication.class, args);
    }
}
