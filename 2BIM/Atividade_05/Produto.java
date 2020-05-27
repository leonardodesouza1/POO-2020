
public class Produto {
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "[Produto(Nome = "+nome+", Valor = R$"+valor+")]" ;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null) return false;
		if(o instanceof Produto) {
			Produto p = (Produto) o;
			boolean flag = false;
			if(nome != null) {
				flag = nome.equals(p.nome) && valor == (p.valor);
			}else {
				flag = p.nome == null;
			}
			return flag;
		}
		return false;
	}
}

