package com.smartconnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
   @RequestMapping("/home")
   public String home(Model model) {
      System.out.println("home page handler");

      //sending data to view
      model.addAttribute("name", "Akshat");
      model.addAttribute("designation", "Software Engineer");
      model.addAttribute("linkedin", "https://www.linkedin.com/in/akshat-nigam29");
      return "home";
   }

   @RequestMapping("/about")
   public String aboutPage() {
      return "about";
   }

   @RequestMapping("/services")
   public String servicesPage() {
      return "services";
   }

   @RequestMapping("/contacts")
   public String contactsPage() {
      return "contacts";
   }

   @RequestMapping("/login")
   public String loginPage() {
      return "login";
   }

   @RequestMapping("/register")
   public String registerPage() {
      return "register";
   }
}
