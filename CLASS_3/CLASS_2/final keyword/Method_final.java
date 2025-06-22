 class bc
{
 final void show()
 {
    System.out.println("hi i m vikki chandrtawanshi");
 }
}
class Method_final extends bc  // error because can't access final class
{
    public static void main(String args[])
    {
        show() // final method can not override
        {
        System.out.println("hi i am  vikki");
        }
        Method_final o=new Method_final();
        o.show();

    }
}