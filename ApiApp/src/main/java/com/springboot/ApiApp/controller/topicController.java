package com.springboot.ApiApp.controller;

import com.springboot.ApiApp.data.Topics;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    @RequestMapping("/alltopics")
    public List<Topics> getAllTopics()
    {
        return Arrays.asList(
                new Topics("Spring", "Spring Framework", "Description"),
                new Topics("Spring1", "Spring Framework", "Description"),
                new Topics("Spring2", "Spring Framework", "Description")
        );
    }

}
