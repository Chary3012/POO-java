import java.util.ArrayList;

public class Polimo {

    public void imprime (Figura fig){
        fig.imprimeArea();
    }
    public static void main(String[] args) throws Exception {

        ArrayList<Figura> listFiguras = new ArrayList<Figura>();

        listFiguras.add(new Cuadrado());
        listFiguras.add(new Triangulo());

        for(int i = 0;i < listFiguras.size(); i++){
            System.out.println("Figura " + (i+1) + " (" + listFiguras.get(i).nombre()+"):");
            listFiguras.get(i).pideDatos();
            System.out.println(" ");
        }

        for(int k = 0; k < listFiguras.size(); k ++){
            System.out.println("Área de la figura " + (k + 1) + " (" + listFiguras.get(k).nombre()+"):");
            listFiguras.get(k).imprimeArea();
            System.out.println(" ");
        }
    }
}
