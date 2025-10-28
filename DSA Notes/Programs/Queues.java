import java.util.Queue;
import java.util.LinkedList;

public class Queues{

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

        
//         queue.add("Karen");
//         queue.add("Chad");
//         queue.add("Steve");
//         queue.add("Monica");
// 
//         queue.poll();
// 
//         queue.poll();
//         System.out.println(queue.peek());

        
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Monica");

        System.out.println(queue.poll());


          }

}