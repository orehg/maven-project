package serialization_deserialization;


public class Main {
    public static void main(String[] args) {
        String pathForCar = "src/test/resources/car.txt";
        String pathForStudent = "src/test/resources/student.txt";

        Student vasya = new Student(17, "Vasya");
        Car bmw = new Car(10, "BMW");

        SerializeUtils.serialize(vasya, pathForStudent);
        SerializeUtils.serialize(bmw, pathForCar);
        Student oleg = DeserializeUtils.deserialize(pathForStudent);
        System.out.println(oleg);
        Car car = DeserializeUtils.deserialize(pathForCar);
        System.out.println(car);

        FileUtils.deleteFile(pathForStudent);
        FileUtils.deleteFile(pathForCar);
    }
}