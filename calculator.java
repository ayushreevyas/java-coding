import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired operation");
        int input = sc.nextInt();
        System.out.println("Enter value of a ");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        switch (input) {
            case 1:
                int sum = a + b;
                System.out.println("the sum is :" + sum);
                break;
            case 2:
                int diff = a - b;
                System.out.println("the diff is:" + diff);

                break;
            case 3:
                int mul = a * b;
                System.out.println("the mul is :" + mul);

                break;
            case 4:
                int div = a / b;
                System.out.println("the div is :" + div);

                break;
            case 5:
                int rem = a % b;
                System.out.println("the rem is:" + rem);

                break;
            default:
                System.out.println("invalid operation");
        }
    }
}
