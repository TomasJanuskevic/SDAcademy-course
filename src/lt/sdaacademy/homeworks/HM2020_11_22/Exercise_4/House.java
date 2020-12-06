package lt.sdaacademy.homeworks.HM2020_11_22.Exercise_4;

public class House {
    private int houseArea;
    private String district;
    private int builtYear;
    private String condition;

    House(int houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        if (condition.equals("fitted") || condition.equals("partially") ||
                condition.equals("finished") || condition.equals("not finished")) {
            this.condition = condition;
        } else {
            System.out.println("Wrong condition declaration");
        }


    }

    public int getHouseArea() {
        return houseArea;
    }

    public String getDistrict() {
        return district;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public String getCondition() {
        return condition;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea = houseArea;
    }

    public void setCondition(String condition) {
        if (condition.equals("fitted") || condition.equals("partially") ||
                condition.equals("finished") || condition.equals("not finished")) {
            this.condition = condition;
        } else {
            System.out.println("Wrong condition declaration");
        }
    }

    public String toString() {
        return "district: " + district + ", house area: " + houseArea +
                ", built year: " + builtYear + ", condition: " + condition;
    }
}
