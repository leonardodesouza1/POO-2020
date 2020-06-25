
public class LivroView {

	public void apresentarLivro(Livro livro) {
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("-------------------------------------Livro--------------------------------------");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Nome: "+livro.getNome());
		System.out.println("Autor: "+livro.getAutor());
		System.out.println("Editora: "+livro.getEditora());
		System.out.println("Ano: "+livro.getAno());
		System.out.println("--------------------------------------------------------------------------------");
	}
}
