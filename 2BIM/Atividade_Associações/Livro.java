
public class Livro {
	private String nome;
	private Autor autor;
	private Editora editora;
	private int ano;
	
	
	public Livro(String nome,Autor autor, Editora editora, int ano) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", editora=" + editora + ", ano=" + ano + "]";
	}
	
}
