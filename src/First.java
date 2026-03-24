import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("число a: ");
        int number1 = sc.nextInt();
        System.out.print("число b: ");
        int number2 = sc.nextInt();
        sc.close();

        //сравнение
        if (number1 > number2) {
            System.out.println("a > b");
        } else if (number1 < number2) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        //математические операции
        System.out.println("Сложение: " + (number1 + number2));
        System.out.println("Вычитание: " + (number1 - number2));
        System.out.println("Умножение: " + (number1 * number2));
        System.out.println("Деление: " + (double) number1 / number2);
        }

    }