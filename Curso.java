package aula1.resolucaoExercicios;

public class Curso {

	public static void main(String[] args) {
		
		final String INSTITUICAO = "UTD"; // Para criar uma constante basta colocar a palavra final + nome da constante em maísculo e o valor dela.
		
		//String nome="Osvaldo Souza",curso="Java", modalidade="EAD";
		
		//Haverá casos de criar variaveis sem o valor, para inserir depois o valor.
		//EX:
		//String nome="" - vazio entre aspas se ou String nome=null (iniciar nula)
		//ou String vazia, em caso de numeros por um zero, no boolean: false
		
		String nome,curso="Java",modalidade="EAD";
		
		nome="Osvaldo";
		
		int idade=34;
		
		char sexo='M';
		
		System.out.println("=============="+INSTITUICAO+"=================");
		System.out.println("=======Ficha de cadastro=======");
		System.out.println("Nome: "+nome+" idade: "+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("curso: "+curso+"   modalidade: "+modalidade);
		
		System.out.println("=============="+INSTITUICAO+"=================");
		System.out.println("=========Ficha de cadastro=========");
		System.out.printf("Nome:  %s  \tidade: %d\n",nome,idade);
		System.out.printf("sexo: %c\n",sexo);
		System.out.printf("curso: %s  modalidade: %s",curso,modalidade);
		
		

	}

}
