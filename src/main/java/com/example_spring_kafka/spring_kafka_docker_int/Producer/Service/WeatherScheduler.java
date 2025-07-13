package com.example_spring_kafka.spring_kafka_docker_int.Producer.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class WeatherScheduler {
    private final WeatherProducer weatherProducer;
    public WeatherScheduler(WeatherProducer weatherProducer) {
        this.weatherProducer = weatherProducer;
    }

    @Scheduled(fixedRate = 5000)
    public void sendWeatherPeriodically() {
        weatherProducer.writeMessage();
        System.out.println("Weather sent at: " + LocalDateTime.now());
    }
}
