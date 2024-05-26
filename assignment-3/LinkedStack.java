import java.util.EmptyStackException;
/**
    A class of stacks whose entries are stored in a chain of nodes.
    @author Frank M. Carrano and Timothy M. Henry
    @version 4.0
*/
public class LinkedStack<T> implements StackInterface<T>
{

   private Node topNode; // References the first node in the chain
  
   public LinkedStack()
   {
      topNode = null;
   } // end default constructor


   public void push(T newEntry)
   {
      Node newNode = new Node(newEntry);
      newNode.next = topNode;
      topNode = newNode;
   }


   public T pop()
   {
      T result = topNode.data;
      topNode = topNode.next;
      return result;
   }


   public T peek()
   {
      return topNode.data;
   }


   public boolean isEmpty()
   {
      return topNode == null;
   }


   public void clear()
   {
      T tempNode;
      while (!isEmpty())
         tempNode = pop ();
   }

   public void displayStack() {
      Node current = topNode;
      while (current != null) {
          System.out.println(current.data);
          current = current.next;
      }
      System.out.println();
  }


   private class Node
   {
      private T    data; // Entry in stack
      private Node next; // Link to next node
      
      private Node(T dataPortion)
      {
         this(dataPortion, null);
      } // end constructor
      
      private Node(T dataPortion, Node linkPortion)
      {
         data = dataPortion;
         next = linkPortion;
      } // end constructor
      
      private T getData()
      {
         return data;
      } // end getData
      
      private void setData(T newData)
      {
         data = newData;
      } // end setData
      
      private Node getNextNode()
      {
         return next;
      } // end getNextNode
      
      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node
} // end LinkedStack

