/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fondo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author DavidReyna
 */
public class ImagenFondo implements Border{
    public BufferedImage back;
    public ImagenFondo(){
        try {
            URL imagenPath = new URL(getClass().getResource("/imagenes/futures.jpg").toString());
            back = ImageIO.read(imagenPath);
        } catch (Exception e) {
        }
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())/2), (y + (height - back.getHeight())/2), null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
    
}
