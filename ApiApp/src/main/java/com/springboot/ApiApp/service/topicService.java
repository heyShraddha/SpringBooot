package com.springboot.ApiApp.service;

import com.springboot.ApiApp.data.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService
{
    //defining the list of Topics to perform add, delete and update operations
    private List<Topics> topics = new ArrayList<>();

    //function to get all the topics displayed
    public List<Topics> getAllTopics()
    {
        return topics;
    }

    //function to get a single topic through id
    public Topics getTopic(String topicId)
    {
        return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
    }

    //function to add a topic of Topic type to the list
    public void addTopic(Topics topic)
    {
        topics.add(topic);
    }

    //function to update a particular topic using id
    public void updateTopic(Topics topic, String id)
    {
        for(int i=0;i<topics.size();i++)
        {
            //comparison
            if(topics.get(i).getId() == id )
            {
                topics.set(i,topic);
                return;
            }
        }
    }

    //function to delete a particular topic using id
    public void deleteTopic(Topics topic, String id)
    {
        topics.removeIf(t-> t.getId().equals(id));
    }
}
