package lt.sdaacademy.object_oriented.room;

import java.util.Scanner;

public class RoomMainRefactored {
    public static void main(String[] args) {
        Room room = new Room();

        room.length = getRoomParameter("Iveskite kambario ilgi");
        room.width = getRoomParameter("Iveskite kambario ploti");
        System.out.println("Kambario plotas: " + calculateRoomSquare(room));
    }

    public static double getRoomParameter(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }

    public static double calculateRoomSquare(Room room) {
        return room.length * room.width;

    }
}
