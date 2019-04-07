package test;

public class JUnit {
	
	/*public int factorial(int number) {
		int i,fact=1;  
		number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;   
		  }
return fact;
	}*/
	
	
	 public int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
	 
		
		    public int sumOdds(int sum) {
			sum = 0;
		for (int i = 1; i <= 10; i++) {       
		    if (i % 2 != 0) {
		        sum += i;
		    	    }
		    	}
		System.out.print(sum);
	return sum;
		    }
		
		


public String ConcateTextthat(String a1, String a2){
	String a3 = a1 + a2;
	return a3;
	
	}

	
}