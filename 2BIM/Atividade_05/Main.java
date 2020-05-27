
public class Main {

	public static void main(String[] args) {
		Produto a = new Produto("Feijao",2.54);
		Produto b = new Produto("Cadeira",101.99);
		Produto c = new Produto("Microfone",67.83);
		System.out.println("Produto = "+a);
		System.out.println("Produto = "+b);
		System.out.println("Produto = "+c);
		System.out.println("------------------------------------------");
		//Trocando informações do c igual do a.
		c.setNome("Feijao");
		c.setValor(2.54);
		System.out.println("Nome C = "+c.getNome());
		System.out.println("Valor C = "+c.getValor());
		System.out.println("------------------------------------------");
		System.out.println("A == C ? "+a.equals(c));
		System.out.println("A == B ? "+a.equals(b));
		System.out.println("B == C ? "+b.equals(c));
		
	}

}
