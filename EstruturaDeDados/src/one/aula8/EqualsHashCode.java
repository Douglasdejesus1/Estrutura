package one.aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsHashCode {
	public static void main(String[] args) {
		
		List<CarroSet> listaCarros = new ArrayList<>();
		listaCarros.add(new CarroSet("Ford"));
		listaCarros.add(new CarroSet("Fiat"));
		listaCarros.add(new CarroSet("Chevrolet"));
		listaCarros.add(new CarroSet("Vw"));
		
		System.out.println(listaCarros);
		System.out.println(listaCarros.contains(new CarroSet("Ford")));
		System.out.println(listaCarros.size());
		System.out.println((new CarroSet("Ford").hashCode()));
	}
	
}

class Carro{
	String marca;
	
	

	public Carro(String marca) {
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
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		CarroSet other = (CarroSet) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}
	
	
}
