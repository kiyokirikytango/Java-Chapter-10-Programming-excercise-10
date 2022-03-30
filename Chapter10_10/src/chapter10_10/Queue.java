
package chapter10_10;

public class Queue {
    
    int [] elements;                //stores the value of the array
    int size;                           //stores the value of the soze
    
    Queue(){                            // constructor that sets the default capacity to 8
        elements = new int [8];
}
    
    public boolean empty(){         //method that returns if the queue is empty
      return size == 0;
    }
    int getSize(){                          //getter method for the size of the queue
        return size;
    }
    
    int enqueue(int v){                                 
        if(size >= elements.length){                                                //creating a new array of double the size and copy over the existing and then adding the new data
            int[] temp = new int [elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);                    //java provided this method
            elements = temp;
        }
        return elements[size++] = v;
    }
    
    int dequeue(){

        return elements[--size];     //removes the integer at the top of the stack and returns it
    }
}
       
        
