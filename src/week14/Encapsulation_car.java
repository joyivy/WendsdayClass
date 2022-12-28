package week14;

public class Encapsulation_car {

    private String color, model,make;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Encapsulation_car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }

    public Encapsulation_car(String color, String model, String make, int year) {
        setColor(color);
        setModel(model);
        setMake(make);
        setYear(year);


    }
}
