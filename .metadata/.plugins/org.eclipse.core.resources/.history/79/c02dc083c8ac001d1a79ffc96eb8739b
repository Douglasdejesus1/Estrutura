package one.aula8;

import java.util.Objects;
import java.util.Stack;

public class IntefaceStack {
	public static void main(String[] args) {
		// MÉTODOS DA PILHA .push(),.search(),.pop(),.peek(),.empty()
		
		Stack<CarroStack> stackCarros = new Stack<>();
		stackCarros.push(new CarroStack("Ford"));
		stackCarros.push(new CarroStack("Fiat"));
		stackCarros.push(new CarroStack("Chevrolet"));
		stackCarros.push(new CarroStack("Vw"));
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros.pop());
		System.out.println();
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros.search("Ford"));
		
	}
}

class CarroStack {
	String marca;

	public CarroStack(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}
	

}
