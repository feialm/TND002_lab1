/**************************************
 
Lab 1, Part A, task 1

28 January 2019

Fei Alm, Shamoun Mourad, MT1a

 **************************************/

package integrator;

public class Integrator {
	
	public static void main(String[] args) {
	
		double integral = 0.0;
		int N = 4;
		double base = 2.0/N;
		double error = 0.0;
		double F2= 8.0/3.0; //kontroll for how big the error is
		int intError = 0;

		for (int i=1; i < N+1; i++)
		{
			double height = Math.pow(i*base,2);
			//import function from Math-library
			
			double area = height * base;
			integral += area;
			
			error = (integral - F2)/F2;
			error = Math.round(100.0*error);
			intError = (int)error;
			// gör om error till int, lagrar i ny variabel
					
		}
			
		System.out.println(integral);
		System.out.println(intError);
		
		System.out.println(String.format("The result is: %4.2f units of length and the error is %-2d.0 percent", integral , intError));	
		// When increasing value of N, error value decrease

	}

}
