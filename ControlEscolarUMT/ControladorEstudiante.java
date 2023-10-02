package com.manzanita;
import java.util.ArrayList;

public class ControladorEstudiante {
    private ArrayList<Estudiante> estList;
    private CatalogoEstudiante vista;
    private Estudiante obj1;

    ControladorEstudiante(CatalogoEstudiante vista){
        estList =  new ArrayList<Estudiante>();
        this.vista=vista;
        //this.vista.MsgVersion();
    }

    public void addEstudiante(){
        obj1 = new Estudiante(vista.SolicitarMatricula(),
                vista.SolicitarNombre(),
                vista.SolicitarEdad(),
                vista.SolicitarSemestre(),
                vista.SolicitarFac(),
                vista.SolicitarPromedio());
        estList.add(obj1);
    } //fin del método addEstudiante

    public void MenuEstudiante(){
        Integer opcion=0;
        while(opcion != 6){
        switch (vista.Menu()){
            case 1:
                 addEstudiante();
                 break;
            case 2:
                 Integer aux = vista.SolicitarMatricula();
                 vista.imprimeInfoBorrado(borrarEstudiante(aux));
                 break;
            case 3:
                 MenuModificarEst();
                 break;
            case 4:
                 vista.imprimirInfoTotal(estList);
                 break;
            case 5:
                 aux =vista.SolicitarMatricula();
                 Integer pos = buscarEst(aux);
                 if (pos != -1)
                    vista.imprimirInfoEst(estList.get(pos));
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

    private Integer buscarEst(Integer matricula){

        for (int i = 0; i < estList.size(); i++) {
            if (matricula.equals(estList.get(i).getMatricula())) {
                return i;
            }
        }
        return -1;  ///no existe el registro
    } //fin del metodobuscarEst

    private boolean borrarEstudiante(Integer matricula){
        Integer indiceEst = buscarEst(matricula);
        if (indiceEst != -1) {
            estList.remove((int)indiceEst);
            return true;
        }else{
             return false;
        }
    }///fin del borrarEstudiante

   public boolean modificarNombreEst(Integer matricula){
        Integer indiceEst = buscarEst(matricula);
       if (indiceEst != -1) {
           vista.imprimirInfoEst(estList.get(indiceEst));
           estList.get(indiceEst).setNombre(vista.SolicitarNombre());
           return true;
       }else {
          return false;
       }
   }  //fin de modificarNombreEst

    public boolean modificarEdadEst(Integer matricula){
        Integer indiceEst = buscarEst(matricula);
        if (indiceEst != -1) {
            vista.imprimirInfoEst(estList.get(indiceEst));
            estList.get(indiceEst).setEdad(vista.SolicitarEdad());
            return true;
        }else {
            return false;
        }
    } ///fin de modificar edad

    public boolean modificarPromedioEst(Integer matricula){
        Integer indiceEst = buscarEst(matricula);
        if (indiceEst != -1) {
            vista.imprimirInfoEst(estList.get(indiceEst));
            estList.get(indiceEst).setPromedio(vista.SolicitarPromedio());
            return true;
        }else {
            return false;
        }
    } //fin de modificarpromedio

    private void MenuModificarEst(){
        Integer opcion = 0; Integer auxMat = 0; boolean resultado;
        while (opcion != 4){
            switch (vista.MenuModificarEst()){
                case 1:
                    auxMat    = vista.SolicitarMatricula();
                    resultado = modificarNombreEst(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 2:
                    auxMat    = vista.SolicitarMatricula();
                    resultado = modificarEdadEst(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 3:
                    auxMat    = vista.SolicitarMatricula();
                    resultado = modificarPromedioEst(auxMat);
                    vista.infoActualizacion(resultado);
                    break;
                case 4:
                    opcion = 4;
                    break;
            } //fin del switch
        }   //fin del while
    } //fin de MenuModificarEst

} //fin de la clase

