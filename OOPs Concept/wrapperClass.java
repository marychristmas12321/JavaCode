public class wrapperClass {
    public static void main(){
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b); // matching the address of the wrapper class
        int num = a.intValue();
        System.out.println("The int value is : " + num);
    }
}