import java.util.Scanner;
public class Maintres {
public static void main(String[] args){
Scanner myObj = new Scanner (System.in);
Double total;
System.out.println ("Digite o número de termos");
Double n = myObj.nextDouble();

System.out.println ("Digite o valor inicial");
double a1 = myObj.nextDouble();

System.out.println ("Digite o valor final");
double an = myObj.nextDouble();

total = n * (a1 + an)/ 2;

System.out.println ("O resultado é: "+ total);

myObj.close();


}

} 
