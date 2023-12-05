import java.beans.IntrospectionException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IntrospectionException {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();

        Book book1 = new Book(title, author, year);
        BookProcessor bookTwo = new BookProcessor(book1);
        Thread BookTwo = new Thread();
        BookTwo.start();
        BookTwo.interrupt();
    }
}