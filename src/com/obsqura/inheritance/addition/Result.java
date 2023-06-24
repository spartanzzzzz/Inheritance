package com.obsqura.inheritance.addition;

public class Result extends Addition {
		static int div = 0;
		public int sum(int a,int b) {
			return super.sum(a,b);
			
		}
	
	
		public static void main(String[] args) {
			Result obj = new Result();
			div = obj.sum(a,b);
			if(div%10==0) {
			
				System.out.println("Divisible by 10");
			}else {
				System.out.println("Not Divisible by 10");
			}
		

	}

}
