package toys;

public class Toy {
    private int id;
    private String name;
    private int amt;
    private int prob;

    public Toy(int id,
               String name,
               int prob) {
        this.id = id;
        this.name = name;
        this.prob = prob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public void decrAmt() {
        amt -= 1;
    }

    public int getProb() {
        return prob;
    }
}