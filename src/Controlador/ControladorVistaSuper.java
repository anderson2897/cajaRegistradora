package Controlador;
import Vista.VistaSuper;
import Modelo.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorVistaSuper implements ActionListener {
    private VistaSuper Vista;
    private Producto Modelo;
    double A;
    double B;
        Producto p1 = new Producto("Lapiz",0,16.0,550.0);
        Producto p2 = new Producto("Aspirina",0,12.0,109.5);
        Producto p3 = new Producto("Borrador",0,16.0,207.3);
        Producto p4 = new Producto("Pan",0,4.0,150.0);
    public static double ingresos(double a,double b){
        System.out.println(a+" "+b);
        double ingresos=a+b;
        System.out.println("ing"+ingresos);
        return ingresos;
    }//ingresos
    
    public ControladorVistaSuper(VistaSuper Vista, Producto Modelo) throws IOException, ClassNotFoundException {
        this.Vista = Vista;
        this.Modelo = Modelo;
        this.Vista.Cantidad1=Vista.Cantidad1;
        this.Vista.Cantidad2=Vista.Cantidad2;
        this.Vista.Cantidad3=Vista.Cantidad3;
        this.Vista.Cantidad4=Vista.Cantidad4;
        
        this.Vista.Precio1=Vista.Precio1;
        this.Vista.Precio2=Vista.Precio2;
        this.Vista.Precio3=Vista.Precio3;
        this.Vista.Precio4=Vista.Precio4;
        
        this.Vista.Iva1=Vista.Iva1;
        this.Vista.Iva2=Vista.Iva2;
        this.Vista.Iva3=Vista.Iva3;
        this.Vista.Iva4=Vista.Iva4;
        
        this.Vista.producto1=Vista.producto1;
        this.Vista.producto2=Vista.producto2;
        this.Vista.Producto3=Vista.Producto3;
        this.Vista.Producto4=Vista.Producto4;
        
        this.Vista.Ingresos=Vista.Ingresos;
        this.Vista.ProductomasVendido=Vista.ProductomasVendido;
        this.Vista.PreductomenosVendido=Vista.PreductomenosVendido;
        
        this.Vista.btnInventario.addActionListener((ActionListener) this);
        this.Vista.btnVenderProducuto.addActionListener((ActionListener) this);
        this.Vista.btnPedirProducto.addActionListener((ActionListener) this);
        
        
        this.Vista.setVisible(true);
        this.Vista.producto1.setEditable(false);
        this.Vista.producto2.setEditable(false);
        this.Vista.Producto3.setEditable(false);
        this.Vista.Producto4.setEditable(false);
        
        this.Vista.Iva1.setEditable(false);
        this.Vista.Iva2.setEditable(false);
        this.Vista.Iva3.setEditable(false);
        this.Vista.Iva4.setEditable(false);
        
        this.Vista.Precio1.setEditable(false);
        this.Vista.Precio2.setEditable(false);
        this.Vista.Precio3.setEditable(false);
        this.Vista.Precio4.setEditable(false);

            
            Vista.producto1.setText(p1.getNombre());
            Vista.producto2.setText(p2.getNombre());
            Vista.Producto3.setText(p3.getNombre());
            Vista.Producto4.setText(p4.getNombre());
            
            Vista.Iva1.setText(String.valueOf(p1.getIva())+"%");
            Vista.Iva2.setText(String.valueOf(p2.getIva())+"%");
            Vista.Iva3.setText(String.valueOf(p3.getIva())+"%");
            Vista.Iva4.setText(String.valueOf(p4.getIva())+"%");
            
            Vista.Precio1.setText(String.valueOf("$"+p1.getPrecio()));
            Vista.Precio2.setText(String.valueOf("$"+p2.getPrecio()));
            Vista.Precio3.setText(String.valueOf("$"+p3.getPrecio()));
            Vista.Precio4.setText(String.valueOf("$"+p4.getPrecio()));
    }//constructor

    public ControladorVistaSuper(VistaSuper a) {
     }
        public void actionPerformed(ActionEvent e){

            if (e.getSource()== Vista.btnPedirProducto) {
          int[] a={p1.getCantidad(),p2.getCantidad(),p3.getCantidad(),p4.getCantidad()};
          a[0]+=Integer.parseInt(Vista.Cantidad1.getText());     
          a[1]+=Integer.parseInt(Vista.Cantidad2.getText());     
          a[2]+=Integer.parseInt(Vista.Cantidad3.getText());     
          a[3]+=Integer.parseInt(Vista.Cantidad4.getText());     
                
          
          p1.setCantidad(a[0]);
          p2.setCantidad(a[1]);
          p3.setCantidad(a[2]);
          p4.setCantidad(a[3]);
          A=(a[0]*p1.getPrecio()+a[1]*p2.getPrecio()+a[2]*p3.getPrecio()+a[3]*p4.getPrecio())*-1;          
          Vista.Ingresos.setText(String.valueOf(ControladorVistaSuper.ingresos(A, B)));
            }
            if (e.getSource() == Vista.btnInventario) {

            Vista.Cantidad1.setText(String.valueOf(p1.getCantidad()));
            Vista.Cantidad2.setText(String.valueOf(p2.getCantidad()));
            Vista.Cantidad3.setText(String.valueOf(p3.getCantidad()));
            Vista.Cantidad4.setText(String.valueOf(p4.getCantidad()));
                
            }
            if (e.getSource()== Vista.btnVenderProducuto) {
          int[] a={p1.getCantidad(),p2.getCantidad(),p3.getCantidad(),p4.getCantidad()};
          a[0]-=Integer.parseInt(Vista.Cantidad1.getText());     
          a[1]-=Integer.parseInt(Vista.Cantidad2.getText());     
          a[2]-=Integer.parseInt(Vista.Cantidad3.getText());     
          a[3]-=Integer.parseInt(Vista.Cantidad4.getText());     
          
          p1.setCantidad(a[0]);
          p2.setCantidad(a[1]);
          p3.setCantidad(a[2]);
          p4.setCantidad(a[3]);
          
          
          B=Math.abs(a[0]*p1.getPrecio()+a[1]*p2.getPrecio()+a[2]*p3.getPrecio()+a[3]*p4.getPrecio());          
          Vista.Ingresos.setText(String.valueOf(ControladorVistaSuper.ingresos(A, B)));
            }
}//actionPerformed
        public  void ventana(){
        Vista.setVisible(true);
        }//ventana
}//ControladorVistaSuper

