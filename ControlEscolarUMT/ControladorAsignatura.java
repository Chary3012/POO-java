package com.manzanita;

import java.util.ArrayList;

public class ControladorAsignatura {
    private ArrayList<Asignatura> AsigList;
    private CatalogoAsignatura vista;
    private Asignatura obj1;

    ControladorAsignatura(CatalogoAsignatura vista){
        AsigList =  new ArrayList<Asignatura>();
        this.vista=vista;
        //this.vista.MsgVersion();
    }

    public void addAsignatura(){
        obj1 = new Asignatura(vista.SolicitarClave(),
                vista.SolicitarNombre(),
                vista.SolicitarSemestre(),
                vista.SolicitarCreditos(),
                vista.SolicitarFac());
        AsigList.add(obj1);
    } //fin del método addEstudiante

    public void MenuAsignatura(){
        Integer opcion=0;
        while(opcion != 6){
            switch (vista.Menu()){
                case 1:
                    addAsignatura();
                    break;
                case 2:
                    Integer aux = vista.SolicitarClave();
                    vista.imprimeInfoBorrado(borrarAsignatura(aux));
                    break;
                case 3:
                    MenuModificarAsig();
                    break;
                case 4:
                    vista.imprimirInfoTotal(AsigList);
                    break;
                case 5:
                    aux =vista.SolicitarClave();
                    Integer pos = buscarAsig(aux);
                    if (pos != -1)
                        vista.imprimirInfoAsig(AsigList.get(pos));
                    else
                        vista.MsgNoRegistro();
                    break;
                case 6:
                    opcion = 6;
                    //vista.MsgGracias();
                    break;
            } //fin del switch
        } //fin del while
    } //fin de menuestudiante

    private Integer buscarAsig(Integer clave){

        for (int i = 0; i < AsigList.size(); i++) {
            if (clave.equals(AsigList.get(i).getClave())) {
                return i;
            }
        }
        return -1;  ///no existe el registro
    } //fin del metodobuscarEst

    private boolean borrarAsignatura(Integer clave){
        Integer indiceAsig = buscarAsig(clave);
        if (indiceAsig != -1) {
            AsigList.remove((int)indiceAsig);
            return true;
        }else{
            return false;
        }
    }///fin del borrarEstudiante

    public boolean modificarNombreAsig(Integer clave){
        Integer indiceAsig = buscarAsig(clave);
        if (indiceAsig != -1) {
            vista.imprimirInfoAsig(AsigList.get(indiceAsig));
            AsigList.get(indiceAsig).setNombre(vista.SolicitarNombre());
            return true;
        }else {
            return false;
        }
    }  //fin de modificarNombreEst

    public boolean modificarSemestreAsig(Integer clave){
        Integer indiceAsig = buscarAsig(clave);
        if (indiceAsig != -1) {
            vista.imprimirInfoAsig(AsigList.get(indiceAsig));
            AsigList.get(indiceAsig).setSemestre(vista.SolicitarSemestre());
            return true;
        }else {
            return false;
        }
    } ///fin de modificar edad

    public boolean modificarCreditosAsig(Integer clave){
        Integer indiceAsig = buscarAsig(clave);
        if (indiceAsig != -1) {
            vista.imprimirInfoAsig(AsigList.get(indiceAsig));
            AsigList.get(indiceAsig).setCreditos(vista.SolicitarCreditos());
            return true;
        }else {
            return false;
        }
    } //fin de modificarpromedio

    private void MenuModificarAsig(){
        Integer opcion = 0; Integer auxMat = 0; boolean resultado;
        while (opcion != 4){
            switch (vista.MenuModificarAsig()){
                case 1:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarNombreAsig(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 2:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarSemestreAsig(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 3:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarCreditosAsig(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 4:
                    opcion = 4;
                    break;
            } //fin del switch
        }   //fin del while
    } //fin de MenuModificarEst

}
