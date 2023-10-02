package com.manzanita;

public class ControladorPrincipal {

      private CatalogoEstudiante vistaEstudiante;
      private ControladorEstudiante Estudiantes;

      private CatalogoProfesor  vistaProfesor;
      private ControladorProfesor Profesores;

      private CatalogoAsignatura vistaAsignatura;
      private ControladorAsignatura Asignaturas;

      private CatalogoPrincipal vistaPrincipal;

    public ControladorPrincipal(CatalogoPrincipal vistaPrincipal) {


        vistaEstudiante = new CatalogoEstudiante();
        Estudiantes     = new ControladorEstudiante(vistaEstudiante);

        vistaProfesor    = new CatalogoProfesor();
        Profesores       = new ControladorProfesor(vistaProfesor);

        vistaAsignatura  = new CatalogoAsignatura();
        Asignaturas      = new ControladorAsignatura(vistaAsignatura);

        this.vistaPrincipal = vistaPrincipal;

        vistaPrincipal.MsgVersion();
    }

    public void MenuPrincipal(){
        Integer opcion=0;
        while(opcion != 4){
            switch (vistaPrincipal.Menu()){
                case 1:
                    Profesores.MenuProfesor();
                    break;
                case 2:
                    Estudiantes.MenuEstudiante();
                    break;
                case 3:
                    Asignaturas.MenuAsignatura();
                    break;
                    case 4:
                    opcion = 4;
                    vistaPrincipal.MsgGracias();
                    break;
            } //fin del switch
        } //fin del while
    }
}
