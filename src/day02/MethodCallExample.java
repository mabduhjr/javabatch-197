package day02;

public class MethodCallExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 11;
			int b = 6;
			
			int c = minFunction (a, b);
			System.out.println(" minimum Value = " + c);
			
			voidMethod();
	}
		public static int minFunction(int n1, int n2) {
			int min;
			if( n1 > n2)
				min = n2;
			else
				min = n1;
			return min;
		}
			public static void  voidMethod() {
				System.out.println(" this is a void method in java");
				System.out.println("this method not return value");
				System.out.println("medhod is called");
			}
	

}
