public class Car {

    String make;
    String model;
    int year;
    String color;
    int mileage;

    public Car(String make, String model, int year, String color, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
    @Override
    public boolean equals(Object object){
        Car car = (Car)object;
        if (this.make.equals(car.make) &&
                this.model.equals(car.model) &&
                this.year == car.year &&
                this.color.equals(car.color) &&
                this.mileage == mileage)  return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return make.hashCode() + model.hashCode() + year + color.hashCode() + mileage;
    }
}
