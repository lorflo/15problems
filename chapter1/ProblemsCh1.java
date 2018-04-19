import java.util.*;
public class ProblemsCh1
{
  public static void main(String[] args)
  {
    String s = "aa";
    String str = "";
    System.out.println("problem 1 " + problem1(s));
    System.out.println("problem 2 " + problem2(s,str));
    System.out.println("problem 3 " + problem3(s));
    //System.out.println("problem 4 " + problem1(s));
    System.out.println("problem 5 " + problem5(s,str));
  
  }
  public static boolean problem1(String str)
  {
    HashSet set = new HashSet();
    for(int i = 0;i<str.length();i++)
    {
      set.add(str.charAt(i));
    }
    if(set.size() == str.length())
      return true;
    else
      return false;
  }
  public static boolean problem2(String s, String str)
  {
    char[] ss = new char[s.length()];
    char[] strr = new char[str.length()];
    
    if(s.length() != str.length())
      return false;
    for(int i=0;i<s.length();i++)
    {
      ss[i] = s.charAt(i);
    }
    Arrays.sort(ss);
    for(int i=0;i<str.length();i++)
    {
      strr[i] = str.charAt(i);
    }
    Arrays.sort(strr);
    for(int i=0;i<str.length();i++)
    {
      if(strr[i] != ss[i])
        return false;
    }
    return true;
  }
  public static StringBuilder problem3(String s)
  {
    String[] chars = new String[s.length()];
    StringBuilder builder = new StringBuilder();
    
    for(int i =0;i<s.length();i++)
    {
      if(s.charAt(i) == ' ')
      {
        chars[i] = "%20";
        builder.append(chars[i]);
      }
      else
      {
        builder.append(s.charAt(i));
      }
    }
    return builder;
  }
  //dont know how to do problem 4
  /**
  public static boolean problem4(String s)
  {
    String[] arr = new String[s.length()];
    int count;
    for(int i=0;i<s.length();i++)
    {
      arr[i] = s.charAt(i);
    }
    for(int i:arr)
    {
      for(int j =0;j<s.length();j++)
      {
      if(arr[i] == s.charAt(j))
        count++;
      //if
      }
    }
  }
  */
  public static String problem5(String s, String str)
  {
    String[] arrayS = new String[s.length()];
    String[] arrayStr = new String[str.length()];
    int x = s.length() - str.length();
    int num = 0;
    if(x == -1)
       x = 1;
    if(x != 1)
      return "not colse to each other";
    
    for(int i = 0;i<x;i++)
    {
      if(arrayS[i] == null || arrayStr[i] == null)
        break;
      if(arrayS[i] != arrayStr[i])
      {
        num--;
      } 
    }
    if(num == -1 || arrayS.length != arrayStr.length)
    {
      return "one edit away";
    }
    else
      return "none edits away";
    
  }
}