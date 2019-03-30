package main;

import Vista.VistaSuper;
import Controlador.ControladorVistaSuper;
import Modelo.Producto;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VistaSuper a = new VistaSuper();
        Producto b = new Producto();
        ControladorVistaSuper cont = new ControladorVistaSuper(a,b);
    }//main()
}//Main
