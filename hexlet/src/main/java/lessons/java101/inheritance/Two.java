package lessons.java101.inheritance;

public class Two extends One {      // если поставлю final то не смогу унаследоваться

    private final String two;

    public Two(final String two) {
        this.two = two;
    }

    public void printTwo() {
        System.out.println(this.two);
    }

}
