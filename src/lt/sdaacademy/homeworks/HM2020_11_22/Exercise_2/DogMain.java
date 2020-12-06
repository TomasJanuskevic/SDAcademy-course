package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_2;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Reks", 4, "Brown");
        Dog dog2 = new Dog("Bennie", 7, "Grey");
        Dog dog3 = new Dog("Jack", 5, "Black");

        Dog[] dogArray = {dog1, dog2, dog3};
        oldestDog(dogArray);
        System.out.printf("Average dogs age: %.2f\n", averageAgeOfDogs(dogArray));
    }

    public static void oldestDog(Dog[] dog) {
        int oldestDog = dog[0].getAge();
        for (int i = 0; i < dog.length - 1; i++) {
            if (dog[i + 1].getAge() > oldestDog) {
                oldestDog = dog[i + 1].getAge();
            }
        }
        for (Dog dogs : dog) {
            if (dogs.getAge() == oldestDog) {
                System.out.println("Eldest dog name: " + dogs.getName());
            }
        }
    }

    public static double averageAgeOfDogs(Dog[] dog) {
        int sumOfDogsAge = 0;
        for (Dog dogs : dog) {
            sumOfDogsAge += dogs.getAge();
        }
        return (double) sumOfDogsAge / dog.length;
    }
}
