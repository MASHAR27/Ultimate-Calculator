import java.util.Scanner;
public class Chemistry {

	public static double fahrenheitToCelsius(double fahrenheit) {
	    double celsius = (fahrenheit - 32) * 5/9;
	    return celsius;
	}

	public static double celsiusToFahrenheit(double celsius) {
	    double fahrenheit = celsius * 9/5 + 32;
	    return fahrenheit;
	}

	
	public static double celsiusToKelvin(double celsius) {
	    double kelvin = celsius + 273.15;
	    return kelvin;
	}

	
	
	

static public class IdealGasEquationCalculator {
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Which variable do you want to calculate?\n");
	        System.out.println("1. Pressure");
	        System.out.println("2. Volume");
	        System.out.println("3. Amount of gas");
	        System.out.println("4. Temperature");
	        int option = input.nextInt();
	        
	        double pressure, volume, amount, temperature;
	        
	        switch (option) {
	            case 1:
	                System.out.print("Enter the volume of the gas in cubic meters: ");
	                volume = input.nextDouble();
	                System.out.print("Enter the amount of the gas in moles: ");
	                amount = input.nextDouble();
	                System.out.print("Enter the temperature of the gas in Kelvin: ");
	                temperature = input.nextDouble();
	                pressure = (amount * 8.314 * temperature) / volume;
	                System.out.println("The pressure of the gas is " + pressure + " Pascals.");
	                break;
	                
	            case 2:
	                System.out.print("Enter the pressure of the gas in Pascals: ");
	                pressure = input.nextDouble();
	                System.out.print("Enter the amount of the gas in moles: ");
	                amount = input.nextDouble();
	                System.out.print("Enter the temperature of the gas in Kelvin: ");
	                temperature = input.nextDouble();
	                volume = (amount * 8.314 * temperature) / pressure;
	                System.out.println("The volume of the gas is " + volume + " cubic meters.");
	                break;
	                
	            case 3:
	                System.out.print("Enter the pressure of the gas in Pascals: ");
	                pressure = input.nextDouble();
	                System.out.print("Enter the volume of the gas in cubic meters: ");
	                volume = input.nextDouble();
	                System.out.print("Enter the temperature of the gas in Kelvin: ");
	                temperature = input.nextDouble();
	                amount = (pressure * volume) / (8.314 * temperature);
	                System.out.println("The amount of gas is " + amount + " moles.");
	                break;
	                
	            case 4:
	                System.out.print("Enter the pressure of the gas in Pascals: ");
	                pressure = input.nextDouble();
	                System.out.print("Enter the volume of the gas in cubic meters: ");
	                volume = input.nextDouble();
	                System.out.print("Enter the amount of the gas in moles: ");
	                amount = input.nextDouble();
	                temperature = (pressure * volume) / (amount * 8.314);
	                System.out.println("The temperature of the gas is " + temperature + " Kelvin.");
	                break;
	                
	            default:
	                System.out.println("Invalid option!");
	                break;
	        }
	        
	        input.close();
	    }

	}
	
	
	
	
public static String decTohex(int dec) {
	 String hex = Integer.toHexString(dec);
	return hex;
	
}



public static  int  hexTodec(String hex) {
	int dec = Integer.parseInt(hex, 16);
	return dec;
	
	
}


	
public static  int binTodec(String bin) {
	int dec = Integer.parseInt(bin, 2);
	return dec;
	
}


public static  String decTobin(int dec) {
	String bin = Integer.toBinaryString(dec);
	return bin;
	
}



public static String binTohex(String bin){
	  int dec = Integer.parseInt(bin, 2);
	  String hex = Integer.toHexString(dec); 
   	 return hex;
   	 
    }


public static  String hexTobin(String hex) {
	  int dec = Integer.parseInt(hex, 16);
	  String bin = Integer.toBinaryString(dec);
	  return bin;
	  
 }
 
 
 
 



public static void LogicTable(int numVariables) {
   int numRows = (int) Math.pow(2, numVariables);
   String[] columnHeaders = new String[numVariables];
   for (int i = 0; i < numVariables; i++) {
       columnHeaders[i] = "Variable " + (char) ('A' + i);
   }
   for (String columnHeader : columnHeaders) {
       System.out.print(columnHeader + "\t");
   }
   System.out.println("Result");
   for (int row = 0; row < numRows; row++) {
       String binaryString = Integer.toBinaryString(row);
       while (binaryString.length() < numVariables) {
           binaryString = "0" + binaryString;
       }

       boolean result = true;
       for (int i = 0; i < numVariables; i++) {
           boolean variableValue = binaryString.charAt(i) == '1';

           result = result && variableValue;
       }

       for (int i = 0; i < numVariables; i++) {
           System.out.print(binaryString.charAt(i) + "\t\t");
       }
       System.out.println(result);
   }
}















static public class SUVATCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which variable do you want to calculate?\n");
        System.out.println("1. Initial velocity (u)");
        System.out.println("2. Final velocity (v)");
        System.out.println("3. Acceleration (a)");
        System.out.println("4. Time (t)");
        System.out.println("5. Displacement (s)");
        int option = input.nextInt();
        
        double u, v, a, t, s;
        
        switch (option) {
            case 1:
                System.out.print("Enter the final velocity of the object in meters per second: ");
                v = input.nextDouble();
                System.out.print("Enter the acceleration of the object in meters per second squared: ");
                a = input.nextDouble();
                System.out.print("Enter the time taken by the object in seconds: ");
                t = input.nextDouble();
                s = v*t - 0.5*a*t*t;
                u = (2*s)/t - v;
                System.out.println("The initial velocity of the object is " + u + " meters per second.");
                break;
                
            case 2:
                System.out.print("Enter the initial velocity of the object in meters per second: ");
                u = input.nextDouble();
                System.out.print("Enter the acceleration of the object in meters per second squared: ");
                a = input.nextDouble();
                System.out.print("Enter the time taken by the object in seconds: ");
                t = input.nextDouble();
                s = u*t + 0.5*a*t*t;
                v = (2*s)/t - u;
                System.out.println("The final velocity of the object is " + v + " meters per second.");
                break;
                
            case 3:
                System.out.print("Enter the initial velocity of the object in meters per second: ");
                u = input.nextDouble();
                System.out.print("Enter the final velocity of the object in meters per second: ");
                v = input.nextDouble();
                System.out.print("Enter the time taken by the object in seconds: ");
                t = input.nextDouble();
                a = (v - u)/t;
                s = u*t + 0.5*a*t*t;
                System.out.println("The acceleration of the object is " + a + " meters per second squared.");
                break;
                
            case 4:
                System.out.print("Enter the initial velocity of the object in meters per second: ");
                u = input.nextDouble();
                System.out.print("Enter the final velocity of the object in meters per second: ");
                v = input.nextDouble();
                System.out.print("Enter the acceleration of the object in meters per second squared: ");
                a = input.nextDouble();
                t = (v - u)/a;
                s = u*t + 0.5*a*t*t;
                System.out.println("The time taken by the object is " + t + " seconds.");
                break;
                
            case 5:
                System.out.print("Enter the initial velocity of the object in meters per second: ");
                u = input.nextDouble();
                System.out.print("Enter the final velocity of the object in meters per second: ");
                v = input.nextDouble();
                System.out.print("Enter the acceleration of the object in meters per second squared: ");
                a = input.nextDouble();
                s = (v*v - u*u)/(2*a);
                System.out.println("The displacement of the object is " + s + " meters.");












        }


    }
}  




static public class ForceMassAccCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which variable do you want to calculate?\n");
        System.out.println("1. Force");
        System.out.println("2. Mass");
        System.out.println("3. Acceleration");
        int option = input.nextInt();

        double force = 0.0, mass = 0.0, acceleration = 0.0;

        switch (option) {
            case 1:
                System.out.print("Enter the mass in kilograms: ");
                mass = input.nextDouble();
                System.out.print("Enter the acceleration in meters per second squared: ");
                acceleration = input.nextDouble();
                force = mass * acceleration;
                System.out.println("The force is " + force + " Newtons.");
                break;

            case 2:
                System.out.print("Enter the force in Newtons: ");
                force = input.nextDouble();
                System.out.print("Enter the acceleration in meters per second squared: ");
                acceleration = input.nextDouble();
                mass = force / acceleration;
                System.out.println("The mass is " + mass + " kilograms.");
                break;

            case 3:
                System.out.print("Enter the force in Newtons: ");
                force = input.nextDouble();
                System.out.print("Enter the mass in kilograms: ");
                mass = input.nextDouble();
                acceleration = force / mass;
                System.out.println("The acceleration is " + acceleration + " meters per second squared.");
                break;

            default:
                System.out.println("Invalid option!");
                break;
        }

        
        
    }
    
}



static public class CollisionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which variable do you want to calculate?\n");
        System.out.println("1. Mass of object 1");
        System.out.println("2. Velocity of object 1");
        System.out.println("3. Mass of object 2");
        System.out.println("4. Velocity of object 2");
        int option = input.nextInt();

        double m1, v1, m2, v2;
        double p1, p2, pTotal, vTotal;

        switch (option) {
            case 1:
                System.out.print("Enter the mass of object 2 in kg: ");
                m2 = input.nextDouble();
                System.out.print("Enter the velocity of object 2 in m/s: ");
                v2 = input.nextDouble();
                System.out.print("Enter the total momentum before the collision in kgm/s: ");
                pTotal = input.nextDouble();
                p2 = m2 * v2;
                m1 = (pTotal - p2) / v2;
                System.out.println("The mass of object 1 is " + m1 + " kg.");
                break;

            case 2:
                System.out.print("Enter the mass of object 1 in kg: ");
                m1 = input.nextDouble();
                System.out.print("Enter the mass of object 2 in kg: ");
                m2 = input.nextDouble();
                System.out.print("Enter the velocity of object 2 in m/s: ");
                v2 = input.nextDouble();
                System.out.print("Enter the total momentum before the collision in kgm/s: ");
                pTotal = input.nextDouble();
                p2 = m2 * v2;
                v1 = (pTotal - p2) / m1;
                System.out.println("The velocity of object 1 is " + v1 + " m/s.");
                break;

            case 3:
                System.out.print("Enter the mass of object 1 in kg: ");
                m1 = input.nextDouble();
                System.out.print("Enter the velocity of object 1 in m/s: ");
                v1 = input.nextDouble();
                System.out.print("Enter the total momentum before the collision in kgm/s: ");
                pTotal = input.nextDouble();
                p1 = m1 * v1;
                m2 = (pTotal - p1) / v1;
                System.out.println("The mass of object 2 is " + m2 + " kg.");
                break;

            case 4:
                System.out.print("Enter the mass of object 1 in kg: ");
                m1 = input.nextDouble();
                System.out.print("Enter the velocity of object 1 in m/s: ");
                v1 = input.nextDouble();
                System.out.print("Enter the mass of object 2 in kg: ");
                m2 = input.nextDouble();
                System.out.print("Enter the total momentum before the collision in kgm/s: ");
                pTotal = input.nextDouble();
                p1 = m1 * v1;
                v2 = (pTotal - p1) / m2;
                System.out.println("The velocity of object 2 is " + v2 + " m/s.");
                break;

            default:
                System.out.println("Invalid option!");
                break;
        }

       
    }
}




static public class KineticEnergyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which variable do you want to calculate?");
        System.out.println("1. Kinetic Energy");
        System.out.println("2. Mass");
        System.out.println("3. Velocity");

        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the mass in kilograms:");
                double mass1 = input.nextDouble();
                System.out.println("Enter the velocity in meters per second:");
                double velocity1 = input.nextDouble();
                double kineticEnergy = 0.5 * mass1 * velocity1 * velocity1;
                System.out.printf("The kinetic energy is %.2f joules.\n", kineticEnergy);
                break;
            case 2:
                System.out.println("Enter the kinetic energy in joules:");
                double kineticEnergy2 = input.nextDouble();
                System.out.println("Enter the velocity in meters per second:");
                double velocity2 = input.nextDouble();
                double mass2 = 2 * kineticEnergy2 / (velocity2 * velocity2);
                System.out.printf("The mass is %.2f kilograms.\n", mass2);
                break;
            case 3:
                System.out.println("Enter the kinetic energy in joules:");
                double kineticEnergy3 = input.nextDouble();
                System.out.println("Enter the mass in kilograms:");
                double mass3 = input.nextDouble();
                double velocity3 = Math.sqrt((2 * kineticEnergy3) / mass3);
                System.out.printf("The velocity is %.2f meters per second.\n", velocity3);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        
    }
}




 public static double calculateStandardDeviation(double[] values) {
    double sum = 0.0;
    for (double value : values) {
        sum += value;
    }
    double mean = sum / values.length;
    double variance = 0.0;
    for (double value : values) {
        variance += Math.pow(value - mean, 2);
    }
    variance /= values.length;
    double standardDeviation = Math.sqrt(variance);

    return standardDeviation;
}

public static double dotProduct(double[] vector1, double[] vector2) {

    if (vector1.length != vector2.length) {
        throw new IllegalArgumentException("Vectors must have the same length");
    }
 
    double dotProduct = 0;
    for (int i = 0; i < vector1.length; i++) {
        dotProduct += vector1[i] * vector2[i];
    }
    
    return dotProduct;
}


public static double[][] rref(double[][] A) {
    int numRows = A.length;
    int numCols = A[0].length;
    int lead = 0;
    for (int r = 0; r < numRows; r++) {
        if (lead >= numCols) {
            break;
        }
        int i = r;
        while (A[i][lead] == 0) {
            i++;
            if (i == numRows) {
                i = r;
                lead++;
                if (lead == numCols) {
                    return A;
                }
            }
        }
        double[] temp = A[i];
        A[i] = A[r];
        A[r] = temp;
        double lv = A[r][lead];
        for (int j = 0; j < numCols; j++) {
            A[r][j] /= lv;
        }
        for (int i2 = 0; i2 < numRows; i2++) {
            if (i2 != r) {
                double lv2 = A[i2][lead];
                for (int j = 0; j < numCols; j++) {
                    A[i2][j] -= lv2 * A[r][j];
                }
            }
        }
        lead++;
    }
    return A;
}






	
	
	
}
