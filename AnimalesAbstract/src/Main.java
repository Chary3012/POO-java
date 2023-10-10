import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> listAnimals = new ArrayList<Animal>();
        listAnimals.add(new Perro("gomita"));
        listAnimals.add(new Gato("Bartolito", "Amarillo"));
        listAnimals.add(new Jonathan("Jonny"));

        for(int i = 2; i < listAnimals.size(); i++)
        {
            listAnimals.get(i).habla();
        }
    }
}