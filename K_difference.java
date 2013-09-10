import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class K_difference
{
  
  public static void main(String[] args)
  {
    int numElements, diff, x;
    Set<Integer> elements            = new HashSet<Integer>();
    Set<Integer> incrementedElements = new HashSet<Integer>();
    
    /* Initialize a scanner for reading from standard input. */
    Scanner in = new Scanner(System.in);
    
    /* Read in the number of elements to expect, and the target difference. */
    numElements = in.nextInt();
    diff        = in.nextInt();
    
    /* Read the integers into the elements set. For each integer, add the target 
     * difference to it and insert it into the incremented elements set.
     */
    for (int i = 0; i < numElements; ++i)
    {
      x = in.nextInt();
      
      elements.add(x);
      incrementedElements.add(x + diff);
    }
    
    /* Perform a set intersection between the original elements and the 
     * incremented elements to determine all elements for which there is 
     * another element that differs from it by the target amount.
     */
    elements.retainAll(incrementedElements);
    
    /* Print out the size of the intersection as the answer. */
    System.out.println(elements.size());
  }
  
  
}