import java.util.Scanner;
public class Mayor {
public static void main(String []args){
	int n1,n2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese un valor entero>");
	n1=sc.nextInt();
	System.out.println("Ingrese un valor entero>");
	n2=sc.nextInt();
	if(n1>n2){
		System.out.println("El mayor es= "+n1);
	}
	if(n2>n1){
		System.out.println("El mayor es= "+n2);
		}
	
}
}
