class cons{
    int a,b,c,d;
    cons(int x)
    {
        a=x;
    }
}
public class Super_in_constuctor extends cons
{

    Super_in_constuctor (int x ,int y,int z)
    {
      super(x); // super keywor use to give the value of first class cons using main class cons
      b=y;
      c=z;
      d=a+b+c;

    }
    public  void show(){
        System.out.println("d="+d);
    }
    public static void main(String args[])
    {
        Super_in_constuctor  obj=new Super_in_constuctor (10 ,20,30) ;
        obj.show();

    }
}


