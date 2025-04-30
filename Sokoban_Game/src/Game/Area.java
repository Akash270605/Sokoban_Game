/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Area extends Actor{
    public Area(int x, int y){
        super(x, y);
        
        initArea();
    }
    
    private void initArea(){
       ImageIcon iicon = new ImageIcon("src/resources/area.png");
       Image image = iicon.getImage();
       setImage(image);
    }
}
