
public class Static_var {
 static  int x; // if we create the variable with static keyword so we can't change the value od variable

    public static void main(String[] args) 
    {
        Static_var obj1=new Static_var();
        Static_var obj2=new Static_var();
        Static_var obj3=new Static_var();
        obj1.x=1000;
        obj2.x=2000;
        obj3.x=3000;
       
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);

    }
}