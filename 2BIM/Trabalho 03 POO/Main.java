public class Main {
	
public static void main(String[] args) {
	System.out.println();
	System.out.println("Pessoa");
	System.out.println();
	
	Pessoa eu = new Pessoa();
	eu.setNome("Leo");
	eu.setIdade(20);
	eu.setEndereco("Brasil");
	System.out.println(eu.getNome());
	System.out.println(eu.getIdade());
	System.out.println(eu.getEndereco());
	
	System.out.println();
	System.out.println("Cargo");
	System.out.println();
	
	Cargo estagiario = new Cargo();
	estagiario.setNome("Joao");
	estagiario.setCargaHoraria(20);
	estagiario.setDescricao("Assistente");
	estagiario.setPisoSalarial(1000.00);
	System.out.println(estagiario.getNome());
	System.out.println(estagiario.getCargaHoraria());
	System.out.println(estagiario.getDescricao());
	System.out.println(estagiario.getPisoSalarial());
	
	System.out.println();
	System.out.println("Jogador");
	System.out.println();
	
	Jogador ronaldo = new Jogador();
	ronaldo.setNome("Ronaldo");
	ronaldo.setSalario(29999.00);
	ronaldo.setPosicao("Atacante");
	ronaldo.setJogos(322);
	System.out.println(ronaldo.getNome());
	System.out.println(ronaldo.getSalario());
	System.out.println(ronaldo.getPosicao());
	System.out.println(ronaldo.getJogos());
}
}