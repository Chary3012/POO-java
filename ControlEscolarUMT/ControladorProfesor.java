package com.manzanita;

import java.util.ArrayList;

public class ControladorProfesor {
    private ArrayList<Profesor> profList;
    private CatalogoProfesor vista;
    private Profesor obj1;

    ControladorProfesor(CatalogoProfesor vista){
        profList =  new ArrayList<Profesor>();
        this.vista=vista;
    }
    public void addProfesor(){
        obj1 = new Profesor(vista.SolicitarClave(),
                vista.SolicitarNombre(),
                vista.SolicitarEdad(),
                vista.SolicitarFac()
                );
        profList.add(obj1);
    } //fin del método addProfesor

    public void MenuProfesor(){
        Integer opcion=0;
        while(opcion != 6){
            switch (vista.Menu()){
                case 1:
                    addProfesor();
                    break;
                case 2:
                    Integer aux = vista.SolicitarClave();
                    vista.imprimeInfoBorrado(borrarProf(aux));
                    break;
                case 3:
                    MenuModificarProf();
                    break;
                case 4:
                    vista.imprimirInfoTotal(profList);
                    break;
                case 5:
                    aux =vista.SolicitarClave();
                    Integer pos = buscarProf(aux);
                    if (pos != -1)
                        vista.imprimirInfoProf(profList.get(pos));
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

    private Integer buscarProf(Integer matricula){

        for (int i = 0; i < profList.size(); i++) {
            if (matricula.equals(profList.get(i).getClave())) {
                return i;
            }
        }
        return -1;  ///no existe el registro
    } //fin del metodobuscarEst

    private boolean borrarProf(Integer clave){
        Integer indiceProf = buscarProf(clave);
        if (indiceProf != -1) {
            profList.remove((int)indiceProf);
            return true;
        }else{
            return false;
        }
    }///fin del borrarProfesor

    public boolean modificarNombreProf(Integer clave){
        Integer indiceProf = buscarProf(clave);
        if (indiceProf != -1) {
            vista.imprimirInfoProf(profList.get(indiceProf));
            profList.get(indiceProf).setNombre(vista.SolicitarNombre());
            return true;
        }else {
            return false;
        }
    }  //fin de modificarNombreEst

    public boolean modificarEdadProf(Integer clave){
        Integer indiceProf = buscarProf(clave);
        if (indiceProf != -1) {
            vista.imprimirInfoProf(profList.get(indiceProf));
            profList.get(indiceProf).setEdad(vista.SolicitarEdad());
            return true;
        }else {
            return false;
        }
    } ///fin de modificar edad

    public boolean modificarFacultadProf(Integer clave){
        Integer indiceProf = buscarProf(clave);
        if (indiceProf != -1) {
            vista.imprimirInfoProf(profList.get(indiceProf));
            profList.get(indiceProf).setFacultad(vista.SolicitarFac());
            return true;
        }else {
            return false;
        }
    } ///fin de modificar edad


    private void MenuModificarProf(){
        Integer opcion = 0; Integer auxMat = 0; boolean resultado;
        while (opcion != 4){
            switch (vista.MenuModificarProf()){
                case 1:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarNombreProf(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 2:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarEdadProf(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 3:
                    auxMat    = vista.SolicitarClave();
                    resultado = modificarFacultadProf(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 4:
                    opcion = 4;
                    break;
            } //fin del switch
        }   //fin del while
    } //fin de MenuModificarEst


}///fin controlador profesor
