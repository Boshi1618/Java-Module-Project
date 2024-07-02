public class Race {
    int time = 24;
    String raceWinner = "";
    int topSpeed = 0;


    public void selectWinner(Car car) {
        if (car.speed * time == topSpeed) {
            raceWinner = raceWinner + " " + car.name;
        } else if (car.speed * time > topSpeed) {
            topSpeed = car.speed * time;
            raceWinner = car.name;
        }
    }
}
