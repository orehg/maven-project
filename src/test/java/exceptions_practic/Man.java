package exceptions_practic;

import java.util.Objects;

public class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age < 0 || age > 120){
            throw new AgeException("Age is incorrect");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
