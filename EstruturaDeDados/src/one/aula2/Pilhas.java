package one.aula2;

public class Pilhas {
	public static void main(String[] args) {
		
		Pilha minhaPilha = new Pilha();
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));
		minhaPilha.push(new No(7));
		
		
		
		System.out.println(minhaPilha);
		
		minhaPilha.pop();
		System.out.println(minhaPilha);
		
		minhaPilha.push(new No(99));
		System.out.println(minhaPilha);
		minhaPilha.top();
		
	}

}
class No{
	private int dado;
	private No  refNo = null;
	public No(int dado) {
		this.dado = dado;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public No getRefNo() {
		return refNo;
	}
	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	} 

	
}
class Pilha{
	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	public No top() {
		return refNoEntradaPilha;
	}
	public No push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
		
		return refNoEntradaPilha;
	}
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	
	
	public boolean isEmpty() {
		if(refNoEntradaPilha == null) {
			return true;
		}
		return false;
		//com opera��o ternaria
		//return refNoEntradaPilha == null ? true:false;
	}
	@Override
	public String toString() {

		String stringRetorno = "-------------\n";
		stringRetorno+="    Pilha    \n";
		stringRetorno += "-------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar !=null) {
				stringRetorno+="[No{dado= "+noAuxiliar.getDado()+"}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
				
			}else {
				break;
			}
		}
		stringRetorno += "=============\n";
		return stringRetorno;
	}
	
}
