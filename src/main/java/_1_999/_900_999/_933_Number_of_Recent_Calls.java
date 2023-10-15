package _1_999._900_999;

import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {

    Queue<Integer> queue;

    public _933_Number_of_Recent_Calls() {
        queue = new LinkedList<>();
    }

    public static void show(int[] time) {
        _933_Number_of_Recent_Calls obj = new _933_Number_of_Recent_Calls();
        for(Integer num: time) {
            System.out.println(obj.ping(num));
        }
    }


    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}


/*       Your RecentCounter object will be instantiated and called as such:
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(t);*/

