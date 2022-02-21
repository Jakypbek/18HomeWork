package com.company;

public class Main {

    public static void main(String[] args) {

        Farm farm1 = new Farm("Bishkek", "Huan", new Animal[] {
                new Sheep(15.3, (byte) 1, "Male", "Shypy"),
                new Sheep(30.1, (byte) 3, "Male", "Faty"),
                new Sheep(10.9, (byte) 1, "Female", "Little"),
                new Cow(43.3, (byte) 4, "Male", "Cow1"),
                new Cow(28.3, (byte) 2, "Female", "Cow2"),
                new Cow(35.7, (byte) 1, "Male", "Cow3"),
                new Cow(24.6, (byte) 3, "Male", "Cow4"),
                new Cow(41.5, (byte) 4, "Male", "Cow6"),
                new Horse(109.3, (byte) 6, "Black", "Male", "BlackFash"),
                new Horse(95.5, (byte) 4, "brown", "Female", "BarryAllen")

        });

        Farm farm2 = new Farm("Italy", "Oleg", new Animal[] {
                new Sheep(19.3, (byte) 2, "Male", "Sheport"),
                new Cow(45.2, (byte) 5, "Male", "CowBoy"),
                new Horse(91.9, (byte) 5, "White", "Female", "Whity")
        });

        System.out.println(farm1);

        System.out.println(farm2);
    }
}
