public class Static_method {
   public static void show()
{
   System.out.println("i am vikki");

}
public static void main(String[] args)
 {
    Static_method obj1=new Static_method();
    Static_method obj2=new Static_method();
   
    obj1.show();
    obj2.show();
    Static_method.show(); // if we create the method name with static keyword then we directly call the method using class name not neccesary to create the object


}
    }
        
    

    

