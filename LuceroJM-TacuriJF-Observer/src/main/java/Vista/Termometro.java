/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author venot
 */
public class Termometro extends JPanel {
    private Color color;
    
    private int temperatura;

    
    

    //public Termometro(int temperatura) {
        //this.temperatura = temperatura;
    //}

    public void setTemperature(int temperatura) {
        this.temperatura = temperatura;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja el termómetro con base en la temperatura
        dibujarTermometro(g);
    }

    private void dibujarTermometro(Graphics g) {
        // Obtén las dimensiones del componente
        int width = getWidth();
        int height = getHeight();

        // Calcula la altura del termómetro según la temperatura
        int termometroAltura = temperatura * (height - 20) / 100;

        // Dibuja el termómetro
        //g.setColor(Color.RED); // Puedes ajustar el color según tu preferencia
        if (temperatura <= 50) {
            
            g.setColor(Color.GREEN);
        } else if (temperatura <= 80) {
            
            g.setColor(Color.YELLOW);
        } else {
            
            g.setColor(Color.RED);
        }
        g.fillRect(width / 2 - 10, height - termometroAltura - 10, 20, termometroAltura);
        g.setColor(Color.BLACK);
        g.drawRect(width / 2 - 10, height - 10, 20, 10);
    }

}
