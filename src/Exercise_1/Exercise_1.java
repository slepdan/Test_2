package Exercise_1;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visoc(n);
    }
    public static int visoc(int n){
    boolean a = ((n % 400 == 0) ||
                    (n % 4 == 0 && n % 100 !=0 ));
        System.out.print(n + " высокосный год?");
        if(a) {
            System.out.println(" > YES");
        }
        else System.out.println(" > NO");
        return n;
    }
}
