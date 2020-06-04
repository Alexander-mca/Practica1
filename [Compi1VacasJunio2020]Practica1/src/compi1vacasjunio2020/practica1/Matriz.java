/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

/**
 *
 * @author alexa
 */
public class Matriz {
    int x, y;
    String id;
    String[][] matriz;
    
    

    public void setId(String id) {
        this.id = id;
    }

    
    public String getId() {
        return id;
    }

    public String[][] getMatriz() {
        return matriz;
    }
    
    public Matriz(int x, int y, String id) {
        this.matriz=new String[y][x];
        
        this.id = id;
    }
    
}
