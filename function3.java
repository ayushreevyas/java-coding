import java.util.*;
public class function3 {
    public static int calculateProduct(int a , int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        int Product = calculateProduct(a , b);
        System.out.println("The product of 2 number is :"+ calculateProduct(a, b));
    }
}
