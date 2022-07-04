package lessons.java101.arrays;

public class Player {

    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) {

        // BEGIN
        assert name != null;
        assert figure != null;
        // END

        this.name = name;
        this.figure = figure;
    }
}
