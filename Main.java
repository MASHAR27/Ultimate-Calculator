import java.util.Scanner;
public class Main extends Chemistry {
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.println("Choose which function : ");
	      System.out.println("1 for fahrenheit To Celsius");
	      System.out.println(" 2 for celsius To Fahrenheit ");
	      System.out.println("3 for celsius To Kelvin  ");
	      System.out.println("4 for  Ideal Gas Equation ");
	      System.out.println("5 for decTohex ");
	      System.out.println("6 for hexTodec ");
	      System.out.println("7 for binTodec");
	      System.out.println("8 for decTobin ");
	      System.out.println("9 for binTohex");
	      System.out.println("10 for hexTobin ");
	      System.out.println("11 for  LogicTable" );
	      System.out.println("12 for  SUVATCalculator/kinematics ");
	      System.out.println("13 for ForceMassAccCalculator ");
	      System.out.println("14 for CollisionCalculator");
	      System.out.println("15 for KineticEnergyCalculator");
	      System.out.println("16 for StandardDeviation");
	      System.out.println("17 for Dotproduct");
	      System.out.println("18 for Reduced Row Echelon form");
	      
	      int choice = input.nextInt();

	      switch (choice) {
	         case 1:
	            System.out.println("Enter the temperature in Fahrenheit:");
	            double fahrenheit = input.nextDouble();
	            double celsius = fahrenheitToCelsius(fahrenheit);
	            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
	            break;
	         case 2:
	            System.out.println("Enter the temperature in Celsius:");
	            double celsius2 = input.nextDouble();
	            double fahrenheit2 = celsiusToFahrenheit(celsius2);
	            System.out.println(celsius2 + " degrees Celsius is " + fahrenheit2 + " degrees Fahrenheit.");
	            break;
	         case 3:
	            System.out.println("Enter the temperature in Celsius:");
	            double celsius3 = input.nextDouble();
	            double kelvin = celsiusToKelvin(celsius3);
	            System.out.println(celsius3 + " degrees Celsius is " + kelvin + " Kelvin.");
	            break;
	         case 4:
	        	 IdealGasEquationCalculator calculator = new IdealGasEquationCalculator();
	             calculator.main(args);
	             break;
	         case 5: 
	        	 System.out.println("Enter the decimal number ");
	        	 int dec = input.nextInt();
	        	 String hex = decTohex(dec);
	        	 System.out.println("Hexadecimal value is "+hex);
	        	 break;
	         case 6: 
	        	 System.out.println("Enter the hexadecimal value ");
	        	 String h = input.next();
	        	 int d = hexTodec(h);
	        	 System.out.println("decimal value is "+d);
	        	 break;	
	         case 7: 
	        	 System.out.println("Enter the binary value ");
	        	 String b = input.next();
	        	 int num = binTodec(b);
	        	 System.out.println("decimal value is "+num);
	        	 break;		 
	         case 8:
	        	 System.out.println("Enter the decimal value ");
	        	 int ok = input.nextInt();
	        	 String s = decTobin(ok);
	        	 System.out.println("binary value is "+s);
	            break;
	         case 9:
	        	 System.out.println("Enter the binary value ");
	        	 String k = input.next();
	        	 String o = binTohex(k);
	        	 System.out.println("hexadecimal value is "+o);
	            break;
	         case 10:
	        	 System.out.println("Enter the hexadecimal value ");
	        	 String p = input.next();
	        	 String q = hexTobin(p);
	        	 System.out.println("binary  value is "+q);
	            break;
	            
	         case 11:
	        	 System.out.println("Enter the number of inputs for logic table: ");
	        	 int n = input.nextInt();
	        	 LogicTable(n);
	        	 break;
	        	 
	         case 12:
	        	 SUVATCalculator pq = new SUVATCalculator();
	             pq.main(args);
	        	 break;
	         case 13:
	        	 ForceMassAccCalculator rq = new ForceMassAccCalculator();
	             rq.main(args);
	        	 break; 
	        	 
	         case 14:
	        	 CollisionCalculator rlq = new CollisionCalculator();
	             rlq.main(args);
	        	 break; 
	        	 
	         case 15:
	        	 KineticEnergyCalculator il = new KineticEnergyCalculator();
	             il.main(args);
	        	 break;  
	         case 16:
	        	 System.out.println("Enter the size of the array:");
	             int size = input.nextInt();

	             double[] array = new double[size];

	             System.out.println("Enter the elements of the array:");
	             for (int i = 0; i < size; i++) {
	                 array[i] = input.nextDouble();
	             }
	             double sd = calculateStandardDeviation(array);
	             System.out.println("the standard deviation for the values you entered is "+sd);
	        	 break;
	        	 
	         case 17:
	        	 
	        	 System.out.println("Enter the size of the first vector:");
	             int si = input.nextInt();

	             double[] v1 = new double[si];

	             System.out.println("Enter the elements of the first vector:");
	             for (int i = 0; i < si; i++) {
	                 v1[i] = input.nextDouble();
	             }
	        	 
	             System.out.println("Enter the size of the second vector:");
	             int s2 = input.nextInt();

	             double[] v2 = new double[s2];

	             System.out.println("Enter the elements of the second vector:");
	             for (int i = 0; i < s2; i++) {
	                 v2[i] = input.nextDouble();
	             }
	             double dp = dotProduct(v1,v2);
	             System.out.println("Dotproduct is "+dp);
	        	 
	        	 break;
	        	 
	         case 18:
	        	
	             System.out.print("Enter the number of rows: ");
	             int numRows = input.nextInt();
	             System.out.print("Enter the number of columns: ");
	             int numCols = input.nextInt();
	             double[][] op = new double[numRows][numCols];
	             System.out.println("Enter the elements of the matrix:");
	             for (int i = 0; i < numRows; i++) {
	                 for (int j = 0; j < numCols; j++) {
	                     System.out.print("Enter element [" + i + "][" + j + "]: ");
	                     op[i][j] = input.nextDouble();
	                 }
	             }
	             double[][] rp = rref(op);
	             System.out.println("The reduced row echelon form of the matrix is ");
	             for (int i = 0; i < numRows; i++) {
	                 for (int j = 0; j < numCols; j++) {
	                     System.out.print(op[i][j] + " ");
	                 }
	                 System.out.println();
	             }
	            
	        	 break;
	        	 
	        	 
	         default:
	            System.out.println("Invalid choice.");
	            break;
	      }

	   }
}
