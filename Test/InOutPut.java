import java.io.*;
import java.util.Scanner;
public class InOutPut {

	public static void main(String args[]) throws IOException {

	// System.out.println("please input a char");


// 1 using : System.in.read() to get the input from the keyboard output is ASCII 

	// int num = 0;
	// try{

	// 	do{
	// 		num = System.in.read();
	// 		System.out.println("your num is "+num);
	// 	}while(num!=0);
		
	// }catch(Exception e){
	// 	System.out.println(e.getMessage());
	// }


// 2 not ASCII transform into char 

	// try{

	// 	char c='q';
	// 	do{

	// 		c = (char)System.in.read();
	// 		System.out.println("your char is "+c);
	// 	}while(c!='q');

	// }catch (Exception e) {
	// System.out.println("e.getMessage");
	// }


// 3 BufferedReader receive a String
	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// String inputStr = null;
	// do{
	// 	System.out.println("please input a String");
	// 	inputStr = br.readLine();
	// 	System.out.println(inputStr);
	// }while(!inputStr.equals("quit"));
	

	



// 4  Scanner receive all type input
		Scanner sc = new Scanner(System.in);
		System.out.println("input your name:");
		String name = sc.nextLine();

		System.out.println("input your age:");
		int age = sc.nextInt();

		System.out.println("input your salary:");
		float salary = sc.nextFloat();

		System.out.println("Your info is:");
		System.out.println("name: "+name +" ,age: " + age + " ,salary:"+salary);
	}

	


}