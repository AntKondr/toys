package toys;

public class ToyFactory {
    private static int id = 0;

    public Toy createToy(String name, int prob) {
        this.id += 1;
        return new Toy(id, name, prob);
    }
}