package dam.ejercicio4ventanasenlosbordes;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Enrique
 */
public class ArribaIzrda {
    public static void main(String[] args) {
        MarcoCentrado1 marco1=new MarcoCentrado1();
    }
}
class MarcoCentrado1 extends JFrame{
    public MarcoCentrado1(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setTitle("ArribaIzrda");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0, 0);
    }
}