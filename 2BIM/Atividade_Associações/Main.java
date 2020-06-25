
public class Main {

	public static void main(String[] args) {
		Editora gallimard = new Editora("Gallimard","França",1911);
		Autor autor = new Autor("Antoine de Saint",1900,"França");
		Livro livro = FabricaDeLivros.getInstance().criarLivro("Pequeno Principe",autor,gallimard,1943);
		LivroView view = new LivroView();
		view.apresentarLivro(livro);
	}

}
