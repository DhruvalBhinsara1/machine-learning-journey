import java.util.*;

public class Priority_Queues{

    public static void main(String[] args){

        Queue<String> queue = new PriorityQueue<String>();
    
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Monica");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());


          }

        
        }}

