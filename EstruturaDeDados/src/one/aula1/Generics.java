package one.aula1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Douglas","Hanna");
		List<Pessoa>pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Douglas"));
		pessoas.add(new Pessoa(2, "Flavia"));
		pessoas.add(new Pessoa(3, "Hanna"));
		
		
		List<Aluno>alunos = new ArrayList<>();
		alunos.add(new Aluno(1, "Douglas",10));
		alunos.add(new Aluno(2, "Flavia",9));
		alunos.add(new Aluno(3, "Hanna",7));
		
		
		
		imprimeLista(nomes);
		imprimeLista(pessoas);
		imprimeLista(alunos);
		
	
	}

	public static void imprimeLista(List<?> lista) {
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}

}

class Pessoa{
	Integer id;
	String nome;
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}

	
}
class Aluno extends Pessoa{

	int media;

	public Aluno(Integer id, String nome, int media) {
		super(id, nome);
		this.media = media;
	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [media=" + media + ", id=" + id + ", nome=" + nome + "]";
	}
	

	
	
}
