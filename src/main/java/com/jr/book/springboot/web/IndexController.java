package com.jr.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";  //뒤의 확장자는 알아서 지원해줌 머스테치 스타터 덕분.. .mustache
    }
}
