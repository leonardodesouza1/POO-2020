package univille.poo.jdbc.model;

public class Pessoa {
 private int id;
 private String nome;
 private String sobrenome;
 private int idade;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
@Override
public String toString() {
	return "Pessoas [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
}
}
