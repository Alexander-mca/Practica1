/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

import javax.swing.JButton;


/**
 *
 * @author alexa
 */
public class Matriz {
   private int x, y;
   private String id;
   private JButton[][] matriz;

    public void setMatriz(JButton[][] matriz) {
        this.matriz = matriz;
    }
    
    

    public void setId(String id) {
        this.id = id;
    }

    
    public String getId() {
        return id;
    }

    public JButton[][] getMatriz() {
        return matriz;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Matriz(int x, int y, String id) {
        this.matriz=new JButton[x][y];
        this.x=x;
        this.y=y;
        this.id = id;
    }
    public Matriz(int x, int y, String id,JButton[][] matriz){
        this.matriz=matriz;
        this.x=x;
        this.y=y;
        this.id = id;
    }
}
