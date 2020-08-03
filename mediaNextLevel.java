
package projetoIniciantes;
import java.util.Scanner;
import java.text.DecimalFormat;

public class primeiroProjeto {
	
	public static void main(String[] args) {
		
		// Este programa consiste em notas de primeiro e segundo bimestre
		
		System.out.println("--Média do Aluno Next Level--\n"); 
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome =  	sc.nextLine();
		System.out.println("Vamos para primeiro Bimestre\n");
				
		
		//Primeiro bimestre para a acensão de notas.
		System.out.print("Digite a nota da Prova: ");		
		double prova = sc.nextDouble();
		System.out.print("Digite a nota do Projeto: ");
		double projeto = sc.nextDouble();
		System.out.print("Digite a nota da Lista de exercicios: ");
		double lista = sc.nextDouble();
		System.out.print("Digite a nota da conclusão de contribuições: ");
		double contribuicao = sc.nextDouble();
		
				
		//Segundo bimestre para a acensão de notas.		
		System.out.println("\n");
		System.out.println("Vamos para Segundo Bimestre");		
		System.out.print("Digite a nota da Prova: ");							
		double prova1 = sc.nextDouble();
		System.out.print("Digite a nota do Projeto: ");
		double projeto1 = sc.nextDouble();
		System.out.print("Digite a nota da Lista de exercicios: ");
		double lista1 = sc.nextDouble();
		System.out.print("Digite a nota da conclusão de contribuições: ");
		double contribuicao1 = sc.nextDouble();
		

		//Calculo da média obtida 1º Bimestre
		System.out.println("\n");
        DecimalFormat formatador = new DecimalFormat("0.00");
		double media= ((prova*3)+(projeto*3)+(lista*2)+(contribuicao*3))/11;     
		System.out.print("A média do primeiro bimestre ficou em: "+formatador.format(media)+"\n");
		
		//Calculo da média obtida 2º Bimestre.
		double media1= ((prova1*3)+(projeto1*3)+(lista1*2)+(contribuicao1*3))/11; 
		System.out.print("A média do segundo bimestre ficou em:  "+formatador.format(media1)+"\n");
		double mediafinal = (media+media1)/2;										
		
		
		//Media Final.
		
				if(mediafinal >=8) {
					System.out.println("O aluno "+nome+" foi aprovado com a nota "+formatador.format(mediafinal)+" \nCaso queira arredondar a mesma ficaria em : "+ Math.round((mediafinal)));		//Comando IF/ElSE para estabelecer se foi ou não aprovado.
				}else{
					System.out.println("O aluno "+nome+" foi reprovado com a nota  "+formatador.format(mediafinal)+" \nCaso queira arredondar a mesma ficaria em : "+ Math.round((mediafinal)));
					System.out.println("\nO aluno terá que realizar uma avaliação final e sua nota terá de ser superior a  "+formatador.format((mediafinal-10.0)*-1));
				}
	}
}
					
					
					
					
					
					
					
					
					
					
					
					
					
