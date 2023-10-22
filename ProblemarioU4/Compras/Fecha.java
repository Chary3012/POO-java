package ProblemarioU4.Compras;

import java.time.LocalDateTime;


public class Fecha {
    private int dia;
    private String mes;
    private int ano;

    Fecha(){

    };

    Fecha(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirFecha(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    @Override
    public String toString() {
        return "Fecha: " + dia + " de " + mes + " del " + ano;
    }
}
