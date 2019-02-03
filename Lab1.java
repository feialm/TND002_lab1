/****************************
 *@author Fei Alm 
 *
 * TND001 - Lab 1, part B 
 * 
 * *************************/

package dataBase;

import java.io.*; // s� att BufferedReader och InputStreamReader ska fungera

public class Lab1 {

	public static void main(String[] args) throws IOException{
		
		// talar om vilka fel som kan ske i funktionen
		// den r�knar upp felen f�r att "f�rbereda" f�r dom
		// throws saken ska kasta bort "felen"
		
		DataBase theDataBase = new DataBase(); //skapar nytt objekt med namnet theDataBase

		String[] list = theDataBase.rawData.split(",");
		
		Calendar theCalendar = new Calendar(list.length);
		
		
		for (int j = 0; j < list.length; j++) {
			//kolla igenom hela arrayen men inget mera
			
			String[] person = list[j].split(" +");// f�rnamn klipps av, l�ggs in, efternman klipps av, l�ggs in osv
	
			theCalendar.addperson(person);	
			
		//System.out.println(list[1]);
		//System.out.println(theDataBase);
			
		//System.out.println(theCalendar.data[j][0]); //man skriver ut namnet p� personen [0]
		
		String[] arrayForNames = theCalendar.getName(j);
		//System.out.println(arrayForNames[0] + " " + arrayForNames[1]);
		

		// Kallar p� funktionen getBirthDate och skriver ut v�rdena
		Integer[]arrayForBirthDates = theCalendar.getBirthDate(j);
		//System.out.println(arrayForBirthDates[0] + " " + arrayForBirthDates[1] + " " + arrayForBirthDates[2]);
		
		// arrayForBirthDates �r samma som theCalendar.getBirthDate(j)
		// tar det som den hittar p� plats j, skriver ut
		// bla skriver ut namnen
		
	
		//System.out.println(theCalendar.writeName(j));	
		
		}	
		
		// user skriver in ett �r
		System.out.println("Skriv in ett �ret p� personen du s�ker: ");
		BufferedReader yearMatching = new BufferedReader(new InputStreamReader(System.in)); 
		String Input = yearMatching.readLine();
		int yearInput = Integer.parseInt(Input);
		//f�r om str�ngen till int eftersom den ska vara int year enligt labbanvisningarna
		
		//kallar p� funktionen
		theCalendar.matchingYear(yearInput);	
		
		// user skriver in ett efternamn
		System.out.println("Skriv in ett efternamn p� en person som du s�ker: ");
		BufferedReader surnameMatching = new BufferedReader(new InputStreamReader(System.in)); 
		String surnameInput = surnameMatching.readLine();
		
		//kallar p� funktionen
		theCalendar.matchingSurname(surnameInput);
		
		
	}
}