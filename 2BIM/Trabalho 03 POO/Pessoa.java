public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	private int cep;
	private String nomePai;
	private String nomeMae;
	
	public String getNome(){
		return this.nome;
}

	public int getIdade(){
		return this.idade;
}

	public String getEndereco(){
		return this.endereco;
}

	public void setNome(String nome){
		this.nome = nome;
}

	public void setIdade(int idade){
		this.idade = idade;
}
	public void setEndereco(String endereco){
		this.endereco = endereco;
}
}