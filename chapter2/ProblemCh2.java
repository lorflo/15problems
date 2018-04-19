import java.util.*;
public class ProblemCh2
{
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    LinkedList lis = list;
    int x = 2;
    int y = 1;
    list.add(x);
    list.add(y);
    lis.add(y);
    lis.add(x);
    
    System.out.println(problem1(list));
     System.out.println(problem5(list,lis));
    
  }
  public static LinkedList problem1(LinkedList list)
  {
    HashSet set = new HashSet(list);
    LinkedList list2 = new LinkedList();
    for(int i =0;i<set.size();i++)
    {
     if(set.contains(list.get(i)))
          list2.add(list.get(i));
    }
    return list2;
  }
  /** solution from book
  public static boolean problem3(LinkedListNode n)
  {
    if(n == null || n.next == null)
    {
      return false;
  }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
  }
  */
  public static LinkedList problem5(LinkedList list1,LinkedList list2)
  {
    String s ="";
    String st ="";
   for(int i=0;i<list1.size();i++)
    {
      s.concat((String)list1.poll());
    } 
   int x = Integer.valueOf(s);
   for(int i=0;i<list2.size();i++)
    {
      st.concat((String)list2.poll());
    } 
   int y = Integer.valueOf(st);
   int z = x+y;
   String str = String.valueOf(z);
    LinkedList listF = new LinkedList();
   for(int i=str.length() -1;i>= 0;i--)
    {
       listF.add(str.charAt(i));
    }
  
   
   return listF;
  }
  
}