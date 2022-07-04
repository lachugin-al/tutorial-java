package lessons.java101.objects;

public class Sum {

    public int sum(int a, int b) {      // создается фрейм в стеке указателем this, с локальными переменными a = a, b = c
        return a + b;
    }

    public void execute() {             // this с указанием на объект в хипе и локальными переменными a и c
        int a = 1;
        int c = 2;
        this.sum(a, c);         // 1, 2
        System.out.printf("a: %d\n", a);

        a = this.sum(a, c);     // 3 = 1, 2
        System.out.printf("a: %d\n", a);

        a = this.sum(sum(a, c), c); // 7 = 3+2, 2
        System.out.printf("a: %d", a);
    }

}
