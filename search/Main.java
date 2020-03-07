package search;

import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println("\nEnter the number of search queries:");
        int numOfQueries = Integer.parseInt(sc.nextLine());
        while (numOfQueries-- > 0) {
            boolean flag = false;
            System.out.println("\nEnter data to search people:");
            String toFind = sc.nextLine();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j].equalsIgnoreCase(toFind)) {
                        if (!flag) {
                            System.out.println("\nFound people:");
                            flag = true;
                        }
                        System.out.println(Arrays.toString(arr[i]).replaceAll("\\[|\\]|\\,", "").strip());
                    }
                }
            }
            if (!flag) {
                System.out.println("No matching people found\n");
            }
        }
    }
}
