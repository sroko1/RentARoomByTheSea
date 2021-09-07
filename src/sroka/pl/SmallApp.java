package sroka.pl;

import java.util.Scanner;

public class SmallApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select name of the room");
        Room room = new Room(scanner.nextLine());
    }
}
