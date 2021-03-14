package com.springboot.ApiApp.service;

import com.springboot.ApiApp.data.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService
{
    private List<Topics> topics = new ArrayList<>();

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
    public void updateTopic(Topics topic, String id)
    {
        for(int i=0;i<topics.size();i++)
        {
            if(topics.get(i).getId() == id )
            {
                topics.set(i,topic);
                return;
            }
        }
    }
    public void deleteTopic(Topics topic, String id)
    {
        topics.removeIf(t-> t.getId().equals(id));
    }
}
