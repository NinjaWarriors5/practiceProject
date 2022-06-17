package practiceSelf;

public class ArrayConcept {
	public static void main(String[] args) {
			
			//System.out.println("integer concept");
		
		/*int f[] = new int[9];
			
			f[0]= 20;
			f[1]= 40;
			f[5]= 120;
			f[2]= 60;
			f[6]= 140;
			
			System.out.println("f[0] :"+ f[0]);
			
			int arraysize = f.length;
			
			for (int i=0 ; i<arraysize; i ++) {
				
			System.out.println("f(" +i+"):  " + f[i]);
			
			}*/
			
			
			
			//<datatype>[] variable = new <datatype>[<size>];
				//datatype : int, float, String, class, etc...	
			
			
			System.out.println("String concept");
			System.out.println();
			
			String[] Flight = new String [8];
			
			Flight[0]= "Namaste ";
			Flight[1]= "welcome ";
			Flight[2]= "to ";
			Flight[5]= "AIR INDIA ";
			Flight[4]= "Flight ";
			Flight[3]= "Board";
			
			//System.out.print("    |    ");
			
			for (int i=0 ; i<6 ; i ++) {
			System.out.print(" " +Flight[i]);
			
			}   
		}
	}
