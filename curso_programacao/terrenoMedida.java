import java.util.Scanner; 
public class terrenoMedida {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble(); // declarando variável e fazendo leitura
		double comprimento = sc.nextDouble(); 
		double metroQuadrado = sc.nextDouble(); 
		
		double area = largura * comprimento; 
		double preco = area * metroQuadrado; 
		
		System.out.println("AREA = "+ area);
		System.out.println("PREÇO = " + preco);
		
		sc.close();
	}

}
