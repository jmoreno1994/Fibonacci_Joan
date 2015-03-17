import java.util.Scanner;


public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int numero,fibo1,fibo2,i;
	        do{
	            System.out.print("Escriu un número: ");
	            numero = sc.nextInt();
	        }while(numero<=1);
	        System.out.println("Els " + numero + " primers números de la sèria Fibonacci són:"); 

	        fibo1=1;
	        fibo2=1; 

	        System.out.print(fibo1 + " ");
	        for(i=2;i<=numero;i++){
	             System.out.print(fibo2 + " ");
	             fibo2 = fibo1 + fibo2;
	             fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	}

}
