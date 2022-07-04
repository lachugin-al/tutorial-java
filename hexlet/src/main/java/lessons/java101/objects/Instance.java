package lessons.java101.objects;

public class Instance {

    int speed;                          // создаст переменную в heap по ссылке car, int speed = 0; (поле класса)

    public void showSpeed() {
        System.out.println(this.speed);
    }   // создаем в frame stack метод showSpeed и выводим значение переменной int speed = 12

    public void setSpeed(int newSpeed) {        // создаем в frame stack метод setSpeed и кладем в него переменную int newSpeed = 12
        this.speed = newSpeed;                  // присваиваем значение переменной speed в heap = 12
        showSpeed();                            // вызываем метод showSpeed
        newSpeed = 8;                           // присваиваем значение newSpeed (она есть на стеке) = 8 (локальная переменная метода)
        speed = 3;                              // присваиваем значение speed (ее нет на стеке) this.speed = 3
        setSetSpeed(newSpeed);                  // создаем frame в stack и передаем значение 8
    }

    /*
    Важно понимать что при вызове метода, создается фрейм в стеке с переменными указанными в конструкторе при создании
    setSetSpeed(newSpeed); при вызове метода передаем на вход значение newSpeed = 8
    private void setSetSpeed(int speed) при создании фрейма создаем в стеке переменные полученные на вход speed = 8
     */

    private void setSetSpeed(int speed) {   // создаст frame в STACK с переменной speed = 8 (newSpeed)
        speed = speed;                  // заменит переменную в frame stack так как в stack она есть и он ее найдет первую
        System.out.println("speed: " + speed);
        System.out.println("this.speed: " + this.speed);
        this.speed = speed;             // заменит переменную в heap так как есть указатель this.speed
        System.out.println("speed: " + speed);
        System.out.println("this.speed: " + this.speed);
    }

}
