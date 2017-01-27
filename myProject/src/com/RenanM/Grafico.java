package com.RenanM;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Marcel on 1/26/2017.
 */
public class Grafico extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 300, 100);
        g.setColor(Color.BLACK);
    }
}
