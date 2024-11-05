import java.util.ArrayList;

public class Race {
    public static ArrayList<Car> cars = new ArrayList<>();
    public static int leaderDistance = 0;
    public static int hours = 24;
    public static void addCar(Car car){
        if ((car.distance) >= (leaderDistance)){
            cars.add(0,car); //лучший результат добавляем в начало
        }   else {
            cars.add(car);
            }
    }
    public static void printLeaders(){
        System.out.println("Лучший результат:");
        System.out.println("Машина " + cars.get(0).name);
        for (int i = 1; i < cars.size(); i++){
            if (cars.get(i).distance == cars.get(0).distance){
                System.out.println("Машина " + cars.get(i).name);
            }
        }
    }
}


