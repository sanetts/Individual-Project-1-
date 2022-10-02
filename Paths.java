import java.util.ArrayList;

public class Paths implements Comparable<Paths> {
    ArrayList<Integer> state_seq= new ArrayList<>();
    double path_cost;

    public Paths(ArrayList<Integer> state_seq, double path_cost) {
        this.state_seq = state_seq;
        this.path_cost = path_cost;
    }

    public ArrayList<Integer> getState_seq() {
        return state_seq;
    }

    public double getPath_cost() {
        return path_cost;
    }

    @Override
    public int compareTo(Paths o) {
        return Double.compare(this.path_cost, o.path_cost);
    }

    @Override
    public String toString() {
        return "Paths{" +
                "state_seq=" + state_seq +
                ", path_cost=" + path_cost +
                '}';
    }
}
