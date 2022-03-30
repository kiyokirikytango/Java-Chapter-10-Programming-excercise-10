/*
Chapter 10 Programming excercise 10
Riky Hernandez
10/04/21
Description: Design a class named Queue , Creating a program that dysplays the 
                distance of two points (0,0) & (10,30.5)
      ____
     /___/\_                               
    _\   \/_/\__                          
  __\       \/_/\                       
  \   __    __ \ \                    
 __\  \_\   \_\ \ \   __               
/_/\\   __   __  \ \_/_/\           
\_\/_\__\/\__\/\__\/_\_\/         
   \_\/_/\       /_\_\/             
      \_\/       \_\/
*/
package chapter10_10;

public class Chapter10_10 {

   
    public static void main(String[] args) {
      
        Queue stack = new Queue();              //using the default constructor of the initial capacity of 8
       
        for(int i = 1; i < 20; i++){                //adding numbers to the queue from 1-20
            System.out.print(i + " ");
            stack.enqueue(i);                           //stck in order they are comin
        }
        
        System.out.println();
        
        while (!stack.empty())                              //stack in reverse order, the order that are coming out
            System.out.print(stack.dequeue() + " ");
    }
    
}
