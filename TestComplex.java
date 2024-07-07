import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

      System.out.print("Enter complex number 1 (real and imaginary part): ");
      double r1=scanner.nextDouble();
      double i1=scanner.nextDouble();
      Mycomplex num1=new Mycomplex(r1,i1);
      
      System.out.print("Enter complex number 2 (real and imaginary part): ");
      double r2=scanner.nextDouble();
      double i2=scanner.nextDouble();
      Mycomplex num2=new Mycomplex(r2,i2);
      scanner.close();

      System.out.println("\n");
      System.out.println("Number 1 is: ("+num1.getReal()+" + "+num1.getImag()+")");
      if(num1.isReal()){
          System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is a pure real number");
      }
      else{
         System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is NOT a pure real number");
      }
      if(num1.isImaginary()){
          System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is a pure imaginary number");
      }
      else{
         System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is NOT a pure imaginary number");
      }

      System.out.println("\n");
      System.out.println("Number 2 is: ("+num2.getReal()+" + "+num2.getImag()+")");
      if(num2.isReal()){
          System.out.println("("+num2.getReal()+" + "+num2.getImag()+") is a pure real number");
      }
      else{
         System.out.println("("+num2.getReal()+" + "+num2.getImag()+") is NOT a pure real number");
      }
      if(num1.isImaginary()){
          System.out.println("("+num2.getReal()+" + "+num2.getImag()+") is a pure imaginary number");
      }
      else{
         System.out.println("("+num2.getReal()+" + "+num2.getImag()+") is NOT a pure imaginary number");
      }

      System.out.println("\n");
      if(num1.equals(num2)){
          System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is equal to "+"("+num2.getReal()+" + "+num2.getImag()+")");
      }
      else{
         System.out.println("("+num1.getReal()+" + "+num1.getImag()+") is NOT equal to "+"("+num2.getReal()+" + "+num2.getImag()+")");
      }
      System.out.println("("+num1.getReal()+" + "+num1.getImag()+") + ("+num2.getReal()+" + "+num2.getImag()+") = ("+num1.addNew(num2).getReal()+" + "+num1.addNew(num2).getImag()+"i)");
    }
}
