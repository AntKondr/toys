package toys;

import java.util.List;
import java.util.ArrayList;

public class Lototron {
    List<Toy> content;

    public Lototron() {
        this.content = new ArrayList<Toy>();
    }

    public void addToy(Toy toy) {
        content.add(toy);
    }
}