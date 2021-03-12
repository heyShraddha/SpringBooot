package com.springboot.ApiApp.service;

import com.springboot.ApiApp.data.Topics;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class topicService
{
    private List<Topics> topics = Arrays.asList(
        new Topics("Spring", "Spring Framework", "Description"),
                new Topics("Spring1", "Spring Framework1", "Description1"),
                new Topics("Spring2", "Spring Framework2", "Description2"));

    public List<Topics> getAllTopics()
    {
        return topics;
    }

    public Topics getTopic(String topicId)
    {
        return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
    }
    public void addTopic(Topics topic)
    {
        topics.add(topic);
    }
}
