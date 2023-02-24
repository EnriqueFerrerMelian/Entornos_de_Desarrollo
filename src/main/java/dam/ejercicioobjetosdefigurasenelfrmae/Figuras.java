package dam.ejercicioobjetosdefigurasenelfrmae;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Enrique
 */
public class Figuras {
    public static void main(String[] args) {
        MarcoConTexto marco0 = new MarcoConTexto();
    } 
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Marco con contenido");
        Lamina miLamina = new Lamina();
        add(miLamina);
        
    }
}
class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Texto escrito", 20, 20);
    }
    
    public void paint (Graphics g){
        super.paint(g);

        g.setColor (Color.blue);
        g.drawLine (0, 70, 100, 70);
        g.drawRect (150, 70, 50, 70);
        g.drawRoundRect (250, 70, 50, 70, 6, 6);
        g.drawOval (350, 70, 50, 70);
        int [] vx1 = {500, 550, 450};
        int [] vy1 = {70, 120, 120};
        g.drawPolygon (vx1, vy1, 3);

        g.setColor (Color.red);
        g.fillRect (150, 270, 50, 70);
        g.fillRoundRect (250, 270, 50, 70, 6, 6);
        g.fillOval (350, 270, 50, 70);
        int [] vx2 = {500, 550, 450};
        int [] vy2 = {270, 320, 320};
        g.fillPolygon (vx2, vy2, 3);
    }
}