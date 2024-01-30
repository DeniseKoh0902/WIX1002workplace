/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2022;

/**
 *
 * @author Asus
 */
import java.util.Random;
public class OrganiseMethodQ1_2022 {
    public static void main(String[] args) {
        // Task 1: Generate 3 random price values (100.00-300.00) and display in two decimal places
        System.out.print("3 random price values: ");
        for (int i = 0; i < 3; i++) {
            double randomPrice = getRandomDouble(100.00, 300.00);
            System.out.printf("%.2f ", randomPrice);
        }
        System.out.println();

        // Task 2: Generate 5 random even-numbered years (1990-2030) and display the years
        System.out.print("5 random even-numbered years: ");
        for (int i = 0; i < 5; i++) {
            int randomYear = getRandomEvenYear(1990, 2030);
            System.out.print(randomYear + " ");
        }
        System.out.println();

        // Task 3: Generate 1 random car plate number and display the car plate number
        System.out.print("Car Plate Number: ");
        String randomCarPlate = generateRandomCarPlate();
        System.out.println(randomCarPlate);

        // Task 4: Generate 1 random word and display the word
        System.out.print("Random Word: ");
        String randomWord = generateRandomWord();
        System.out.println(randomWord);
    }

    // Helper method to generate a random double within a specified range
    private static double getRandomDouble(double min, double max) {
        Random random = new Random();
        return  random.nextDouble(max-min+1)+min;
    }

    // Helper method to generate a random even-numbered year within a specified range
    private static int getRandomEvenYear(int min, int max) {
        Random random = new Random();
        int randomYear = random.nextInt((max - min) / 2 + 1) * 2 + min;
        return randomYear;
    }

    // Helper method to generate a random car plate number
    private static String generateRandomCarPlate() {
        Random random = new Random();
        int randomDigits = random.nextInt(90000) + 10000; // 5 random digits
        String randomLetters = getRandomLetters(2); // 2 random uppercase letters
        return randomDigits + randomLetters;
    }

    // Helper method to generate a random string of uppercase letters
    private static String getRandomLetters(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomLetter = (char) (random.nextInt(26) + 'A');
            sb.append(randomLetter);
        }
        return sb.toString();
    }

    // Helper method to generate a random word
    private static String generateRandomWord() {
        Random random = new Random();
        int wordLength = random.nextInt(8) + 1; // Maximum 8 characters
        StringBuilder sb = new StringBuilder(wordLength);
        for (int i = 0; i < wordLength; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        return sb.toString().toUpperCase(); // Convert the word to uppercase
    }
}