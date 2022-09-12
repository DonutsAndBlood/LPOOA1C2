package a1c1;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PilhaInteiro pilhaInteiro = new PilhaInteiro();
		FilaInteiro filaInteiro = new FilaInteiro();	
		//Faça um aplicativo que vai armazenar vários valores inteiros (o
		//programa pára de armazenar quando o usuário digitar 0 – zero). Se o valor
		//digitado for par ele deve ser armazenado em um pilha. Se for ímpar, ele deve
		//ser armazenado em uma fila
		
		entrada(pilhaInteiro,filaInteiro);
		
		
		//Imprima o valor que está no topo da pilha e no início da fila
		saida(pilhaInteiro,filaInteiro);
		

	}
	
	public static void entrada(PilhaInteiro pilha,FilaInteiro fila){
		
		Scanner scanner = new Scanner(System.in);
		
		int aux = -1;
		
          while (aux != 0){
			
			System.out.println("Digite um valor para ser armazenado:");
			aux = scanner.nextInt();
			
			if(aux == 0) {
				break;
			}
			
			if(aux % 2 == 0) {
				
				System.out.println(pilha.push(aux));
				
			}else {
				
				System.out.println(fila.enQueue(aux));
				
			}
				
		}
		
		
	}
	
	public static void saida(PilhaInteiro pilha,FilaInteiro fila) {
		
        System.out.println("Topo da pilha: "+pilha.topo());
		
		System.out.println("Inicio da fila: "+fila.prim());
		
		
	}
	
	

}
