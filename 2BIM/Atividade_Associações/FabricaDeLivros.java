
public class FabricaDeLivros {
	private static FabricaDeLivros instance;
	
	private FabricaDeLivros() {}
	
	public static synchronized FabricaDeLivros getInstance() {
		if(instance == null) {
			instance = new FabricaDeLivros();
		}
		return instance;
	}
	public Livro criarLivro(String nome,Autor autor, Editora editora, int ano) {
		return new Livro(nome,autor,editora,ano);
	}
}
