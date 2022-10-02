import java.util.ArrayList;
import java.util.HashMap;

public class Problem{
 public int initial_state;
    public int goal_state;
    public HashMap<Integer, ArrayList<Routes>> routes;


    public Problem(int initial_state, int goal_state, HashMap<Integer, ArrayList<Routes>> map) {
        this.initial_state = initial_state;
        this.goal_state = goal_state;
        this.routes = map;
    }

    public int getInitial_state() {
        return initial_state;
    }

    public int getGoal_state() {
        return goal_state;
    }


    @Override
    public String toString() {
        return "Problem{" +
                "initial_state=" + initial_state +
                ", goal_state=" + goal_state +
                '}';
    }
    public boolean goal_test(int state){
        return (state == goal_state);
    }

    public ArrayList<Routes> actions(int state){
        ArrayList<Routes> neighbours = routes.get(state);
        return neighbours;
    }
}