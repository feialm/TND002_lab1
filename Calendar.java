package dataBase;

public class Calendar {

	public String [][] data;
	int counter;
	
		public Calendar(int size)
		{
		data = new String [size][5]; // gör en ny data, i form av string
		counter = 0;
		}
		
		public String addperson(String [] inString)
		{
		
			if (counter > data.length)// length är en metod, för arrays osv, hur lång 
			{
				return " Not added ";
				
			}
			else
			{
				//code, lägga till namn plus födelsedag, fylla i slot			
				for (int i =0; i < 5; i++)
				{
				data [counter][i] =  inString[i]; // lägger in förnamn, efternamn, dag, månad, år i en rad, 5 olika kolumner
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
				//java sätter inte ihop data[entryNumber][0] och data[entryNumber][1]
				
				//System.out.println(Name[0]+ " "+ Name[1]);
				return Name;
			}
			else
			{
				String [] Name2 = {"John", "Doe"};
				return Name2;
			}
				
			}
		
		public Integer[] getBirthDate(int entryNumber) // entryNumber = j från Lab1.java
		{
			if( entryNumber >= -1 && entryNumber < counter )
			{
				Integer[] Birth = {Integer.parseInt(data[entryNumber][2]), Integer.parseInt(data[entryNumber][3]), Integer.parseInt(data[entryNumber][4])};
				
	
				return Birth;
				// parseInt, funktion för att göra string till int
			}
			else
			{
				Integer[] Birth2 = {1, 1, 1900}; // inga "" tecken här eftersom det inte är en sträng
				return Birth2;
			}
		}
		
		
		
		public String writeName(int number) // number = j från Lab1.java
		{
			
			//ropar på funktionen getName
			String[] nameAndSurname = this.getName(number);
			// this. betyder attt man anropar en fuktion på mig själv, dvs att den finns i Calender.java, samma object
			
			String lowerCaseName = nameAndSurname[0].toLowerCase(); // förnamnet till små bokstäver
			String upperCaseSurname = nameAndSurname[1].toUpperCase(); // efternamnet till stora bokstäver
	
			Integer[] dateMonthYear = this.getBirthDate(number);
			
			String Month = "bajs"; //bara tog något, denna labb är bajs
			
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
			default: Month = " ERROR" ; break; //det här kommer egentligen inte ske för att alla månader i databsen är mellan 1-12
			}
			
			return lowerCaseName + " "+ upperCaseSurname + " " + dateMonthYear[1]+ " "+ Month + " "+ dateMonthYear[2];
			// Skriv om till till String.format		
			
		}
		
		public void matchingYear(int year)
		{
			Integer[]testingYear = this.getBirthDate(year);

			int b = testingYear[1];
			
			// a ska vara året user skriver in
			
			if( a.equals(b))
			{
				System.out.println(theCalendar.writeName(number));
			}
			
		}
		
		
		public void matchingSurname(String surname)
		{
			
			String[] testingSurname = this.getName(surname);
			
			String y = testingSurname[1];
			// x ska vara namnet som user skriver in
			
			if(x.equals.(y))
			{
				System.out.println(theCalendar.writeName(number));
			}
			
		}
		
		
		
		
		}
