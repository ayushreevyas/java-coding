import java.util.Scanner;

public class mulfunctions {
    public static int calculateMul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        int mul = calculateMul(a, b);
        System.out.println("The mul of 2 number is: " + mul);
    }
}
