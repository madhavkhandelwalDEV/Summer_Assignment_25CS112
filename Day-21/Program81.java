import java.util.Scanner;

public class Program81 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        str = sc.nextLine();
        str = str.toUpperCase();
        System.out.println("Uppercase String = " + str);
        sc.close();
    }
}