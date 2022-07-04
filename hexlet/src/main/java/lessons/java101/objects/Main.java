package lessons.java101.objects;

public class Main {

    public static void main(String[] args) {
        Instance car = new Instance();            // создаем ссылку в frame stack на инстанс в heap, int speed = 0;
        car.setSpeed(12);               // создаем в frame stack метод setSpeed и кладем в него переменную int newSpeed = 12

        Sum sum = new Sum();
        sum.execute();

    }

}
