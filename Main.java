package TabletProfile;

import PhoneProfile.Phone;

public class Main {

	public static void main(String[] args) {
		
		Tablet huawei = new Tablet();
		Tablet xiaomi = new Tablet();
		Tablet samsung = new Tablet();
		Tablet apple = new Tablet();
		
		
		System.out.println("HUAWEI SPECIFICATION");
		huawei.printSpec("MatePad Pro", "GRAY", 2299, 2019, 10.8, 460, 'N');
		huawei.monthlyPayment(2299, "MatePad Pro", 12);
		huawei.calPrice(2299, 2, "MatePad Pro");
		huawei.totalWeight(2, 460, "MatePad Pro");
		
		System.out.println("************************************************");
		
		System.out.println("XIAOMI SPECIFICATION");
		xiaomi.printSpec("Mi Pad 4 Plus", "ROSE GOLD", 1199, 2018, 10.1, 485, 'Y');
		xiaomi.monthlyPayment(1199, "Mi Pad 4 Plus" , 12);
		xiaomi.calPrice(1199, 3, "Mi Pad 4 Plus");
		xiaomi.totalWeight(3, 485, "Mi Pad 4 Plus");
		
		System.out.println("************************************************");
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec("Galaxy Tab S7", "MYSTIC BLACK", 2999, 2020, 11, 498, 'Y');
		samsung.monthlyPayment(2999, "Galaxy Tab S7", 12);
		samsung.calPrice(2999, 2, "Galaxy Tab S7");
		samsung.totalWeight(2, 498, "Galaxy Tab S7");
		
		System.out.println("************************************************");
		
		System.out.println("APPLE SPECIFICATION");
		apple.printSpec("iPad Pro 11", "SILVER", 3499, 2020, 11, 471, 'Y');
		apple.monthlyPayment(3499, "iPad Pro 11", 12);
		apple.calPrice(3499, 2, "iPad Pro 11");
		apple.totalWeight(2, 471, "iPad Pro 11");
		
		System.out.println("************************************************");
		
		
	}


}
