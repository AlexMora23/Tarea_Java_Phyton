import java.util.Scanner;
public class Mayor_de_tres {
public static void main(String []args){
	int n1,n2,n3;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese un valor entero>");
	n1=sc.nextInt();
	System.out.println("Ingrese un valor entero>");
	n2=sc.nextInt();
	System.out.println("Ingrese un valor entero>");
	n3=sc.nextInt();
	if((n1>n2)&&(n2>n3)){
		System.out.println("El mayor es= "+n1);
	}
	if((n2>n1)&&(n1>n3)){
		System.out.println("El mayor es= "+n2);
	}
	if((n3>n2)&&(n2>n1)){
		System.out.println("El mayor es= "+n3);
		}
	else{
		System.out.println("Los numeros son iguales");
	}
}
}
