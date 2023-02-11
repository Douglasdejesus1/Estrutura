package one.aula5;

public class ListasDuplamenteEncadeadas {

}
class NoDuplo<T>{
	private T conteudo;
	private NoDuplo noPoximo;
	private NoDuplo noPrevio;
	
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}


	public T getConteudo() {
		return conteudo;
	}


	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}


	public NoDuplo getNoPoximo() {
		return noPoximo;
	}


	public void setNoPoximo(NoDuplo noPoximo) {
		this.noPoximo = noPoximo;
	}


	public NoDuplo getNoPrevio() {
		return noPrevio;
	}


	public void setNoPrevio(NoDuplo noPrevio) {
		this.noPrevio = noPrevio;
	}


	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
}
class ListaDuplamenteEncadeada<T>{
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	private ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo= null;
		this.tamanhoLista=0;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoPoximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if(primeiroNo ==null) {
			primeiroNo =novoNo;
		}
		if(ultimoNo !=null) {
			ultimoNo.setNoPoximo(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;
		
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i=0; (i<index)&&(noAuxiliar !=null); i++) {
			noAuxiliar = noAuxiliar.getNoPoximo();
		}
		return noAuxiliar;
	}
	
	
	
	
	public int size() {
		return this.tamanhoLista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
