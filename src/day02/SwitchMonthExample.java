package day02;

public class SwitchMonthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 7;
		String monthString = "";
		
		switch (month) {
		case 1:
			monthString = "1 - january";
			break;
		case 2:
			monthString = "2 - february";
			break;
		case 3:
			monthString = "3 - march";
			break;
		case 4:
			monthString = "4 - april";
			break;
		case 5:
			monthString = "5 - may";
			break;
		case 6:
			monthString = "6 - june";
			break;
		case 7:
			monthString = "7 - july";
			break;
		case 8:
			monthString = "8 - august";
			break;
		case 9:
			monthString = "9 - sept";
			break;
		case 10:
			monthString = "10 - oct";
			break;
		case 11:
			monthString = "11 - nov";
			break;
		case 12:
			monthString = "12 - des";
			break;
		default:
			System.out.println("Invalid Mnth");
		}
		
		System.out.println(monthString);
		
		
		
	}

}
