import java.util.Scanner;

public class practicequestion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a value");
        int n = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}