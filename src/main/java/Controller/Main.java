package Controller;
import Distance.EditDistance;

import java.util.Scanner;

public class Main {
    static EditDistance editDistance = new EditDistance();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();

        System.out.print("Min distance is: " + editDistance.minDistance(word1, word2));
    }
}
