public class Test {
    //正则表达式 正向预查 反向预查 实现分str
	public static void main(String [] args) {
		String str1 = "123456789";
		String pattern = "(\\d)(?=(\\d{4})+(?!\\d))";
		System.out.println(str1.replaceAll(pattern, "$1" + ","));
	}
}
