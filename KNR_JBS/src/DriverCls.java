import java.util.Scanner;
public class DriverCls {

	public static void main(String[] args) {
		//new Garuda(); dynamic constructor
		
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("choose your bus: ");
		 System.out.println("1.Garuda");
		 System.out.println("2.Rajadani");
		 int bus = scan.nextInt();
		 //scan.close(); ? scan close chesthe error cmng
		 
		 switch (bus){
		 case 1:
			 												//new  Garuda(); invoking class
			 Garuda.GarudaLoad();//static method invoking
			 //Garuda.GarudaNonstop();
			 break;
		 case 2:
			 Rajadani.RajadaniLoad();						//Garuda a = new Garuda(); //non static method invoking
			 												//a.GarudaSinglestop();
			 break;
		 default:
			 System.out.println("ERROR INPUT - TRY AGAIN");
		 }
		 
	}

}