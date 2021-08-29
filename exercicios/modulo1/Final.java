package aula1.resolucaoExercicios;

public class Final {

	public static void main(String[] args) {
		
		final String INSTITUICAO ="UTD";
		String curso="Java",modalidade="EAD";
		String aluno1="Maria",aluno2="Ana",aluno3="Davi",aluno4="Matheus";
		double nota1=10.0,nota2=8.50,nota3=9.70,nota4=7.00;
		
		System.out.println("_________________________________________________");
		System.out.println("  ++++++++++      +      +++       +++     +     ");
		System.out.println("  ++++++++++     +++      +++     +++     +++    ");
		System.out.println("     +++        +++++      +++   +++     +++++   ");
		System.out.println("     +++       +++ +++      +++ +++     +++ +++  ");
		System.out.println(" ++  +++      +++++++++      ++ ++     +++++++++ ");
		System.out.println("  ++++++     +++++++++++      +++     +++++++++++ ");
		System.out.println("   ++++     +++       +++      +     +++       +++");
		System.out.println(" _____- Universidade do Trabalho Digital -________");
		System.out.println("curso: "+curso+"      modalidade: "+modalidade);
		System.out.printf("Aluno(a) \tnota \n");
		System.out.printf("=====================\n");
		System.out.printf("%s \t\t%.1f\n",aluno1,nota1);	
		System.out.printf("%s \t\t%.2f\n",aluno2,nota2);
		System.out.printf("%s \t\t%.2f\n",aluno3,nota3);
		System.out.printf("%s \t%.2f\n",aluno4,nota4);

	}

}
