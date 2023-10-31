import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Villano> listVillanos = new ArrayList<Villano>();

        Villano obj1 = new Villano(20, "Cacahuate");
        Villano obj2 = new Malvado(34, "Chacalon", true);
        Villano obj3 = new Malvado(15, "Señora malvavisco", false);

        listVillanos.add(obj1);
        listVillanos.add(obj2);
        listVillanos.add(obj3);


        /*
        for(int i = 0; i < listVillanos.size(); i++)
        {
            System.out.println("Elemento " + (i+1));
            System.out.println(listVillanos.get(i));
            System.out.println(" ");
        }

         */

        for (Villano vill:listVillanos) {

            System.out.println(vill);
        }

    }
}