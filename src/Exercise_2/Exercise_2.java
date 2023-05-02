package Exercise_2;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        del(i = sc.nextInt());
    }
    public static int del(int del) {
        int i = 2;
        while (del % i != 0) {
            i++;
        }
        System.out.println(i);
        return i;
    }
}
