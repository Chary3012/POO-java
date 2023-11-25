package controlador;

import modelo.Cliente;

import java.io.*;
import java.util.ArrayList;

public class ControladorLeerEscribirClientes {

    ArrayList<Cliente> listClientes = new ArrayList<Cliente>();

    public boolean agregarCliente(int clave, String nombre, String apellido, double lineadeCredito){

        Cliente cliente = new Cliente(clave, nombre, apellido, lineadeCredito);
        listClientes.add(cliente);

        return true;

    }

    public boolean elimiarCliente(int clave){

        int indice = buscarCliente(clave);
        if(indice == -1) return false;
        listClientes.remove(indice);
        return true;
    }

    public int buscarCliente(int clave){

        for(int i = 0; i < listClientes.size(); i++){
            if(clave == listClientes.get(i).getClave()){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Cliente> mostrarRegistros(){
        return listClientes;
    }

    public boolean guardarClientes(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/modelo/clientes.charly"));
            oos.writeObject(listClientes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public boolean cargarClientes(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/modelo/clientes.charly"));
            ArrayList<Cliente> agregarlista = (ArrayList<Cliente>) ois.readObject();
            listClientes.addAll(agregarlista);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
