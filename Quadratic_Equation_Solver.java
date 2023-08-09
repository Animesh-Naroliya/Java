import java.util.Scanner;
import java.text.DecimalFormat;

class Quadratic_Equation_Solver
{
  public static void main(String[] args)
  {
    double a;
        double b;
        double c;
        double Discriminant;

        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = UserInput.nextDouble();
        System.out.print("Enter b: ");
        b = UserInput.nextDouble();
        System.out.print("Enter c: ");
        c=UserInput.nextDouble();
        Discriminant = b*b - 4*a*c;
        DecimalFormat df = new DecimalFormat("0.00");
        if(Discriminant > 0)
        {
            System.out.println("The equation has 2 distinct and real solution.");
            System.out.println("Condition: D > 0.");
            double FirstRoot = (-b + Math.sqrt(Discriminant))/(2*a);
            double SecondRoot = (-b - Math.sqrt(Discriminant))/(2*a);
            System.out.println("Root 1: " + FirstRoot);
            System.out.println("Root 2: " + SecondRoot);
        }
        else if(Discriminant == 0)
        {
            System.out.println("Condition: D = 0.");
            System.out.print("The Equation has only one Real Solution and that is: ");
            double Root = (-b/2*a);
            System.out.print("The repeated root is "+ Root);
        }
        else if(Discriminant < 0)
        {
            System.out.println("Condition: D < 0.");
            System.out.println("The Equation has imaginary roots.");
            
            double RealPart = (-b /2*a);
            double ImaginaryPart=(Math.sqrt(Math.abs(Discriminant))/(2*a));

            System.out.println("Root 1: "+df.format(RealPart)+" + "+ df.format(ImaginaryPart) +" i");
            System.out.println("Root 2: "+df.format(RealPart)+" - "+ df.format(ImaginaryPart)+" i");
        }
        UserInput.close();
  }
}
