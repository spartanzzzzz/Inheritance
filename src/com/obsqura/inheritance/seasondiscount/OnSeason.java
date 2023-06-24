package com.obsqura.inheritance.seasondiscount;

public class OnSeason {
	double cost;

    public OnSeason(double cost) {
        this.cost = cost;
    }

    public double discount(){
        double seasonCost= cost*0.40;
        System.out.println("The disount amount is"+" ");
        return seasonCost;
    }
}