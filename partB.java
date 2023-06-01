import java.util.Scanner;
public class partB {
	public static void main(String[] args) {
		int total=0;
		long num;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the card number to be verified: ");
	num= sc.nextLong();
		String str = String.valueOf(num);
		char ch[]=str.toCharArray();
	    String s="";
	    for(int i=ch.length-1;i>1;i--){
	        s=s+ch[i];
	    }
	    str = s;
	     for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int index = Integer.parseInt(String.valueOf(c));
			if(i%2 == 0) {
				total =total+index;
			
			}else {
				if(index > 4) {
					index =index* 2;
					String str1 = String.valueOf(index);
					int Index = Integer.parseInt(String.valueOf(str1.charAt(0)));
					int IndeX= Integer.parseInt(String.valueOf(str1.charAt(1)));
					total =total + (Index + IndeX);
				}else {
					index =index * 2;
					total =total+ index;
				}
			}
		 }
		 if(total % 10 == 0) {
			 System.out.println("Card Number Verified");
		 }else {
			 System.out.println("Card Number Verification Failed");
		 }
	}
}