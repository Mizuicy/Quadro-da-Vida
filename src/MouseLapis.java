import java.awt.*;    
import java.awt.event.*;
import javax.swing.JFrame;

public class MouseLapis extends MouseAdapter {    

        JFrame f;    
            MouseLapis() {    
            f = new JFrame ("QUADRO DA VIDA"); //Titulo e criação do JFRAME   
            f.addMouseMotionListener (this);  //Detector e tipo de movimento do mouse
            f.setSize (500, 500);  //Tamanho da tela  
            f.setLayout (null);    
            f.setVisible (true); //Visibilidade da tela
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Botão de fechar
        }
        

public void mouseDragged (MouseEvent e) { 
        Graphics g = f.getGraphics();     
        g.fillOval (e.getX(), e.getY(), 30, 30);//Tamanho do pix do lapis
    }
    
      // main method  
public static void main(String[] args) {    
        new MouseLapis();    
    }    
}   
