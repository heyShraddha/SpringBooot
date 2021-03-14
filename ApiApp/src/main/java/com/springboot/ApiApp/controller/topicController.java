package com.springboot.ApiApp.controller;

import com.springboot.ApiApp.data.Topics;
import com.springboot.ApiApp.service.topicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    private com.springboot.ApiApp.service.topicService topicService;

    public topicController(topicService topicService) {
        this.topicService = topicService;
    }

    //by default get request is called
    @RequestMapping("/topics")
    public List<Topics> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    // explicit mention for post request
    @RequestMapping(method = RequestMethod.POST,value ="/topics")
    public void addTopic(@RequestBody Topics topic)
    {
        topicService.addTopic(topic);
    }
    // explicit mention for post request
    @RequestMapping(method = RequestMethod.PUT,value ="/topics/{id}")
    public void updateTopic(@RequestBody Topics topic,@PathVariable String id )
    {
        topicService.updateTopic(topic,id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value ="/topics/{id}")
    public void deleteTopic(@RequestBody Topics topic,@PathVariable String id )
    {
        topicService.deleteTopic(topic,id);
    }

}
