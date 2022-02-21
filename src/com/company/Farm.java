package com.company;

public class Farm {

    private String address;
    private int cows;
    private int horses;
    private int sheep;
    private String ownerName;
    private Animal[] animals;

    public Farm() {
    }

    public Farm(String address, String ownerName, Animal[] animals) {
        this.address = address;
        this.ownerName = ownerName;
        this.animals = animals;

        setCows();
        setHorses();
        setSheep();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    private void setCows() {
        for (Animal animal : animals) {
            if (animal.getClass().equals(Cow.class)) {
                this.cows++;
            }
        }
    }

    public int getHorses() {
        return horses;
    }

    private void setHorses() {
        for (Animal animal : animals) {
            if (animal.getClass().equals(Horse.class)) {
                this.horses++;
            }
        }
    }

    public int getSheep() {
        return sheep;
    }

    private void setSheep() {
        for (Animal animal : animals) {
            if (animal.getClass().equals(Sheep.class)) {
                this.sheep++;
            }
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
