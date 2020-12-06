package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_1;

public class MobileMain {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("3310", "Nokia", 100.00);
        Mobile mobile2 = new Mobile("Mi", "Xiaomi", 200.20);
        Mobile mobile3 = new Mobile("Galaxy", "Samsung", 300.99);

        Mobile[] mobiles = {mobile1, mobile2, mobile3};
        mostExpensiveMobiles(mobiles);
    }

    public static void mostExpensiveMobiles(Mobile[] mobiles) {
        int highestPriceMobileIndex = 0;
        for (int i = 0; i < mobiles.length - 1; i++) {
            if (mobiles[i].getPrice() < mobiles[i + 1].getPrice()) {
                highestPriceMobileIndex = i + 1;
            }
        }
        System.out.printf("Model: %s, manufacturer: %s, price: %.2f",
                mobiles[highestPriceMobileIndex].getModel(),
                mobiles[highestPriceMobileIndex].getManufacturer(),
                mobiles[highestPriceMobileIndex].getPrice());
    }
}

