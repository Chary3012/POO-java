package salario;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        /*
         * Empleado empleado1 = new Empleado("Juan", 100);
         * empleado1.aumentarSalario();
         * System.out.println(empleado1);
         * 
         * Directivo obj2 = new Directivo("Luis", 100, "Mari");
         * obj2.aumentarSalario();
         */
        /* System.out.println(obj2); */
        /*
         * System.out.println("El nombre del directivo: " + obj2.getNombre());
         * System.out.println("El nombre de la secretaria " +
         * obj2.getNombreSecretaria());
         * System.out.println("El salario es: " + obj2.getSalario());
         */

        /*
         * Empleado obj1;
         * obj1 = new Directivo("Jose", 10, "Mar");
         * System.out.println(obj1.getNombre());
         * System.out.println(obj1.getSalario());
         * System.out.println(((Directivo)obj1).getNombreSecretaria());
         */

        ArrayList<Empleado> lista = new ArrayList<Empleado>();

        lista.add(new Empleado("Luis", 1));
        lista.add(new Empleado("Luis2", 10));
        lista.add(new Directivo("Luis3", 11, "Mar"));

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getClass().getSimpleName().equals("Directivo")) {
                System.out.println(((Directivo) lista.get(i)).getNombreSecretaria());
            }
        }

    }

}
