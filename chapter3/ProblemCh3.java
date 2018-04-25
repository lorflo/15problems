import java.util.*;
public class ProblemCh3
{
  public static void main(String[] args)
  {
    Stack stack = new Stack();
    int x = 1;
    int y = 2;
    int z = 3;
    int w = 4;
    stack.push(w);
    stack.push(z);
    stack.push(y);
    stack.push(x);
    System.out.println(problem6(stack));
  }
  public void problem1()
  {
    
  }
  //Min method for a custom stack assuming rest of stack class is made
  
  public static void problem2(Stack stack)
  {
    if(newTop < stack.peek())
      min = newTop;
    return min;
  }
  
  
  //to sort a stack
  public static Stack problem6(Stack stack)
  {
    Stack newStack = new Stack();
    while(!stack.isEmpty())
    {
      newStack.push(stack.pop());
      if((int)stack.peek() < (int)newStack.peek())
      {
        int min = (int)stack.pop();
        stack.push(newStack.pop());
        newStack.push(min);
      }
    }
    stack.push(newStack.pop());
    if((int)stack.peek() < (int)newStack.peek())
    {
      newStack.push(stack.pop());
      problem6(newStack);
    }
    return newStack;
    
  }
  public void problem4()
  {
    
  }
  public void problem5()
  {
    
  }
  
}
