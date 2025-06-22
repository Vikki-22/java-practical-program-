public class Var_final {
    public static void main(String args[])
    {
        final int a=10;
        a+=a+5; // Error because final variable value can;t change 
        System.out.println("a="+a);
    }
    
}
