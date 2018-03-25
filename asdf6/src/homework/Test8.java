public class Test
{
  public static void main (String [] args)
  {
    Object obj = new Object()
    {
      public boolean equals(Object boj)
      {
        return true;
      }
    }
    
    System.out.println(obj.equals("Hello"));
    
  }
}
