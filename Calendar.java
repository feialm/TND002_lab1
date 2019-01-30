package dataBase;

public class Calendar {

	public String [][] data;
	int counter;
	
		public Calendar(int size)
		{
		data = new String [size][5]; // g�r en ny data, i form av string
		counter = 0;
		}
		
		public String addperson(String [] inString)
		{
		
			if (counter > data.length)// length �r en metod, f�r arrays osv, hur l�ng 
			{
				return " Not added ";
				
			}
			else
			{
				//code, l�gga till namn plus f�delsedag, fylla i slot			
				for (int i =0; i < 5; i++)
				{
				data [counter][i] =  inString[i]; // l�gger in f�rnamn, efternamn, dag, m�nad, �r i en rad, 5 olika kolumner
				}
				
				counter++; //increase counter by 1 when a names and their birthday is added to slot
				return ("");// Person added at position %2d". counter);	
			}				
		}
		
		public String[] getName(int entryNumber)
		{
		
			if ( entryNumber >= -1 && entryNumber < counter )
			{
				String []Name = {data[entryNumber][0],data[entryNumber][1]};
				//java s�tter inte ihop data[entryNumber][0] och data[entryNumber][1]
				
				//System.out.println(Name[0]+ " "+ Name[1]);
				return Name;
			}
			else
			{
				String [] Name2 = {"John", "Doe"};
				return Name2;
			}
				
			}
		
		public Integer[] getBirthDate(int entryNumber) // entryNumber = j fr�n Lab1.java
		{
			if( entryNumber >= -1 && entryNumber < counter )
			{
				Integer[] Birth = {Integer.parseInt(data[entryNumber][2]), Integer.parseInt(data[entryNumber][3]), Integer.parseInt(data[entryNumber][4])};
				
	
				return Birth;
				// parseInt, funktion f�r att g�ra string till int
			}
			else
			{
				Integer[] Birth2 = {1, 1, 1900}; // inga "" tecken h�r eftersom det inte �r en str�ng
				return Birth2;
			}
		}
		
		
		
		public String writeName(int number) // number = j fr�n Lab1.java
		{
			
			//ropar p� funktionen getName
			String[] nameAndSurname = this.getName(number);
			// this. betyder attt man anropar en fuktion p� mig sj�lv, dvs att den finns i Calender.java, samma object
			
			String lowerCaseName = nameAndSurname[0].toLowerCase(); // f�rnamnet till sm� bokst�ver
			String upperCaseSurname = nameAndSurname[1].toUpperCase(); // efternamnet till stora bokst�ver
	
			Integer[] dateMonthYear = this.getBirthDate(number);
			
			String Month = "bajs"; //denna labb �r bajs
			
			switch(dateMonthYear[1])
			{
			case 1: Month = "January" ; break;
			case 2: Month  = "February" ; break;
			case 3: Month = "March" ; break;
			case 4: Month = "April" ; break;
			case 5: Month = "May" ; break;
			case 6: Month = "June" ; break;
			case 7: Month = "July" ; break;
			case 8: Month = "August" ; break;
			case 9: Month = "September" ; break;
			case 10: Month = "October" ; break;
			case 11: Month = "October" ; break;
			case 12: Month = "December" ; break;
			default: Month = " ERROR" ; break;
			//det h�r kommer egentligen inte ske f�r att alla m�nader i databsen �r mellan 1-12
			// #good programming practice jaooo
			
			}
			
			return lowerCaseName + " "+ upperCaseSurname + " " + dateMonthYear[1]+ " "+ Month + " "+ dateMonthYear[2];
			// Skriv om till till String.format		
			
		}
		
		public void matchingYear(int year)
		{	
			
			for (int i = 0; i < counter; i++)
			{
				
				Integer[]testingYear = this.getBirthDate(i);
	
				int b = testingYear[2]; //aktuell persons f�delse�r
				
				// year skickad fr�n lab1.java
				
				if( year == b)
				{
					System.out.println(this.writeName(i));
				}
			}
			
		}
		
		
		public void matchingSurname(String surname)
		{
				
			for(int i= 0; i < counter; i++)
			{
				String[] testingSurname = this.getName(i);
			
				
				// turn everything to lowercase so names can match, utan h�nsyn till stora/sm� bokst�ver
				String y = testingSurname[1].toLowerCase(); // aktuell persons efternamn
				surname = surname.toLowerCase();
				
				//if(surname.toLowerCase().equals(y.toLowerCase());
				// surname.equalsIgnoreCase(y);
				if(surname.equals(y))
				{
					System.out.println(this.writeName(i));
				}
			}
			
		}
		
		
		
		
		}
