import java.util.LinkedList;
import java.util.Queue;

public class Order {
    Queue<OrderType> queue = new LinkedList<>();

    void putOrder(String[] input) {
        queue.add(new OrderType(input));
    }
}
