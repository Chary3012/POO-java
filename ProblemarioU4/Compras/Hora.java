package ProblemarioU4.Compras;

import java.time.LocalDateTime;


public class Hora {
    private int horas;
    private int minutos;

    public Hora() {
    }


    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }



    @Override
    public String toString() {
        return "Hora: " + horas + ":" + minutos;
    }
}
