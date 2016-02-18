import java.util.Scanner;

public class HelloJava2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter something\n> ");
        System.out.println(keyboard.nextLine());
    }
}
