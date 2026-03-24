import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("строка 1:");
        String str1 = sc.nextLine();
        System.out.println("строка 2:");
        String str2 = sc.nextLine();
        sc.close();

        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        }else {
            System.out.println("Строки неидентичны");
        }
    }
}
