import java.util.ArrayList;

public class JJavaProductos {
    public static void main(String[] args) {
        ArrayList<Productos> listProductos = new ArrayList<Productos>();

        Productos obj1;
        Productos obj2;
        Productos obj3;
        Productos obj4;
        Productos obj5;
        Productos obj6;
        Productos obj7;

        listProductos.add(new Frescos(5409, "México", 2023));
        listProductos.add(new Frescos(8943, "Brasil", 2022));
        listProductos.add(new Refrigerados(8970, "Venezuela", "FDA"));
        listProductos.add(new Refrigerados(4839, "México", "FDA"));
        listProductos.add(new Refrigerados(8945, "USA", "FDA"));
        listProductos.add(new CongeladosAgua(2359, "México", -5, 30 ));
        listProductos.add(new CongeladosNitrogeno(6492, "España", -3, "Precipitación"));


        for(int i = 0; i < listProductos.size(); i++)
        {
            System.out.println("Producto " + (i + 1) + ": " + listProductos.get(i));
            System.out.println(" ");

        }
    }
}
