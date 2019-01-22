/*Importando Locale, para deixar o numero float com ponto e não vírgula*/
import java.util.Locale;
/*Publicando minha primeira Classe no Java*/
public class Main {

	public static void main(String[] args) {
		/*Declarando variável*/
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31; 
		double renda = 4000.0; 
		/*Lendo a entrada da variável*/
		System.out.println(y);
		System.out.println(x);
		/*Controlando a quantidade de casas decimais: */
		System.out.printf("%.2f%n", x);
		/*Agora com 4 casas decimais: */
		/*System.out.printf("%.4n%n", x);*/
		/*Usando Locale para deixar no padrão USA*/
		Locale.setDefault(Locale.US);
		/*Concatenando: */
		System.out.println("O resultado final é "+x+" METROS!");
		/*Concatenando com o printf*/
		System.out.printf("O resultado final é %.2f%n",x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		

	}

}
