package ru.zhugin.se;
import java.util.Random;
import java.util.Scanner;
public class GameNumbers
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        while (true){
            int onOffProgramm = 1;
            System.out.println("Я загадал число от 0 до 9, сможешь отгадать? У тебя есть 3 попытки");
            Random rand = new Random();
            int hiddenNumber = rand.nextInt(10);
            for(int x = 1; x < 4; x++) {
                System.out.println(x + " попытка:");
                int answer = scan.nextInt();
                System.out.println(compareNumber(answer, hiddenNumber));
                if (compareNumber(answer, hiddenNumber) == "Вы угадали!") x = 3;
                if (x == 3) {
                    System.out.println("Игра окончена! Хотите сыграть снова? (1 - да, 0 - нет)");
                    onOffProgramm = scan.nextInt();
                }
            }
            if (onOffProgramm == 0) break;
        }
    }
    public static String compareNumber(int answer, int hiddenNumber) {
        if (answer == hiddenNumber) return "Вы угадали!";
        if (answer < hiddenNumber) return "Загаданое число больше чем Вы написали";
        if (answer > hiddenNumber) return "Загаданное число меньше чем Вы написали";
        return "";
    }
}
