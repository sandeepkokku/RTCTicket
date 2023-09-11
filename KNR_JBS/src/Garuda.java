import java.util.Scanner;
public class Garuda {

	//static int adultfare=100; //why we use static ? showing error cannot make 
	//a static reference to a non-static field.
	//static int childrenfare=50;
	static int adult;
	static int children;
	static double fare;
	//fare= adult+children;
	//static int x =adult+children;
	//static int fare;
	
	static void GarudaNonstop(){
		int adultfare=500;
		int childrenfare=450;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of tickets");
		int tickets = scan.nextInt();
		System.out.println("enter number of adults");
		int adults = scan.nextInt();
		adult=adults*adultfare;
		System.out.println("enter number of children");
		int childrens = scan.nextInt();
		children=childrens*childrenfare;
		System.out.println("No.of seats= 31. Enter your seat number:");
		
		int array[]= new int[tickets];
		for (int i = 0; i < tickets; i++) 
		{
            System.out.print("Seat " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }
	
		scan.close();
		if (tickets==adults+childrens) {
			fare =adult+children;
			//fare=tickets*x;
			System.out.println("*******TSRTC*******");
			System.out.println("   depo - KNR");
			System.out.println("    Garuda NS");
			System.out.println("    PSGR TKT");
			System.out.println("   KNR TO JBS");
			System.out.println("  A : "+adults+"  "+"C : "+childrens);
			//System.out.println(adult );
			//System.out.println(children);
			//System.out.println(x);
			//System.out.println("    Fare :$ "+x);
			System.out.println("    Fare :$ "+fare);
			System.out.print("Your seats:");
			for (int i = 0; i < tickets; i++) {
	            System.out.print("s"+array[i]+",");

	        }
            System.out.println(" ");
			System.out.println("--------------------");
			System.out.println("   NOT TRANSFERABLE");
			System.out.println("HELPLINE 040 69440000");
			System.out.println("    HAPPY JOURNEY");
		}
		else {
			System.out.println("Error: Number of TCKTS and number of PSGRS mimatch");
		}
	}

	//singlestop
	void GarudaSinglestop(){
		System.out.println("Choose Your Destination:");
		System.out.println("1.Siddipet");
		System.out.println("2.Jublihills");
		Scanner scan = new Scanner(System.in);
		int Destination = scan.nextInt();
		if(Destination==1) {
			int adultfare=200;
			int childrenfare=150;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("enter number of tickets");
			int tickets = scan1.nextInt();
			System.out.println("enter number of adults");
			int adults = scan1.nextInt();
			adult=adults*adultfare;
			System.out.println("enter number of children");
			int childrens = scan1.nextInt();
			children=childrens*childrenfare;
			System.out.println("No.of seats= 31. Enter your seat number:");
			int array[]= new int[tickets];
			for (int i = 0; i < tickets; i++) {
	            System.out.print("Seat " + (i + 1) + ": ");
	            array[i] = scan.nextInt();
	        }
		
			scan1.close();
			if (tickets==adults+childrens) {
				fare =adult+children;
				System.out.println("*******TSRTC*******");
				System.out.println("   depo - KNR");
				System.out.println("    Garuda SS");
				System.out.println("    PSGR TKT");
				System.out.println("   KNR TO SDPT");
				System.out.println("  A : "+adults+"  "+"C : "+childrens);
				System.out.println("    Fare :$ "+fare);
				System.out.print("Your seats:");
				for (int i = 0; i < tickets; i++) {
		            System.out.print("s"+array[i]+",");
		        }
	            System.out.println(" ");
				System.out.println("--------------------");
				System.out.println("   NOT TRANSFERABLE");
				System.out.println("HELPLINE 040 69440000");
				System.out.println("    HAPPY JOURNEY");
			}
			else {
				System.out.println("Error: Number of TCKTS and number of PSGRS mimatch");
			}
		}
		else {
			int adultfare=500;
			int childrenfare=450;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("enter number of tickets");
			int tickets = scan1.nextInt();
			System.out.println("enter number of adults");
			int adults = scan1.nextInt();
			adult=adults*adultfare;
			System.out.println("enter number of children");
			int childrens = scan1.nextInt();
			children=childrens*childrenfare;
			System.out.println("No.of seats= 31. Enter your seat number:");
			int array[]= new int[tickets];
			for (int i = 0; i < tickets; i++) {
	            System.out.print("Seat " + (i + 1) + ": ");
	            array[i] = scan.nextInt();
	        }
		
			scan1.close();
				if (tickets==adults+childrens) {
					fare =adult+children;
					System.out.println("*******TSRTC*******");
					System.out.println("   depo - KNR");
					System.out.println("    Garuda SS");
					System.out.println("    PSGR TKT");
					System.out.println("   KNR TO JBS");
					System.out.println("  A : "+adults+"  "+"C : "+childrens);
					System.out.println("    Fare :$ "+fare);
					System.out.print("Your seats:");
					for (int i = 0; i < tickets; i++) {
			            System.out.print("s"+array[i]+",");

			        }
		            System.out.println(" ");
					System.out.println("--------------------");
					System.out.println("   NOT TRANSFERABLE");
					System.out.println("HELPLINE 040 69440000");
					System.out.println("    HAPPY JOURNEY");
				}
				else {
					System.out.println("Error: Number of TCKTS and number of PSGRS mimatch");
				}
	
		}
	}
	static void GarudaLoad() {
		Scanner scan = new Scanner(System.in);
		System.out.println("choose type of journey : ");
		System.out.println("1.Garuda-NonStop");
		System.out.println("2.Garuda-SingleStop@SDPT");
		int journey = scan.nextInt();
		switch (journey){
		case 1:
			if (journey==1){
				Garuda.GarudaNonstop();
			}
			break;
		case 2:
			if (journey==2) {
				Garuda a = new Garuda();
				a.GarudaSinglestop();
			}
			break;
		default:
			System.out.println("ERROR INPUT - TRY AGAIN");
		}
	}
}