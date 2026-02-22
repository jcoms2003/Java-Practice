public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, World");
		System.out.println("From, Java!");
	}
	public static int add(int x,int y) {
		return x + y;
	}
	public static int sub(int x,int y) {
		return x - y;
	}
	public static int total( int value){
		int one = add(5,5);
		int two = sub(5,5);
		return one - two;
	}
	static int one = 5;
	static int two = 9;
	public static void printing(String[] args) {
		System.out.println(one);
		System.out.println(two);
	}
}
