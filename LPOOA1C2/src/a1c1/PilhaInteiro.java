package a1c1;

import java.util.LinkedList;

public class PilhaInteiro {

	private LinkedList<Integer> pilha = new LinkedList<>();
	

	//Verificar se a pilha está vazia
	public boolean eVazia() {
		
		if(this.pilha.size() <= 0 ) {
			
			
			return true;
		}
		
		
	return false;	
	}
	
	
	//Push (Inserir um elemento no topo da pilha)
	public boolean push(int elem) {
		
		if(eVazia()) {
			
			this.pilha.addFirst(elem);
			return true;
		}else {
			this.pilha.addLast(elem);
			return true;
		}
	}
	
	//Pop (Remover o elemento do topo da pilha
	public boolean pop(){
		
		if(eVazia()) {
			
			return false;
			
		}else {
			
			this.pilha.removeLast();
			return true;
			
		}
	}
	
	//Retornar o tamanho da pilha
	public int tamPilha(){
		
		return this.pilha.size();
		
	}
	
	
	//Retorna o topo
	public int topo() {
		
		return this.pilha.getLast();
	}
	
	
	
	
}
