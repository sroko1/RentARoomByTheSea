package sroka.pl;


/** Let's simplify the problem to the possibility of renting a room from P1 to P2 with the rental table
 * where rental [i] = 1 means that on i the room is already rented, and 0 means that it is not. Function // method checkAPeriod (int P1, int P2)
 * returns true if the room can be rented from P1 to P2 (returns false if it cannot be rented), and the Rent method (int P1, int P2) is rented
 * room (writes 1 in the rental table in the appropriate positions)
 */
public class Room {

    private int[]rental;
    private final int numberOfDaysInAYear = 365;
    private String name;

    public Room(String name){
        this.name = name;

        rental = new int[numberOfDaysInAYear];
    }

    /**
     * The method checks if the room is free from P1 to P2
     * @param P1 the beginning of the checked date
     * @param P2 the end of the checked date
     */

    public Boolean checkAPeriod (int P1, int P2){
        for (int i = P1; i<= P2; i++){
            if (rental[i] == 1)
                return false;
        }
        return true;
    }

    public void getRoomStatusInSpecifiedPeriod(int P1, int P2){
        for (int i = P1; i <= P2; i++){
            if (rental[i] == 1)
                System.out.println( i + " occupied");
            else
                System.out.println(i + " free");
        }
    }

    public void cancelBooking(int P1, int P2){
        for (int i = P1; i<= P2; i++){
            rental[i] = 0;
        }
    }
    public void  rentInPeriod(int P1, int P2){
        if(!checkAPeriod(P1, P2)){
            System.out.println("The room is occupied on this date");
        }else {
            System.out.println("Room is already booked");
            for (int i = P1; i<= P2; i++){
                rental[i] = 1;
            }
        }

    }
}
