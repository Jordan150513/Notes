public class Test03 {
 
    public static void main(String[] args) {
       
       System.out.println("refresh equal:");

        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);  // true
        System.out.println(f3 == f4);  //false

		System.out.println("Integer and int");

        Integer a = new Integer(3);
        Integer b = 3;                  
        int c = 3;
        System.out.println(a == b);     
        System.out.println(a == c);     
    }
}

