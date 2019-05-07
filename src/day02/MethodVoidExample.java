package day02;

public class MethodVoidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			methodRankPoints(255.7);
			
	}

		public static void methodRankPoints( double points) {
			if (points >= 202.5) {
				System.out.println("rank : A1");
			}
			else if (points >= 122.4) {
				System.out.println("rank A2");
			}
			else {
				System.out.println("rank A3");
			}
		}
}
