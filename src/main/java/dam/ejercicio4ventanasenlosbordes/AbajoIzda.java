package dam.ejercicio4ventanasenlosbordes;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Enrique
 */
public class AbajoIzda {
    public static void main(String[] args) {
        MarcoCentrado3 marco3=new MarcoCentrado3();
    }
}

class MarcoCentrado3 extends JFrame{
    public MarcoCentrado3(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setTitle("AbajoIzda");
//        Image miIcono=miPantalla.getImage("favicon.ico");
//        setIconImage(miIcono);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, alturaPantalla/2);
    }
}