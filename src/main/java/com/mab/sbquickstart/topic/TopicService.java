package com.mab.sbquickstart.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1premier","first","un"),
            new Topic("2second","second","deux"),
            new Topic("3troisieme","third","trois")
        );

    public List<Topic> getTopics(){
        return topics;
    }

}
