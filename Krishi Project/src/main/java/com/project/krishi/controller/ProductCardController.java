package com.project.krishi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductCardController {
    @GetMapping("/productcard")
    public String productcardPage() {
        return "productcard";
    }
}
