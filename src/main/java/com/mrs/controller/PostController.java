package com.mrs.controller;

import com.mrs.domain.Post;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by marus505 on 2017. 6. 1..
 */
@Controller
@EnableAutoConfiguration
public class PostController {

    @RequestMapping(value = "/post/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        model.addAttribute("post", new Post());
        return "new";
    }
}
