/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

import java.util.Stack;


/**
 *
 * @author Producer
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            
        }
        while(!stack.empty())
        {
            System.out.print(stack.pop());
            System.out.print(",");
        }
        System.out.println("LIFT-OFF!!");
     
    }
    
}
