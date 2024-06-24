package serialization_deserialization;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private int age;
    private String brand;
    private static final long serialVersionUID = 1;

    public Car(int age, String brand) {
        this.age = age;
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return age == car.age && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, brand);
    }

    @Override
    public String toString() {
        return "Car" +
                " age = " + age +
                ", brand = " + brand;
    }
}
