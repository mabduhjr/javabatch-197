package day02;

public class SwitchNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char branch = 'c';
		int colaggeYear = 4;
		switch (colaggeYear) {
		case 1:
			System.out.println("english, maths, science");
			break;
		case 2:
			switch (branch) {
			case 'C':
				System.out.println("OS. Java, data structure");
				break;
			case 'E':
				System.out.println("Micro processor, logic switching theory");
				break;
			case 'M':
				System.out.println("Drawing, Manufacturing Machines");
				break;
			}
			break;
		case 3:
			switch (branch) {
			case 'C':
				System.out.println("Computer Organization, Multimedia");
				break;
			case 'E':
				System.out.println("Fundamental of logic design, microelectronics");
				break;
			case 'M':
				System.out.println("internal combutsion engine, mechanical vibrator");
				break;
			}
			break;
		case 4:
			switch (branch) {
			case 'C':
				System.out.println("data communication and networks, multimedia");
				break;
			case 'E':
				System.out.println("embedded system, image processing");
				break;
			case 'M':
				System.out.println("Production technogy, thermal engineering");
				break;
			}
			break;
			}
		
		
		}

}
