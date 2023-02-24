package dam.ejercicio4ventanasenlosbordes;
import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Enrique
 */
public class AbajoDerch {
    public static void main(String[] args) {
        MarcoCentrado4 marco4=new MarcoCentrado4();
    }
}
class MarcoCentrado4 extends JFrame{
    public MarcoCentrado4(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setTitle("AbajoDerch");
        Image miIcono=miPantalla.getImage("favicon.ico");
        setIconImage(miIcono);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(anchoPantalla/2, alturaPantalla/2);
    }
}
