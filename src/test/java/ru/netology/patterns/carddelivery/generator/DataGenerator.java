package ru.netology.patterns.carddelivery.generator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

public class DataGenerator {
    private DataGenerator() {
    }
    static Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(int addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String generateName() {
        return faker.name().name();
    }

    public static String generatePhoneNumber() {
        return faker.numerify("+###########");
    }

    public static String generateCity() {
        var cities = new String[]{
                "Ростов-на-Дону", "Томск", "Ульяновск", "Архангельск", "Йошкар-Ола", "Великий Устюг"
        };
        return cities[new Random().nextInt(cities.length)];
    }
}