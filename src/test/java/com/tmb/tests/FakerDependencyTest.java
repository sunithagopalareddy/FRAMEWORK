package com.tmb.tests;

import com.github.javafaker.Faker;

public class FakerDependencyTest {

    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        System.out.println("faker.superhero().name() = " + faker.superhero().name());
        System.out.println("faker.number().numberBetween(20,99) = " + faker.number().numberBetween(20, 99));
        System.out.println("faker.idNumber().ssnValid() = " + faker.idNumber().ssnValid());
        System.out.println("faker.idNumber() = " + faker.idNumber());
    }
}
