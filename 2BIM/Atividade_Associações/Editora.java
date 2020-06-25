
public class Editora {
	private String nome;
	private String pais;
	private int ano;
	
	public Editora(String nome, String pais, int ano) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Editora [nome=" + nome + ", pais=" + pais + ", ano=" + ano + "]";
	}
}
