package com.example_spring_kafka.spring_kafka_docker_int.Producer;

import com.example_spring_kafka.spring_kafka_docker_int.Producer.Data.Condition;
import com.example_spring_kafka.spring_kafka_docker_int.Producer.Data.Location;
import java.util.Random;

public class WeatherGenerator {
    private static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = new Random().nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    public Location randomLocation(){
        return randomEnum(Location.class);
    }

    public Condition randomCondition(){
        return randomEnum(Condition.class);
    }

    public int randomTemperature(){
        return new Random().nextInt(36);
    }
}
