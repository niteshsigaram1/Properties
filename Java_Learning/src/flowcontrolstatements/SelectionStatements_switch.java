package flowcontrolstatements;

public class SelectionStatements_switch {

	public static void main(String[] args) {
		int a = 3;
		String day;
		switch (a) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "wedday";
			break;

		default:
			day = "noday";
			break;

		}
System.out.println(day);
	}

}
