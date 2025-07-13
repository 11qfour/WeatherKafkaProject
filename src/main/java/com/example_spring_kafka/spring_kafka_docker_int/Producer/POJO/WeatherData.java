package com.example_spring_kafka.spring_kafka_docker_int.Producer.POJO;

import com.example_spring_kafka.spring_kafka_docker_int.Producer.Data.Condition;
import com.example_spring_kafka.spring_kafka_docker_int.Producer.Data.Location;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    private Location location;
    private Condition condition;
    private int temperature;
}
