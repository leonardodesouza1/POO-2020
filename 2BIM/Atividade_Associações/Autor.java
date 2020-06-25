
public class Autor {
	private String nome;
	private int anoNascimento;
	private String nacionalidade;
	
	
	public Autor(String nome, int anoNascimento, String nacionalidade) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.nacionalidade = nacionalidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", anoNascimento=" + anoNascimento + ", nacionalidade=" + nacionalidade + "]";
	}
	
	
}
