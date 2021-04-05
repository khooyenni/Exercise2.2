package TabletProfile;

public class Tablet {
	
	String model;
	String color;
	int price;
	int releasedYear;
	double size;
	double weight;
	char fingerprint;
	
	void printSpec(String a, String c, int p, int y, double s, double w, char f) {
		System.out.println("Model         : "+ a);
		System.out.println("Colour        : "+ c);
		System.out.println("Price         : "+ "RM" + p);
		System.out.println("Released Year : "+ y);
		System.out.println("Size          : "+ s + " inches");
		System.out.println("Weight        : "+ w + "g");
		System.out.println("Fingerprint   : "+ f);
	}
	
	void monthlyPayment(int p, String a, int m) {
		double mPayment = (double)p/m;
		System.out.println("The total month for payment is "+ m + " " + "month");
		System.out.printf("The total payment "+ a + " " + "per month is "+ "RM%.2f%n", mPayment);
		
	}
	
	void calPrice(int p, int q, String a) {
		int totalprice = p * q;
		System.out.println("The total price of " + q + " " + a + " " + "is RM" + totalprice);
	}
	
	void totalWeight(int q, double w, String a) {
		double totalWeight= q*w;
		System.out.println("The total weight of " + q + " " + a + " " + totalWeight + "g");
	}
	
	

}
