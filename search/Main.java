package search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
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
