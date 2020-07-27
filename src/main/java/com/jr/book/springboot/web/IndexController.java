package com.jr.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor //서비스를 autowired 없이 생성자를 통해 의존성 주입을 해주게 해줌
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";  //뒤의 확장자는 알아서 지원해줌 머스테치 스타터 덕분.. .mustache
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


}
