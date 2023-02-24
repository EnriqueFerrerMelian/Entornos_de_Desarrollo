package dam.ejercioframeconbanderadeextremadura;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Enrique
 */
public class BanderaExtremadura {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
    }
}
class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        setTitle("Prueba de marco con dibujos");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        LaminaConFiguras miLamina = new LaminaConFiguras();
    
        add(miLamina);
    }
}

class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
    }
    
    public void paint (Graphics g){
        super.paint(g);

        g.setColor (Color.green);
        g.fillRect(100, 70, 200, 70);
        
        g.setColor (Color.white);
        g.fillRect (100, 140, 200, 70);
        
        g.setColor (Color.black);
        g.fillRect (100, 210, 200, 70);
        
    }
}