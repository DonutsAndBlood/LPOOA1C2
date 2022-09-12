package a1c1;

import java.util.LinkedList;

public class FilaInteiro {

	private LinkedList<Integer> fila = new LinkedList<>();
	
	
	
	//Verificar se a fila está vazia
	public boolean eVazia() {
		
	if(this.fila.size() <= 0 ) {
			
		return true;
		}
		
		return false;	
	}
	
	
	//Enqueue (Inserir um elemento no fim da fila
	public boolean enQueue(int elem) {
		
		if(eVazia()){
		
			this.fila.addFirst(elem);
			return true;
		}else {
			this.fila.addLast(elem);
			return true;
			}			
	}
	
	//Dequeue (Remover o elemento do início da fila)
	public boolean deQueue() {
		
		if(eVazia()) {
			
			return false;
			
		}else {
			
			this.fila.removeFirst();
			return true;
		}
		
	}
	
	//Retornar o tamanho da fila
		public int tamFila(){
			
			return this.fila.size();
			
		}
	
		//Retorna o primeiro
		public int prim() {
			
			return this.fila.getFirst();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
