import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numberOfCars = 3;

        for (int i = 1; i < numberOfCars + 1; i++) {
            System.out.println("Введите название автомобиля №" + i);
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            while (true) {
                System.out.println("Какая скорость у автомобиля №" + i + "? Введите значение от 1 до 250");
                if (scanner.hasNextInt()) {
                    int speed = scanner.nextInt();
                    if ((speed > 0) && (speed <= 250)) {
                        Car car = new Car(name, speed);
                        Race.addCar(car);
                        break;
                    } else System.out.println("Число не входит в диапазон 1-250");
                } else {
                    System.out.println("Некорректный ввод числа");
                    scanner.next();
                }
            }
        }
        Race.printLeaders();
    }
}