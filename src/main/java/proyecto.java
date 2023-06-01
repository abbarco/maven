import java.util.Scanner;
public class proyecto {   
	public static void main(String args[]) {       
		String destination = null;
		int travelers = 0;
		int duration = 0;
		double cost = 1000;

		Scanner keyboard = new Scanner(System.in);

	    System.out.print("Insert your destination: ");
	    destination = keyboard.next();

	    System.out.print("Insert the travelers number: ");
	    travelers = keyboard.nextInt();

	    System.out.print("Insert the travel days: ");
	    duration = keyboard.nextInt();

		if (travelers > 0 && travelers <= 80 && duration > 0 && destination != null && !destination.isEmpty()) {
			if (destination.toLowerCase().equals("paris")) {
				cost += 500;
			}
	    	if (destination.toLowerCase().equals("new york city")) {
	    		cost += 600;
	    	}
	    	if (duration < 7) {
	    		cost += 200;
	    	}
	    	if (duration > 30 || travelers == 2) {
	    		cost -= 200;
	    	}
	    	if (travelers >= 4 && travelers < 10) {
	    		cost = cost * 0.9;
	    	}
	    	if (travelers >= 10) {
	    		cost = cost * 0.8;
	    	}
	    	System.out.println(cost);
			} else 
			System.out.println(-1);
	}
}