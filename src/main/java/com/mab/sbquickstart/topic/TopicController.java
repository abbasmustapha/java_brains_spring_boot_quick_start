package com.mab.sbquickstart.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return Arrays.asList(
                new Topic("premier","first","un"),
                new Topic("second","second","deux"),
                new Topic("troisieme","third","trois"),
                new Topic("quatrieme","fourth","quatre")
        );
    }


}
