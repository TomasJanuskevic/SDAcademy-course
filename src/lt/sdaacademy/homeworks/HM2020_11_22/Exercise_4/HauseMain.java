package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_4;

public class HauseMain {
    public static void main(String[] args) {
        House house1 = new House(100, "Vilnius", 2020, "fitted");
        House house2 = new House(150, "Kaunas", 2017, "not finished");
        House house3 = new House(120, "Klaipeda", 2018, "partially");

        House[] houses = {house1, house2, house3};
        newestHouse(houses);
        fittedHouse(houses);
        smallestArea(houses);
    }

    public static void newestHouse(House[] house) {
        int newestHouseIndex = 0;
        for (int i = 0; i < house.length - 1; i++) {
            if (house[i + 1].getBuiltYear() > house[i].getBuiltYear()) {
                newestHouseIndex = i + 1;
            }
        }
        System.out.println("Newest house: " + house[newestHouseIndex]);
    }

    public static void fittedHouse(House[] house) {
        for (House houses : house) {
            if (houses.getCondition().equals("fitted")) {
                System.out.println("Fitted house: " + houses);
            }
        }
    }

    public static void smallestArea(House[] house) {
        int smallestArea = house[0].getHouseArea();
        for (int i = 0; i < house.length - 1; i++) {
            if (house[i + 1].getHouseArea() < smallestArea) {
                smallestArea = house[i + 1].getHouseArea();
            }
        }
        for (House houses : house) {
            if (houses.getHouseArea() == smallestArea) {
                System.out.println("House with smallest area: " + houses);
            }
        }
    }
}
