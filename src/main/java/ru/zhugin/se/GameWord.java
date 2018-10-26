package ru.zhugin.se;

import java.util.Random;
import java.util.Scanner;

public class GameWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Я загадал слово, попробуй отгадать написав ответ ниже:");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int randWords = rand.nextInt(words.length);
        while (true) {
            int onOffProgramm = 1;
            System.out.println(words[randWords]);
            String str = scan.nextLine();
            if (str.equals(words[randWords])) {
                System.out.println(str + ", загаданное слово.");
                onOffProgramm = 0;
            } else {
                for (int x = 0; x < str.length(); x++) {
                    if (words[randWords].charAt(x) == str.charAt(x)) {
                        System.out.print(str.charAt(x));
                    } else {
                        System.out.print("#");
                    }
                }
                for (int y = str.length(); y < 15; y++) System.out.print("#");
            }
            System.out.println();
            if (onOffProgramm == 0) break;
        }
    }
}
