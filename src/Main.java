import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите число1:");
        float num1 = skan.nextFloat();
        System.out.println("Введите число2:" );
        float num2 = skan.nextFloat();
        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        float res5 = num1 % num2;
        System.out.println("Результат:" );
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 + "\n");
    }
}
