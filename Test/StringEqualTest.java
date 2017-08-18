public class StringEqualTest{

 public static void main(String[] args) {
        String s01 = "Programming";
        String s02 = new String("Programming");
        String s03 = "Program" + "ming";
        System.out.println(s01 == s02);  
        System.out.println(s01 == s03);  
        System.out.println(s01 == s01.intern()); 

		System.out.println("intern method:");

        String s0="kvill";
		String s1=new String("kvill");
		String s2=new String("kvill");
		System.out.println(s0==s1);
		s1.intern();
		s2=s2.intern();
		System.out.println(s0==s1);
		System.out.println(s0==s1.intern());
		System.out.println(s0==s2);
    }
}
