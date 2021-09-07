package sroka.pl;

import java.util.Scanner;

public class SmallApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select name of the room");
        Room room = new Room(scanner.nextLine());

        //room.rentInPeriod(9, 12);
        //room.getRoomStatusInSpecifiedPeriod(23, 30);


        boolean quit = false;

        do {
            System.out.println("OPTIONS : 0 - CHECK PERIOD, 1 - BOOKING, 2 - ROOM`S STATUS, 3 - CANCEL BOOKING,  4 - QUIT");
        int choice = scanner.nextInt(5);
            switch (choice) {
                case 0 -> {
                    System.out.println("SELECT BOOKING START DATE");
                    int firstDay = scanner.nextInt();
                    System.out.println("SELECT BOOKING END DATE");
                    int lastDay = scanner.nextInt();
                    if (room.checkAPeriod(firstDay, lastDay)) {
                        System.out.println("BOOKING IN PROGRESS");
                    } else
                        System.out.println("BOOKING REFUSED");
                }
                case 1 -> {
                    System.out.println("SELECT BOOKING START DATE");
                    int dayOne = scanner.nextInt();
                    System.out.println("SELECT BOOKING START DATE");
                    int dayTwo = scanner.nextInt();
                    room.rentInPeriod(dayOne, dayTwo);
                }
                case 2 -> {
                    System.out.println("TYPE START DATE");
                    int begDay = scanner.nextInt();
                    System.out.println("TYPE END DATE");
                    int finDay = scanner.nextInt();
                    room.getRoomStatusInSpecifiedPeriod(begDay, finDay);
                }
                case 3 -> {
                    System.out.println("TYPE START DATE");
                    int oneDay = scanner.nextInt();
                    System.out.println("TYPE END DATE");
                    int finalDay = scanner.nextInt();
                    room.cancelBooking(oneDay, finalDay);
                    System.out.println("Booking canceled");
                }
                case 4 -> quit = true;
            }
        }while (!quit);
        }
    }

