package one.aula4;

public class ListasEncadeadas {
	public static void main(String[] args) {

	}
}

class No<T> {
	private T conteudo;
	private No proximoNo;

	public No() {
		this.proximoNo = null;
	}

	public No(T conteudo) {
		super();
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public No(T conteudo, No proximoNo) {
		super();
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

	public String toStringEncadeado() {
		String str = "No [conteudo=" + conteudo + "]";

		if (proximoNo != null) {
			str += "->" + proximoNo.toString();
		} else {
			str += "->" + null;
		}
		return str;
	}

}

class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if (referenciaAux != null) {
				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} else {
					break;
				}

			} else {
				break;
			}

		}

		return tamanhoLista;
	}

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

}