package search;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int num = Integer.parseInt(sc.nextLine());
        String[][] arr = new String[num][3];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        System.out.println("Enter the number of search queries:");

        String toFind = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(toFind)) {
                System.out.println(i + 1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }

    }
}
