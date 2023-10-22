import java.util.ArrayList;

public class Main {
    public static  ArrayList<SeleccionFut> integrantes = new ArrayList<SeleccionFut>();

    public static void main(String[] args) {

        integrantes.add(new Futbolista(2, "Andres", "Iniesta", 29, 36, "Lateral"));
        integrantes.add(new Entrenador(2, "Josue", "Del bosque", 45, 2302));

        for(SeleccionFut integrantes : integrantes){
            System.out.println(integrantes.getName()+" "+ integrantes.getApellido());
            integrantes.viajar();
            integrantes.entrenar();
            integrantes.jugarPartido();
        }



    }
}