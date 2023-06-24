package com.obsqura.inheritance.seasondiscount;

public class OffSeason extends OnSeason {
	
	public OffSeason(double cost) {
        super(cost);
    }

    public double discount()  {
        double offSeasonCost = cost*0.15;
        System.out.println("The disount amount is"+" ");
        return offSeasonCost;
    }
}