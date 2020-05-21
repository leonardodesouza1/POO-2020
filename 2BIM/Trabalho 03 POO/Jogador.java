public class Jogador {
	private String nome;
	private double salario;
	private String posicao;
	private int jogos;
	
	public String getNome(){
		return this.nome;
}

	public double getSalario(){
		return this.salario;
}

	public String getPosicao(){
		return this.posicao;
}

	public int getJogos(){
		return this.jogos;
}

	public void setNome(String nome){
		this.nome = nome;
}

	public void setSalario(double salario){
		this.salario = salario;
}
	public void setPosicao(String posicao){
		this.posicao = posicao;
}

	public void setJogos(int jogos){
		this.jogos = jogos;
}
}