package lt.sdaacademy.homeworks.HM2020_12_05.Exercise_3;

import lt.sdaacademy.homeworks.HM2020_12_05.Exercise_3.Country;

public class CountryMain {
    public static void main(String[] args) {
        Country[] countries = buildCountryArray();
        printLeastPollutedCountry(countries);
        System.out.println("Overall polluttion: " + overallPollution(countries));
        System.out.println("Average polluttion: " + averagePollution(countries));
        ;
    }

    public static Country[] buildCountryArray() {
        return new Country[]{
                new Country("Lithuania", 3, "transportation"),
                new Country("Germany", 5, "factories")
        };
    }

    public static void printLeastPollutedCountry(Country[] countries) {
        Country leastPollutedCountry = countries[0];

        for (int i = 0; i < countries.length; i++) {
            if (calculateCo2Emission(leastPollutedCountry) > calculateCo2Emission(countries[i])) {
                leastPollutedCountry = countries[i];
            }
        }
        System.out.println("Least polluted country: " + leastPollutedCountry.getName());
    }

    public static double calculateCo2Emission(Country country) {
        switch (country.getPollutionFactor()) {
            case "animal husbandry":
                return country.getCo2Emission() * 1.2;
            case "transportation":
                return country.getCo2Emission() * 0.9;
            case "factories":
                return country.getCo2Emission() * 1.4;
            default:
                return country.getCo2Emission();
        }
    }

    public static double overallPollution(Country[] countries) {
        double sumOfCo2Emission = 0;
        for (Country country : countries) {
            sumOfCo2Emission += calculateCo2Emission(country);
        }
        return sumOfCo2Emission;
    }

    public static double averagePollution(Country[] countries) {
        return overallPollution(countries) / countries.length;
    }
}
