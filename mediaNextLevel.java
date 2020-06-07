package primeiroProjeto;
import java.util.Scanner;

public class mediaNextLevel{
	
	public static void main(String[] args) {
		
		System.out.println("--Média do Aluno Next Level--\n"); // Este programa consiste em notas de primeiro e segundo bimestre
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome =  	sc.nextLine();
		System.out.println("Vamos para primeiro Bimestre: ");
				
		
		System.out.println("Digite a nota da Prova");		//Primeiro bimestre para a acensão de notas.
		double prova = sc.nextDouble();
		System.out.println("Digite a nota do Projeto");
		double projeto = sc.nextDouble();
		System.out.println("Digite a nota da Lista de exercicios");
		double lista = sc.nextDouble();
		System.out.println("Digite a nota da conclusão de contribuições");
		double contribuicao = sc.nextDouble();
		double media= ((prova*3)+(projeto*3)+(lista*2)+(contribuicao*3))/11;     //Calculo da média obtida pelas notas relatadas.
		System.out.println("A média do primeiro bimestre ficou em  "+media+"\n");

		System.out.println("Vamos para Segundo Bimestre: ");
		
		System.out.println("Digite a nota da Prova");							//Segundo bimestre para a acensão de notas.
		double prova1 = sc.nextDouble();
		System.out.println("Digite a nota do Projeto");
		double projeto1 = sc.nextDouble();
		System.out.println("Digite a nota da Lista de exercicios");
		double lista1 = sc.nextDouble();
		System.out.println("Digite a nota da conclusão de contribuições");
		double contribuicao1 = sc.nextDouble();
		double media1= ((prova1*3)+(projeto1*3)+(lista1*2)+(contribuicao1*3))/11; //Calculo da média obtida pelas notas relatadas.
		System.out.println("A média do segundo bimestre ficou em "+media1+"\n");
		double mediafinal = (media+media1)/2;										//Media Final.
		
		
		
				if(mediafinal >=8) {
					System.out.println("O aluno "+nome+" foi aprovado com nota "+mediafinal+" \nCaso queira arredondar a mesma ficaria em : "+ Math.round((mediafinal)));		//Comando IF/ElSE para estabelecer se foi ou não aprovado.
				}else{
					System.out.println("O aluno "+nome+" foi reprovado com nota  "+mediafinal+" \nCaso queira arredondar a mesma ficaria em : "+ Math.round((mediafinal)));
					System.out.println("\nO aluno terá que realizar uma avaliação final e sua nota terá de ser superior ou igual a  "+(mediafinal-10.0)*-1);
					
}}}
