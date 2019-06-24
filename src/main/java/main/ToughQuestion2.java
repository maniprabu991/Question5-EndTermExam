package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	System.out.printf("%.3f", cal.calculateEnergy(bread));
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread)+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.printf("%.3f",cal.calculateEnergy(bread,jam));
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam)+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.printf("%.3f",cal.calculateEnergy(bread,jam,butter)); 
                        	System.out.println(" kJ of energy generated from "+cal.calculateCalories(bread,jam,butter)+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
            double calculateCalories(int bread) {
            //you have to overload this function for three parameters refer the question
            double cal = (bread *74);
            	return cal;
            }
            	double calculateEnergy(int bread)
            	{
            		double energy = (bread * 74) * 4.1868;
            		return energy;
            	}
            	 double calculateCalories(int bread, int jam) {
                     double cal1 = (bread *74) + (jam * 26);
                     	return cal1;
                     }
                     	double calculateEnergy(int bread,int jam)
                     	{
                     		double energy1 = ((bread * 74)+(jam * 26)) * 4.1868;
                     		return energy1;
                     	}
                     	double calculateCalories(int bread, int jam, int butter) {
                            double cal2 = (bread *74) + (jam * 26)+(butter * 102);
                            	return cal2;
                            }
                            	double calculateEnergy(int bread,int jam,int butter)
                            	{
                            		double energy2 = ((bread * 74)+(jam * 26)+(butter * 102)) * 4.1868;
                            		return energy2;
                            	}
            
}