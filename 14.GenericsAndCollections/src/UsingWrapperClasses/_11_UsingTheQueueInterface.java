package UsingWrapperClasses;

import java.util.LinkedList;
import java.util.Queue;

public class _11_UsingTheQueueInterface {

    public static void main(String[] args) {
        //The queue interface has six methods

        //1. boolean add(E e) --> Adds an element to the back of the queue and returns true or throws an exception

        //2. E element() --> Returns next element or throws an exception if empty queue

        //3. boolean offer(E e) --> Adds an element to the back of the queue and returns whether successful

        //4. E remove() --> Removes and returns next element or throws an exception if empty queue

        //5. E poll() --> Removes and returns next element or returns null if empty queue

        //6. E peek() --> Returns next element or returns null if empty queue

        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.offer(10)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 4
        System.out.println(queue.peek()); // null

    }

}
