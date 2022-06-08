package myproject;

import java.util.Scanner;

public class Atm {
	public int bal =0;
	Scanner sc = new Scanner(System.in);
	int notes[] = {2000,500,200,100};
	int counts[] = new int[4];
	public void deposite() {
		
		for(int i =0 ;i<notes.length;i++) {
			int count=0;
			System.out.println("Enter Total Notes of "+notes[i] + ": ");
			count = sc.nextInt();
			counts[i]=count;
			bal = bal+count*notes[i];
			
		}
		System.out.print("Deposite :");
		for(int i=0;i<counts.length;i++) {
		System.out.print(+notes[i]+"s = "+counts[i] +"  ,  ");
		}
		System.out.println("Total Account Balance = "+bal);
		
	}
	public void widthrow() {
		System.out.println("Enter Withdrawal Amount");
		int amount = sc.nextInt();
		int x = amount;
		System.out.println("Withdraw :"+amount);
		if(amount<=bal) {
			 System.out.print("Dispensed :");
			 for(int i=0;i<notes.length && amount>=0;i++)
	         {
	             if(amount>=notes[i])
	                 System.out.print(notes[i]+"s"+" = "+amount/notes[i]+" ,");
	             	 counts[i]=counts[i]-(amount/notes[i]);
	             	 amount=amount%notes[i];
	         }
		
		System.out.print("\nBalance : ");
		for(int i=0;i<counts.length;i++) {
			System.out.print(notes[i]+"s = "+counts[i] +"  ,  ");
		}
		bal=bal-x;
		System.out.println("Total = "+bal);
	}else {
		System.out.println("Insufficient Balance!");
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a = new Atm();
		System.out.println("Press 1 for Deposite Money\nPress 2 for Withdraw Money\nPress 3 for exit ");
		int ch = a.sc.nextInt();
		switch(ch) {
		case 1: a.deposite();
				break;
		case 2: a.widthrow();
				break;
		case 3: 
			System.out.println("Thanks! Visit us again");
				return;
			
		default : System.out.println("Enter Valied Choice");
		
		}
//		a.deposite();
//		System.out.println("---------------------------------------------------------------------------------------------");
//		a.widthrow();
		
	}

}
