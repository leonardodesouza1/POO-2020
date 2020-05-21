public class Cargo {
	private String nome;
	private double pisoSalarial;
	private String descricao;
	private int cargaHoraria;
	
	public String getNome(){
		return this.nome;
}

	public double getPisoSalarial(){
		return this.pisoSalarial;
}

	public String getDescricao(){
		return this.descricao;
}

	public int getCargaHoraria(){
		return this.cargaHoraria;
}

	public void setNome(String nome){
		this.nome = nome;
}

	public void setPisoSalarial(double pisoSalarial){
		this.pisoSalarial = pisoSalarial;
}
	public void setDescricao(String descricao){
		this.descricao = descricao;
}

	public void setCargaHoraria(int cargaHoraria){
		this.cargaHoraria = cargaHoraria;
}
}