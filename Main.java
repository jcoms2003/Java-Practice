public class Main {
	public static void main(String[] args) {
		
	}
	// List inductive types
	// Every record must have the <TYPE> brfore the ()
	sealed interface MyList<B> permits Nil, cons{}
		record Nil<B>() implements MyList<B> {}
		record cons<B>(B b, MyList<B> tail) implements MyList<B>{}
	// Tree inductive types
	sealed interface Tree<A> permits Leaf, Branch {}
		record Leaf<A>() implements Tree<A>{}
		record Branch<A>(A a, Tree<A> left, Tree<A> right) implements Tree<A> {}

	
/*	public static void main(String[] args) {
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
	int x = 4;
	int y = 3;
	if (y == x) {
		System.out.println("Hello");
		}
	else (x > y) {
		System.out.println("WOW");
	}
	*/
}


