import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sira, minSay = 0, maxSay = 0;

        System.out.print("Lütfen bir rakam giriniz :");
        sira = input.nextInt();

        for (int i = 1; i <= sira; i++) {
            System.out.print("Numara girin : ");
            n = input.nextInt();

            if (i == 1) {
                minSay = n;
                maxSay = n;
            }
            if (minSay > n) {
                minSay = n;
            }
            if (maxSay < n){
                maxSay = n;
            }

        }
        System.out.println("Minimum Değer : " + minSay);
        System.out.println("Maximum Değer : " + maxSay);
    }
}
