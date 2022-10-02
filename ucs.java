import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

import static java.util.Arrays.deepToString;

//This class implements the uniform cost search algorithm
public class ucs {

    public static Paths uniform_cost_search(Problem problem) {
        Node node = new Node(problem.getInitial_state());
        PriorityQueue<Node> pr_queue = new PriorityQueue<>();
        pr_queue.add(node);
        HashSet explored = new HashSet();

        while (pr_queue.size() > 0) {
            Node new_node = pr_queue.poll();
            if (problem.goal_test(new_node.getState())) {
                System.out.println(new_node);
                return new_node.solution_path();
            } else {
                explored.add(new_node.getState());
            }

            try {
                ArrayList<Routes> actions = problem.actions(new_node.getState());
                System.out.println(actions);
                for (Routes route : actions) {
                    Node child = new Node(route.getDestination_airport_id(), new_node,
                            route.getDestination_airport_id(), node.getPath_cost() + 1.0);

                    if (!pr_queue.contains(child) && !explored.contains(child.getState())) {
                        pr_queue.add(child);
                        //System.out.println("New child" + child);
                    }
                    else if
                    (pr_queue.contains(child)) {
                        double old_cost = pr_queue.peek().getPath_cost();
                        if (old_cost > child.getPath_cost()) {
                            pr_queue.remove(child);
                            pr_queue.add(child);
                        }

                    }
                }

            } catch (NullPointerException ne) {
                System.out.println(ne.getMessage());
            }
        }
        return null;
    }
}


