package one.aula1;

public class ConceitoNo {

	public static void main(String[] args) {
	
	No no1 = new No("no1");
	
	No no2 = new No("no2");
	no1.setProximoNo(no2);
	No no3 = new No("no3");
	no2.setProximoNo(no3);
	No no4 = new No("no4");
	no3.setProximoNo(no4);
	
	System.out.println(no1);
	System.out.println(no1.getProximoNo());
	System.out.println(no1.getProximoNo().getProximoNo());
	System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
	System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	
	}
	
}

class No{
	private String conteudo;
	private No proximoNo;
	public No(String conteudo) {
		this.proximoNo =null;
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
	
	
	
	
}
