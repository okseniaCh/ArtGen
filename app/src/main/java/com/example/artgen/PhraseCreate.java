package com.example.artgen;

public class PhraseCreate {
    public static void generatePhrase (String[] args) {
        String[] listOne = {"Кот", "Девочка", "Хомячок", "Альпака", "Локи", "Мастер"};

        String[] listTwo = {"спит", "сидит", "бежит", "скучает", "злится", "смеется"};

        String[] listThree = {"на завневаной планете", "вечером", "на улице", "во время дождя", "в магазине", "смотря в зеркало"};

        int oneLength = listOne.length;
        int twoLength = listTwo.length;
        int threeLength = listThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase1 = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];
        String phrase2 = listOne[rand1] + " " + listTwo[rand2];

        String[] phraseOut = {phrase1, phrase2};
        int phraseLength = phraseOut.length;
        int randOut = (int) (Math.random() * phraseLength);
        System.out.println(phraseOut[randOut]);

    }
}
