import java.util.Scanner;

public class funcSumOdd {
    public static void oddNum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum os All odd Number is: " + sum);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        num = sc.nextInt();

        oddNum(num);
    }
}