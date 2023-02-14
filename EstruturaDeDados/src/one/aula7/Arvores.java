package one.aula7;

import one.aula7.model.Obj;

public class Arvores {
	public static void main(String[] args) {
		
		 ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
	        minhaArvore.inserir(new Obj(13));
	        minhaArvore.inserir(new Obj(10));
	        minhaArvore.inserir(new Obj(25));
	        minhaArvore.inserir(new Obj(2));
	        minhaArvore.inserir(new Obj(12));
	        minhaArvore.inserir(new Obj(20));
	        minhaArvore.inserir(new Obj(31));
	        minhaArvore.inserir(new Obj(29));
	        minhaArvore.inserir(new Obj(32));
	        minhaArvore.remover(new Obj(32));

	        minhaArvore.exibirInOrdem();
	        minhaArvore.exibirPreOrdem();
	        minhaArvore.exibirPosOrdem();
		

	}
}

class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNo() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}

class ArvoreBinaria<T extends Comparable<T>> {

	private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		raiz = inserir(raiz, novoNo);
	}

	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
		if (atual == null) {
			return novoNo;
		} else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		} else {
			atual.setNoDir(inserir(atual.getNoDir(), novoNo));
		}
		return atual;
	}

	public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }


	public void remover(T conteudo) {
		try {
			BinNo<T> atual = this.raiz;
			BinNo<T> pai = null;
			BinNo<T> filho = null;
			BinNo<T> temp = null;

			while (atual != null && !atual.getConteudo().equals(conteudo)) {
				pai = atual;
				if (conteudo.compareTo(atual.getConteudo()) < 0) {
					atual = atual.getNoEsq();
				} else {
					atual = atual.getNoDir();
				}
			}
			if (atual == null) {
				System.out.println("Conteudo nao econtrado. Bloco Try");
			}
			if (pai == null) {
				if (atual.getNoDir() == null) {
					this.raiz = atual.getNoDir();
				} else if (atual.getNoEsq() == null) {
					this.raiz = atual.getNoEsq();
				} else {
					for (temp = atual, filho = atual.getNoEsq(); 
						filho.getNoDir() != null; 
						temp = filho, filho = filho.getNoEsq()) {
						if (filho != atual.getNoEsq()) {
							temp.setNoDir(filho.getNoEsq());
							filho.setNoEsq(raiz.getNoEsq());
						}
					}
					filho.setNoDir(raiz.getNoDir());
					raiz = filho;
				}
			} else if (atual.getNoDir() == null) {
				if(pai.getNoEsq()== atual) {
					pai.setNoEsq(atual.getNoEsq());
				}else {
					pai.setNoDir(atual.getNoEsq());	
				}
			} else if (atual.getNoEsq() == null) {
				if(pai.getNoEsq()== atual) {
					pai.setNoEsq(atual.getNoDir());
				}else {
					pai.setNoDir(atual.getNoDir());	
				}
			} else {
				for(temp=atual, filho = atual.getNoEsq();
						filho.getNoDir() !=null;
						temp=filho, filho.getNoDir()
			){
					if(filho != atual.getNoEsq()) {
						temp.setNoDir(filho.getNoEsq());
						filho.setNoEsq(atual.getNoEsq());
					}
					filho.setNoDir(atual.getNoDir());
					if(pai.getNoEsq() == atual) {
						pai.setNoEsq(filho);						
					}else {
						pai.setNoDir(filho);
						
					}
				}
					}

		} catch (NullPointerException e) {
			System.out.println("Conteudo nao econtrado. Bloco Catch");
		}
	}

}