package com.example_spring_kafka.spring_kafka_docker_int.Consumer;

import com.example_spring_kafka.spring_kafka_docker_int.Producer.POJO.WeatherData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherConsumer {
    @KafkaListener(topics="weather-topic", groupId = "weather_group_id")
    public void getMessage(WeatherData message){
        log.debug(String.valueOf((message)));
    }
}
