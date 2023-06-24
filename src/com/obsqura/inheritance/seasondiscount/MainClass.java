package com.obsqura.inheritance.seasondiscount;
import java.util.Scanner;
public class MainClass extends OffSeason{
	
	public MainClass(double cost) {
		super(cost);
		
	}

	public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in)){
        System.out.print("Enter type of clothes (season or off season):");
        String typeClothing = scan.nextLine();
        System.out.print("Enter cost: ");
        double clothingCost = scan1.nextDouble();
        OnSeason cloth = new OnSeason(clothingCost);
        OffSeason cloth1 = new OffSeason(clothingCost);
        if(typeClothing.contains("off season")){
            System.out.println(cloth1.discount());
        }
        else {
            System.out.println(cloth.discount());
        }
    }
  }
}


