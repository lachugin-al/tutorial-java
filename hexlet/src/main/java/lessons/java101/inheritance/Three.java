package lessons.java101.inheritance;

public final class Three extends Two {

    private final String three;

    public Three(final String two, final String three) {
        super(two);
        this.three = three;
    }

    public void printThree() {
        System.out.println(this.three);
    }

    @Override
    public void printTwo() {
        System.out.println("@Override method printTwo(); " + this.three);
    }
}
