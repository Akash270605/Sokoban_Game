/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Baggage extends Actor{
    public Baggage(int x, int y){
        super(x, y);
        
        initBaggage();
    }
    
    private void initBaggage(){
        ImageIcon iicon = new ImageIcon("src/resources/baggage.png");
        Image image = iicon.getImage();
        setImage(image);
    }
    
    public void move(int x, int y){
        int dx = x() + x;
        int dy = y() +y;
        
        setX(dx);
        setY(dy);
    }
}
