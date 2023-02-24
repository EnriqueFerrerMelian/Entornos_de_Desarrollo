package dam.ejercicio4ventanasenlosbordes;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Enrique
 */
public class ArribaDerch {
    public static void main(String[] args) {
        MarcoCentrado2 marco2=new MarcoCentrado2();
    }
}
class MarcoCentrado2 extends JFrame{
    public MarcoCentrado2(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setTitle("ArribaDerch");
        Image miIcono=miPantalla.getImage("favicon.ico");
        setIconImage(miIcono);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(anchoPantalla/2, 0);
    }
}