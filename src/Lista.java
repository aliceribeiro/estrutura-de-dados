import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Stack<Integer> pilha = new Stack<Integer>();
		Queue<Integer> fila = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		while (!lista.isEmpty()) {
			Integer primeiroElemento = lista.get(0);
			pilha.push(primeiroElemento);
			lista.remove(0);
		}
				
		while (!pilha.isEmpty()) {
			fila.add(pilha.pop());
		}
		
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		
		while (!lista.isEmpty()) {
			Integer primeiroElemento = lista.get(0);
			pilha.push(primeiroElemento);
			lista.remove(0);
		}
		
		while (!pilha.isEmpty()) {
			fila.add(pilha.pop());
		}
		System.out.println("Os elementos da fila são: " + fila);		
	}
}
