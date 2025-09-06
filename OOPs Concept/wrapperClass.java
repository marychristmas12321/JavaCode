public class wrapperClass {

    String name = "";

    void setName(String name){
        this.name = name;
    }

    public static void main(String args[]){
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        System.out.println(a == b); // matching the address of the wrapper class
        int num = a.intValue();
        System.out.println("The int value is : " + num);
        
        String s = "4";
        System.out.println(s);
        int num = Integer.parseInt(s);
        num /= 2;
        String ans = Integer.toString(num);
        System.out.println(ans);

        String sentence = "Acer Laptop Are Good.";
        String ans = "";
        for(int i = 0;i < sentence.length();i++){
            char ch = sentence.charAt(i); // A
            if(Character.isWhitespace(ch)){
                ans += " ";
            }
            else if(Character.isUpperCase(ch)){
                ans += Character.toLowerCase(ch);
            }
            else{
                ans += Character.toUpperCase(ch);
            }
        }
        System.out.println(ans);

        int n = 10;
        String n1 = Integer.toString(n); // int -> String

        Integer n2 = 20;
        String nums1 = Integer.toString(n2);

        System.out.println(n1);
        System.out.println(nums1);
    }
}

