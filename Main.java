import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int eng=sc.nextInt();
      int tam=sc.nextInt();
      int sci=sc.nextInt();
      int soc=sc.nextInt();
      int cgpa=(eng+tam+sci+soc)/4;
      System.out.print(cgpa);
    }
  }
