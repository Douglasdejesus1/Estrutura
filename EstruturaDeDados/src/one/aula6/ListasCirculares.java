package one.aula6;

public class ListasCirculares {
public static void main(String[] args) {
	
	ListaCircular<String> minhaListaCircular = new  ListaCircular();
	
	minhaListaCircular.add("C1");
	minhaListaCircular.add("C2");
	minhaListaCircular.add("C3");
	minhaListaCircular.add("C4");
	minhaListaCircular.add("C5");
	System.out.println(minhaListaCircular);
	minhaListaCircular.remove(2);
	System.out.println(minhaListaCircular);
	System.out.println(minhaListaCircular.size());
	System.out.println(minhaListaCircular.isEmpty());
	System.out.println(minhaListaCircular.get(6));
	
}
}
class No<T>{
	private No noProximo;
	private T conteudo;
	
	public No(T conteudo) {
		this.noProximo = null;
		this.conteudo = conteudo;
	}
	public No getNoProximo() {
		return noProximo;
	}
	public void setNoProximo(No refNo) {
		this.noProximo = refNo;
	}
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

}
class ListaCircular<T>{
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular(){
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;		
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true:false;
	}
	public int size() {
		return this.tamanhoLista;
	}
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty()) {
			throw new IndexOutOfBoundsException("A lista est� vazia");
		}
		if(index ==0) {
			return this.cauda;
		}
		No<T> noAuxiliar = this.cauda;
		for(int i =0; (i<index) && (noAuxiliar !=null);i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
	public void remove(int index) {
		if(index >= this.tamanhoLista) 
			throw new IndexOutOfBoundsException("O indice � maior que o tamanho da lista");
		No<T> noAuxiliar = this.cauda;
		if(index ==0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cabeca);
		}else if(index ==1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		}else {
			for(int i=0;i<index-1;i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		tamanhoLista--;
	}
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.tamanhoLista == 0) {
			this.cabeca=novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(cauda);
		}else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		tamanhoLista++;
	}

	@Override
	public String toString() {
		String srtRetorno="";
		No<T> noAuxiliar=this.cauda;
		for(int i =0;i<this.size();i++) {
			srtRetorno+= "[No{conteudo="+noAuxiliar.getConteudo()+"}]";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		srtRetorno+= this.size() !=0 ? "(Retorna ao in�cio)":"[]";
		return srtRetorno;
	}	
}
