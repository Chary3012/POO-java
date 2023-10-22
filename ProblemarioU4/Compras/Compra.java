package ProblemarioU4.Compras;

import java.time.LocalDateTime;

public class Compra {
    private String codigo;
    private Fecha fecha;
    private Hora hora;

    Compra(String codigo, int dia, String mes, int ano, int horas, int minutos){
        this.codigo = codigo;
        this.fecha = new Fecha(dia, mes, ano);
        this.hora = new Hora(horas, minutos);

    }

    public void imprimirTodo(){
        System.out.println("Codigo de la compra: " + codigo +"\n");

    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\n" + fecha + "\n" + hora;
    }
}
