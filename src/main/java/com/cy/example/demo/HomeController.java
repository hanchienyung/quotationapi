package com.cy.example.demo;

import hello.Quote;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

   @RequestMapping("/")
   public @ResponseBody String showIndex()
   {
       RestTemplate restTemplate = new RestTemplate();

       Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

       return quote.getValue().getQuote();
   }


}
