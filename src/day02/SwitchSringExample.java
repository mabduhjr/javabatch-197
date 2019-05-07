package day02;

public class SwitchSringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String levelString = "expert";
			int level = 0;
			switch (levelString) {
			case "beginner" :
				level = 1;
				break;
			case "Intermediete" :
				level = 2;
				break;
			case "expert" :
				level = 3;
				break;
			default:
				level = 0;
				break;
			}
				System.out.println("your level is : " + level);
	}

}
