package search;

import java.util.Arrays;
import java.util.Scanner;

class Menu {

    public void showMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int num = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[num][3];
        System.out.println("Enter all people:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        Menu menu = new Menu();
        while (true) {
            menu.showMenu();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    System.out.println("\nEnter a name or email to search all suitable people.");
                    boolean flag = false;
                    String toFind = sc.nextLine().toLowerCase().trim();
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (arr[i][j].toLowerCase().contains(toFind)) {
                                if (!flag) {
                                    System.out.println("\nFound people:");
                                    flag = true;
                                }
                                System.out.println(Arrays.toString(arr[i]).replaceAll("\\[|\\]|\\,", "").strip());
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("No matching people found");
                    }
                    break;
                case 2:
                    System.out.println("=== List of people ===");
                    for (String[] str : arr) {
                        System.out.println(Arrays.toString(str).replaceAll("\\[|\\]|\\,", "").strip());
                    }
                    break;
                case 0:
                    System.out.println("\nBye!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("\nIncorrect option! Try again.");
            }
        }
    }
}
