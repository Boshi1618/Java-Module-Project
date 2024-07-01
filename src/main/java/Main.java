import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Race race = new Race();
        int carSpeed;

        while(cars.size() < 3) {
            System.out.println("Введите название машины под номером " + (cars.size() + 1) + ":");
            String carName = sc.next();
            System.out.println("Введите скорость машины под номером " + (cars.size() + 1) + ":");
            while (true) {
                if (sc.hasNextInt()) {
                    carSpeed = sc.nextInt();
                    if (carSpeed >= 0 && carSpeed <= 250) {
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