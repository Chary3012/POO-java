package vista;

import controlador.ControladorLeerEscribirClientes;
import modelo.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VistaLeerEscribirClientes {

    ControladorLeerEscribirClientes controlador = new ControladorLeerEscribirClientes();

    public VistaLeerEscribirClientes() {
    }

    public void menuPrincipal() {
        Scanner sca = new Scanner(System.in);

        boolean control = true;

            do{
                System.out.println("Seleccione la opción de su preferencia");
                System.out.println("1 - Cargar clientes");
                System.out.println("2 - Guardar clientes");
                System.out.println("3 - Mostrar registro de clientes actuales");
                System.out.println("4 - Agregar cliente");
                System.out.println("5 - Eliminar cliente");
                System.out.println("6 - Salir del programa");
                System.out.println("\nSeleccione una opción: ");
                int opcion = sca.nextInt();
                switch (opcion){
                    case 1:
                        cargarClientes();
                        break;
                    case 2:
                        guardarClientes();
                        break;
                    case 3:
                        mostrarRegistros();
                        break;
                    case 4:
                        agregarCliente();
                        break;
                    case 5:
                        eliminarCliente();
                        break;
                    case 6:
                        control = false;
                        break;
                    default:
                        System.out.println("Seleccione una opción valida...");
                        break;

                }
            }while(control);




    }

    public void mensaje(boolean estado){
        if(estado == true){
            System.out.println("\n¡Operación realizada con exito!\n");
        }
        else{
            System.out.println("\n¡Ocurrio un error con la operacion!\n");
        }
    }

    public void agregarCliente(){

        while (true){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("\n--Agregar cliente--\n");

                System.out.println("Ingrese los datos del cliente...");
                System.out.println("Clave: ");
                int clave = sc.nextInt();
                sc.nextLine();
                System.out.println("Nombre(s): ");
                String nombre = sc.nextLine();
                System.out.println("Apellidos: ");
                String apellido = sc.nextLine();
                System.out.println("Línea de crédito: ");
                double lineadeCredito = sc.nextDouble();


                mensaje(controlador.agregarCliente(clave, nombre, apellido, lineadeCredito));
                break;
            }catch (InputMismatchException e){
                System.out.println("Verifique que los datos sean correctos!\n");
            }
            sc.nextLine();
        }
    }

    public void eliminarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese la clave del cliente a eliminar: ");
        mensaje(controlador.elimiarCliente(sc.nextInt()));
    }

    public void mostrarRegistros(){

        ArrayList<Cliente> clientes = controlador.mostrarRegistros();
        if (clientes.isEmpty()) {
            System.out.println("No hay registros aún\n");
            return;
        }
        System.out.println("Registros: \n");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println("Cliente " + (i+1) + " ");
            System.out.println(clientes.get(i));
            System.out.println(" ");
        }
    }

    public void guardarClientes(){
        System.out.println("--Guardar Clientes--");
        System.out.println("Advertencia: Si ya tenía guardado clientes en la base de datos estos se sobreescribiran.\n");

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Desea continuar?[s/n]: ");
            String control = sc.nextLine().toLowerCase();

            if (control.equals("s")){
                mensaje(controlador.guardarClientes());
                return;
            } else if (control.equals("n")) {
                System.out.println("Accion cancelada");
                return;
            }
            System.out.println("Selecciona una opción valida...");
        }while(true);

    }

    public void cargarClientes(){
        System.out.println("--Cargar Clientes--");
        System.out.println("Advertencia: Se agregaran los clientes guardados a la sesión actual, no se eliminar los clientes en el registro temporal\n");

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Desea continuar?[s/n]: ");
            String control = sc.nextLine().toLowerCase();

            if (control.equals("s")){
                mensaje(controlador.cargarClientes());
                return;
            } else if (control.equals("n")) {
                System.out.println("Accion cancelada");
                return;
            }
            System.out.println("Selecciona una opción valida...");
        }while(true);
    }





}
