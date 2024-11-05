public class Car {
    String name;
    int speed;
    int distance;

    public Car (String name, int speed){
        this.name = name;
        this.speed = speed;
        distance = speed * Race.hours;
    }
}
