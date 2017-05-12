
import java.util.*;
public class generar {
	public static void main(String args[]){
Scanner sc = new Scanner(System.in);
	int num;
	String car;
	System.out.println("Ingrese un valor entero >");
	num = sc.nextInt();
	System.out.println("Ingrese un caracter >");
	car = sc.next();
	
	for (int i=0;i<num;i++)
    System.out.println(car);
 
}
}
