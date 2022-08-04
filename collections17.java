
package Assignment6;
import java.util.PriorityQueue;
/**
 * Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.  
 * @author SHUBHAM
 */
public class collections17 {
  public static void main(String[] args) {
  PriorityQueue<String> queue=new PriorityQueue<>();  
  queue.add("Red");
  queue.add("Green");
  queue.add("Orange");
  queue.add("White");
  queue.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  System.out.println(queue);
 }
}

