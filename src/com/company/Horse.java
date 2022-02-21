package com.company;

public class Horse extends Animal {

    public Horse() {
    }

    public Horse(double weight, byte age, String color, String gender, String nickName) {
        super(weight, age, color, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", color='" + getColor() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
