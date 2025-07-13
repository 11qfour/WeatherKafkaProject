package com.example_spring_kafka.spring_kafka_docker_int.Producer.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Slf4j
@Service
public class WeatherScheduler {
    private final WeatherProducer weatherProducer;
    public WeatherScheduler(WeatherProducer weatherProducer) {
        this.weatherProducer = weatherProducer;
    }

    @Scheduled(fixedRate = 5000)
    public void sendWeatherPeriodically() {
        try {
            log.info("Weather sent at: " + LocalDateTime.now());
            weatherProducer.writeMessage();
        }
        catch (Exception e){
            log.error("Error sending weather data: " + e.getMessage());
        }
    }
}
