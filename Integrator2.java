/**************************************
 
Lab 1, Part A, task 2

28 January 2019

Fei Alm, Shamoun Mourad, MT1a

 **************************************/

package integrator2;

public class Integrator2 {
	
	public static void main(String[] args) {
	
		double integral;
		int N = 1;
		double base = 2.0/N;
		double error = 0.0;
		double F2= 8.0/3.0; //exact value of area
		int intError = 0;
		int limit = 1;
		
		do {
			
		integral = 0.0;	// integral nollst�lls till noll varje g�ng ny do-while loop k�rs
		System.out.println("Step: " + N); //R�knar varv som loopen k�rs
		
		for (int i=1; i < N+1; i++)
		{
			double height = Math.pow(i*base,2);
			//double height =(i*base)*base;
			//height = base*base, height �kar, d�rf�r l�gger vi till i, f�r att i++
			//System.out.println(height);
			//import function from Math-library
			
			double area = height * base;
			integral += area;
					
		}
			
		//System.out.println(integral);
		//System.out.println(intError);
		error = (integral - F2)/F2;
		error = Math.round(100.0*error);
		intError = (int)error;
		// g�r om error till int, lagrar i ny variabel
		
		System.out.println(String.format("The result is: %4.2f units of length and the error is %-2d percent", integral , intError));	
		// When increasing value of N, error value decrease
		// 4 slots, two of them are for deciamls
		
		N++; // l�gger till ett N
		base = 2.0/N; // new base when N is changed
		
		}while ( intError > limit);
	}

}