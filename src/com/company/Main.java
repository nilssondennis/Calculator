package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String userMenuInput = "";
        int userInt1 = 0;
        int userInt2 = 0;
        String userMethod = "";
        int sum = 0;

        // While
        while(!(userMenuInput.equals("4"))){
        // Meny
        System.out.println("Miniräknare");
        System.out.println("Välj ett av följande alternativ\n");

        System.out.println("1: Välj ett räknesätt: + eller - eller * eller /");
        System.out.println("2: Mata in två heltal");
        System.out.println("3. Gör uträkningen och skriv resultatet");
        System.out.println("4. Avsluta programmet");
        userMenuInput = myScanner.nextLine();

        // "Clear" the terminal (by writing 50 linebreaks)
            System.out.println("\n".repeat(60));

        switch(userMenuInput){
            case "1":
                System.out.println("Choose a method");
                userMethod = myScanner.nextLine();
                break;
            case "2":
                System.out.println("Please input 2 numbers");
                userInt1 = myScanner.nextInt();
                userInt2 = myScanner.nextInt();
                System.out.println("Thanks, you have chosen numbers: " + userInt1 + " " + userInt2);
                break;
            case "3":
                if(userMethod.equals("+")){
                    sum = userInt1 + userInt2;
                }else if(userMethod.equals("-")){
                    sum = userInt1 - userInt2;
                }else if (userMethod.equals("*")){
                    sum = userInt1 * userInt2;
                }else if (userMethod.equals("/")){
                    sum = userInt1 / userInt2;
                }
                System.out.println("The total value is: " + sum + "\n");
                break;
        }

        }


    }
}
