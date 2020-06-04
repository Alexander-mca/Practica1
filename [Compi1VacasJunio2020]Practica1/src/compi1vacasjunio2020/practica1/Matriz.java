/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

import javax.swing.JLabel;

/**
 *
 * @author alexa
 */
public class Matriz {
    int x, y;
    String id;
    JLabel[][] matriz;
    
    

    public void setId(String id) {
        this.id = id;
    }

    
    public String getId() {
        return id;
    }

    public JLabel[][] getMatriz() {
        return matriz;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Matriz(int x, int y, String id) {
        this.matriz=new JLabel[y][x];
        
        this.id = id;
    }
    
}
