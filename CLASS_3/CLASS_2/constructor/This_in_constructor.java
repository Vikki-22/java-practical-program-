public class This_in_constructor 
{
    int a,b,c,d;
    This_in_constructor(int z)
    {
        this.d=(20);
        System.out.println(d);

    }
    This_in_constructor(int x,int y)
    {
        this.a=x;
        this.b=y;
        c=a+b;
    }
    public void add()
    {
        System.out.println("c="+c);
    }
    public static void main(String[] args)
     {  This_in_constructor ob=new This_in_constructor(10);
        This_in_constructor ob2=new This_in_constructor(10,20);
        ob2.add();
    }
    
}