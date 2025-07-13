package com.example_spring_kafka.spring_kafka_docker_int.Producer.Service;

import com.example_spring_kafka.spring_kafka_docker_int.Producer.POJO.WeatherData;
import com.example_spring_kafka.spring_kafka_docker_int.Producer.WeatherGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherProducer {
    private static final String TOPIC ="weather-topic";
    private final KafkaTemplate<String, WeatherData> kafkaTemplate;
    private final KafkaTemplate<String, String> kafkaTemplate2;
    private final WeatherGenerator weatherGenerator=new WeatherGenerator();
    public void writeMessage() {
        kafkaTemplate2.send("weather-topic", "test message");
        WeatherData data = new WeatherData(
                weatherGenerator.randomLocation(),
                weatherGenerator.randomCondition(),
                weatherGenerator.randomTemperature()
        );
        kafkaTemplate.send(TOPIC,data.getLocation().name(),data);
    }
}
