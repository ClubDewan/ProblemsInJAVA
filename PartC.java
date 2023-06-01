import java.util.Scanner;
public class PartC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people;
		int hour;
		int age[];
		double tBill=0;
		double bill=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No. of people getting in the park: ");
		people=sc.nextInt();
		
		System.out.print("Enter the hours people spending in the park: ");
		hour=sc.nextInt();
		age= new int[people];
		for(int i=0;i<people;i++) {
			System.out.print("Enter age of the people: ");
			age[i]=sc.nextInt();
		}
		
		for(int i=0;i<people;i++) {
		if(age[i]<10) {
			//System.out.print("Cant enter in the park \n They will enter in the swing park");
			if(age[i]>=1 && age[i]<=5) {
			//	System.out.print("Swing Discount 50%");
				bill=10-((10/100)*50);
				tBill=(tBill+bill);
				}
			if(age[i]>5 && age[i]<=10) {
				//System.out.print("Swing Discount 25%");	
				bill=10-((10/100)*25);
				tBill=(tBill+bill);
			}
		}
		else if(age[i]>10 && age[i]<=15) {
		//	System.out.print("Discount 10%");
			bill=10-((10/100)*10);
			tBill=(tBill+bill);
		}
		else if(age[i]>15 && age[i]<=20) {
			//System.out.print("Discount 5%");
			bill=10-((10/100)*5);
			tBill=(tBill+bill);	
		
		}
		else if(age[i]>20) {
		//	System.out.print("Not allowed");
		}
		}
		System.out.print("Total Bill you have to pay is: "+bill);
		tBill = bill*hour*people;
		System.out.println("oh yeaaaah"+tBill);
	}
	}