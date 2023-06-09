import java.util.Locale;
import java.util.Scanner;
public class Proyecto {   
	private Proyecto() {}
	public static void main(String args[]) {       
		String destination = null;
		int travelers = 0;
		int duration = 0;
		double cost = 1000;
		int addOns = 0;

		Scanner keyboard = new Scanner(System.in);

	    System.out.print("Insert your destination: ");
	    destination = keyboard.next();

	    System.out.print("Insert the travelers number: ");
	    travelers = keyboard.nextInt();

	    System.out.print("Insert the travel days: ");
	    duration = keyboard.nextInt();

	    System.out.println("Would you like add these beneficts? (choose with numbers): ");
	    System.out.println("1.- All-Inclusive Package - $200 per traveler ");
	    System.out.println("2.- Adventure Activities Package - $150 per traveler");
	    System.out.println("3.- Spa and Wellness Package - $100 per traveler ");
	    System.out.println("0.- No");
	    addOns = keyboard.nextInt();
	    
		if (travelers > 0 && travelers <= 80 && duration > 0 && destination != null && !destination.isEmpty()) {
			if (destination.toLowerCase(Locale.getDefault()).equals("paris")) {
				cost += 500;
			}
	    	if (destination.toLowerCase(Locale.getDefault()).equals("new york city")) {
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
	    	switch (addOns) {
	    	case 0:
				break;
			case 1:
				cost += 200*travelers;
				break;
			case 2:
				cost += 150*travelers;
				break;
			case 3:
				cost += 100*travelers;
				break;
		    default:
		    	System.out.println("Esa opcion no existe ");		        
			}
	    	System.out.println(cost);
			} else 
			System.out.println(-1);
	}
	
	
}