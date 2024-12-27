import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ماشین حساب ساده");
        System.out.println("عملیات مورد نظر را وارد کنید: +, -, *, /");
        char operator = scanner.next().charAt(0);

        System.out.println("عدد اول را وارد کنید:");
        double num1 = scanner.nextDouble();

        System.out.println("عدد دوم را وارد کنید:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("نتیجه: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("نتیجه: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("نتیجه: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("نتیجه: " + result);
                } else {
                    System.out.println("تقسیم بر صفر ممکن نیست.");
                }
                break;
            default:
                System.out.println("عملیات نامعتبر است.");
        }

        scanner.close();
    }
}