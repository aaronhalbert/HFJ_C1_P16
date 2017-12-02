package com.company;

public class Main {

    public static void main(String[] args) {
        String[] wordListOne = {"Red", "Yellow", "Blue"};
        String[] wordListTwo = {"Dog", "Cat", "Squirrel"};
        String[] wordListThree = {"Ears", "Paws", "Fur"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);
    }
}
