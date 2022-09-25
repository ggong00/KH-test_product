package com.kh.demo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class CsrHomeController {

    @GetMapping
    public String home(){
        return "/csr_view/product_view";
    }
}
