package com.example_spring_kafka.spring_kafka_docker_int.Producer.Controller;

import com.example_spring_kafka.spring_kafka_docker_int.Producer.Service.WeatherProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class WeatherController {
    private final WeatherProducer weatherProducer;

    public WeatherController(WeatherProducer producer){
        this.weatherProducer=producer;
    }
    @GetMapping("/send-weather")
    public String sendMessageToTopic(){
        this.weatherProducer.writeMessage();
        return "Producer sent the weather!"+ LocalDateTime.now();
    }
}
