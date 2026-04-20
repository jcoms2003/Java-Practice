public class Fact {
	public long f;
	
	public static long fact(long f) {
		if(f <= 1) {
			return 1;
		} return f * fact(f-1);
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(10));
		System.out.println(fact(3));
	}
}
