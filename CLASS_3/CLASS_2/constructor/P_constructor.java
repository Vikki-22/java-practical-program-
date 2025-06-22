public class P_constructor
 {
    int a,b,c;
    P_constructor(int x ,int y)
    {
      a=x;
      b=y;
      c=a+b;

    }
    public  void show(){
        System.out.println("c="+c);
    }
    public static void main(String args[])
    {
        P_constructor obj=new P_constructor(10 ,20) ;
        obj.show();

    }
}
