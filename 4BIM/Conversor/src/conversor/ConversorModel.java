package src.conversor;

import src.utils.Strings;

public class ConversorModel {
    private int id;
    private Double valor;
    private Double celsiusToF;
    private Double celsiusToK;
    private Double fahrenheitToK;
    private Double fahrenheitToC;
    private Double kelvinToC;
    private Double kelvinToF;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public Double getCelsiusToF(){
        return celsiusToF;
    }

    public void setCelsiusToF(Double celsiusToF){
        this.celsiusToF = celsiusToF;
    }

    public Double getCelsiusToK(){
        return celsiusToK;
    }

    public void setCelsiusToK(Double celsiusToK){
        this.celsiusToK = celsiusToK;
    }

    public Double getFahrenheitToK(){
        return fahrenheitToK;
    }

    public void setFahrenheitToK(Double fahrenheitToK){
        this.fahrenheitToK = fahrenheitToK;
    }

    public Double getFahrenheitToC(){
        return fahrenheitToC;
    }

    public void setFahrenheitToC(Double fahrenheitToC){
        this.fahrenheitToC = fahrenheitToC;
    }

    public Double getKelvinToC(){
        return kelvinToC;
    }

    public void setKelvinToC(Double kelvinToC){
        this.kelvinToC = kelvinToC;
    }

    public Double getKelvinToF(){
        return kelvinToF;
    }

    public void setKelvinToF(Double kelvinToF){
        this.kelvinToF = kelvinToF;
    }

    public void convertCelsiusTo(Double valor) {
        Double CelsiusToF = (valor * 9/5) + 32;
        Double CelsiusToK = valor + 273.15;

        setCelsiusToF(CelsiusToF);
        setCelsiusToK(CelsiusToK);
    }

    public void convertFahrenheitTo(Double valor) {
        Double fahrenheitToK = (valor - 32) * 5/9 + 273.15;
        Double fahrenheitToC = (valor - 32) * 5/9;

        setFahrenheitToK(fahrenheitToK);
        setFahrenheitToC(fahrenheitToC);
    }

    public void convertKelvinTo(Double valor) {
        Double kelvinToC = valor - 273.15; 
        Double kelvinToF = (valor - 273.15) * 9/5 + 32;

        setKelvinToC(kelvinToC);
        setKelvinToF(kelvinToF);
    }
    public void validarValor() throws ConversorException{
        String verifica = String.valueOf(valor);
        if(Strings.isNullOrEmpty(verifica)){
            throw new ConversorException("Nenhum valor informado");
        }
    }
}