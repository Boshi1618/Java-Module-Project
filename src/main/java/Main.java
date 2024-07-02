import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Race race = new Race();
        int carSpeed;
        int minCarSpeed = 0;
        int maxCarSpeed = 250;
        int countCar = 3;

        while (cars.size() < countCar) {
            System.out.println("Введите название машины под номером " + (cars.size() + 1) + ":");
            String carName = sc.next();
            System.out.println("Введите скорость машины под номером " + (cars.size() + 1) + ":");
            while (true) {
                if (sc.hasNextInt()) {
                    carSpeed = sc.nextInt();
                    if (carSpeed >= minCarSpeed && carSpeed <= maxCarSpeed) {
                        Car car = new Car(carName, carSpeed);
                        cars.add(car);
                        race.selectWinner(car);
                    } else {
                        System.out.println("Введена некорректная скорость. Введите заново: ");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Введена некорректная скорость. Введите заново: ");
                    sc.next();
                }
            }
        }

        System.out.println("Участники гонки:");
        for (Car car : cars) {
            System.out.println("Первая машина: " + car.name + "\nСкорость:" + car.speed);
        }

        System.out.println("Самая быстрая машина(-ы): " + race.raceWinner);
    }
}
