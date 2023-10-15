package _1_999._600_699;

import java.util.LinkedList;
import java.util.Queue;

public class _649_Dota2_Senate {

    public static void show(String str) {
        System.out.println(predictPartyVictory(str));
    }

    public static String predictPartyVictory(String senate) {

        Queue<Integer> queue_d = new LinkedList<>();
        Queue<Integer> queue_r = new LinkedList<>();
        int n = senate.length();

        for(int i = 0; i<senate.length(); i++) {
            if(senate.charAt(i) == 'R') {
                queue_r.add(i);
            } else {
                queue_d.add(i);
            }
        }

        while(!queue_d.isEmpty() && !queue_r.isEmpty()) {
            int r_index = queue_r.poll();
            int d_index = queue_d.poll();
            if(r_index < d_index) {
                queue_r.add(r_index+n);
            } else {
                queue_d.add(d_index+n);
            }
        }

        return queue_r.isEmpty() ? "Dire" : "Radiant";



    }

}
