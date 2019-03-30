package Modelo;

public class Producto {
       String Nombre;
       int Cantidad;
       double Iva;
       double Precio;

    public String getNombre() {
        return Nombre;
    }

    public Producto() {
    }//constructor

    public Producto(String Nombre, int Cantidad, double Iva, double Precio) {
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Iva = Iva;
        this.Precio = Precio;
    }//constructor sobrecargado
    
    //gets y sets

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
       
       
}//Producto
