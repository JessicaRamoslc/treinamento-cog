import java.util.Scanner; 
public class MainCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		/*Encadeamento de estruturas condicionais: */
		// if -> else -> else (dentro do primeiro else)
		
		int hora; 
		
		System.out.println("Quantas horas?");		
		hora = sc.nextInt();
		
		/*Quando temos apenas um comando dentro do if/else, podemos retirar as chaves.*/
		
		if (hora < 12) 			
			System.out.println("Bom dia!");			
		
		/*Dentro desse else, eu já tenho ctz que a hora é maior que 12*/
		else 
			
			if( hora < 18) {
				System.out.println("Boa tarde!");
			
			}
			else {
				System.out.println("Boa Noite!");
				
			
			
			
		}		
		sc.close();	
	}

}
