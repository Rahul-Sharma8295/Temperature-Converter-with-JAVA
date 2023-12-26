import java.util.Scanner;

class Convert 
{    Scanner r=new Scanner(System.in);
     void faTocel(double ftem)
     {
        System.out.print("\n\n");
        double incel=(ftem-32)*5/9;
        System.out.print(" \t \t \t \t Temerature conveted form Fahrenheit to Celsius "+incel); 
     }


     void faTokel(double ftem)
     {
        System.out.print("\n\n");
        double inkel= (ftem-32)*5/9+273.15;
        System.out.print(" \t \t \t \t Temerature convert from Fahrenheit to  Kelvin "+inkel);        
     }


     void celTofa(double ctem)
     {  System.out.print("\n\n");
        double infa=(ctem * 9/5) + 32;
        System.out.print(" \t \t \t \t Temerature convert form Celcus to  Fahrenheit "+infa);
       
     }

     void celTokel(double ctem)
     {  System.out.print("\n\n");
        double inkel=ctem+273.15;
        System.out.print(" \t \t \t \t Temerature convert from celcus to kelvin  "+inkel);
        
     }

     void kelTofa(double keltem)
     {  System.out.print("\n\n");
        double infa=(keltem-273.15)*1.8+32;
        System.out.print(" \t \t \t \t Temerature convert from kelvin to Fahrenheit  "+infa);
        
     }

    void kelTocel(double keltem)
     {  System.out.print("\n\n");
        double incel=keltem-273.15;
        System.out.print(" \t \t \t \t Temerature convert from kelvin to Celcus  "+incel);
        
     }
     
   
   //Main Function
    public static void main(String args[])
    {
     Convert obj=new Convert();
     Scanner r=new Scanner(System.in);
    for(int i=0;i<5;i++) 
     { 
      System.out.println(" ");
     }
     System.out.println("\t \t \t \t \t \t !! WELCOME !!");
     System.out.println("\n");
     for(int i=0;i<10;i++) 
     { 
      System.out.print("*");
     }
     System.out.println();
     System.out.println("INPUT->>"); 
     System.out.print("\t \t \t \t Enter the Temperature :");
     double Temperature=r.nextDouble();
     System.out.println("\n");
     for(int i=0;i<300;i++) 
     { 
      System.out.print("*");
     }


     System.out.println("NOTE->> ");
     System.out.println("\t \t \t \t Enter the 1 for convert Fahrenheit to celsus");
     System.out.println("\t \t \t \t Enter the 2 for convert celcus to Fahrenheit ");
     System.out.println("\t \t \t \t Enter the 3 for convert Fahrenheit to kelvin");
     System.out.println("\t \t \t \t Enter the 4 for convert celcus to  kelvin" );
     System.out.println("\t \t \t \t Enter the 5 for convert kelvin to Fahrenheit ");
     System.out.println("\t \t \t \t Enter the 6 for convert kelvin to celsus ");
     System.out.println();
     System.out.println();
     
     
     for(int i=0;i<300;i++) 
     { 
      System.out.print("*");
     }


    System.out.println("INPUT->>");
     System.out.print(" \t \t \t \t Choice :");
     int choice=r.nextInt();
    System.out.println();


    for(int i=0;i<300;i++)
      {
        System.out.print("*");
      }

    System.out.println("OUTPUT->>");
    switch(choice)
    {
        case 1:  obj.faTocel(Temperature);
                 break;
        case 2:  obj.celTofa(Temperature);
                 break;
        case 3:  obj.faTokel(Temperature);
                 break;
        case 4:  obj.celTokel(Temperature);
                 break;
        case 5:  obj.kelTofa(Temperature);
                 break;        
        case 6:  obj.kelTocel(Temperature);
                 break;
            
        default: System.out.println("\t \t \t \n Your Input is wrong !! ");
                 System.out.print("\t \t \tPlease First Read the Note !!");
    }
  System.out.println();
  System.out.println();
  
  for(int i=0;i<300;i++) 
     { 
      System.out.print("*");
     }

    }
}