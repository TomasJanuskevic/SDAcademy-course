package lt.sdaacademy.object_oriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Room room = new Room();

        System.out.println("Iveskite kambario ilgi");
        room.length = scanner.nextDouble();

        System.out.println("Iveskite kambario ploti");
        room.width = scanner.nextDouble();

        System.out.println("Kambario plotas:" + calculateRoomSquare(room));
    }

    public static double calculateRoomSquare(Room room) {
        return room.length * room.width;
    }
}
