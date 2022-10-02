import java.util.ArrayList;
import java.util.Objects;

//This is the Node Class
public class Node implements Comparable<Node>{
    private int state;
    private Node parent;
    private int action;
    private double path_cost;

    public Node(int state, Node parent, int action, double path_cost) {
        this.state = state;
        this.parent = parent;
        this.action = action;
        this.path_cost = path_cost;
    }
    public Node(Integer state) {
        this.state = state;
        this.parent = null;
        this.action = 0;
        this.path_cost = 0;
    }

    public int getState() {
        return state;
    }

    public Node getParent() {
        return parent;
    }

    public int getAction() {
        return action;
    }

    public double getPath_cost() {
        return path_cost;
    }

    @Override
    public String toString() {
        return "Node{" +
                "state=" + state +
                ", parent=" + parent +
                ", action=" + action +
                ", pathcost=" + path_cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return state == node.state;
    }


    public Paths solution_path() {
        ArrayList<Integer> state_seq = new ArrayList<>();
        double final_path_cost = this.path_cost;
        state_seq.add(0, this.state);

        Node node = this.parent;
        while (node != null) {
            state_seq.add(0, node.state);
            node = node.parent;
        }

        return new Paths(state_seq, final_path_cost);
    }

    @Override
    public int compareTo(Node o) {
        return Double.compare(this.getPath_cost(), o.getPath_cost());
    }
}

