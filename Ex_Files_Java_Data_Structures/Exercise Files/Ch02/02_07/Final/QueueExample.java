/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Producer
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1;i<=10; i++)
        {
            queue.add(i);
        }
        System.out.println("Element in the queue: "+queue);
        int removed = queue.remove();
        System.out.println(removed + " was removed");
        
        int top  = queue.peek();
        System.out.println("top element is: "+top);
        
        System.out.println(queue);
        
    }

}
