package lessons.java101.construct;

public class ConstructorOne {

    private final String one;

    public ConstructorOne() {
        this("X");              // подставляем в дефолтный конструктор другой который принимает String
    }

    public ConstructorOne(final String one) {
        super();                // каждый конструктор наследует конструктор от класса Object()

        assert one != null;

        this.one = one;
        System.out.println(this.one);
    }

    public void getConsInfo() {
        System.out.println(this.one);
    }

}

/*
Object
ContructorOne ext Object
ConstructorTwo ext ConstructorOne
ConstructorThree ext ConstructorTwo

ConstructorThree c = new ConstructorThree();
ConstructorThree(){super()} => ConstructorTwo(){super()} => ConstructorOne(){super()} => Object()
                            => ConstructorOne() => ConstructorTwo() => ConstructorThree()
 */