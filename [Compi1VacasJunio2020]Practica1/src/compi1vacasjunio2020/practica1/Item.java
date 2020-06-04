/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

import compi1vacasjunio2020.practica1.Token.Tipo;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author alexa
 */
public class Item {
    Pieza datos;
    JLabel[][] pieza;

    public Item(Pieza datos) {
        this.datos = datos;
        this.pieza=new JLabel[4][4];
    }
    public void CrearPieza(){
        if(datos!=null){
            Tipo tipo=datos.getOrientacion();
            switch(datos.getPieza()){
                case "i":
                    if(tipo.equals(Tipo.arriba) || tipo.equals(Tipo.abajo)){
                        for (int i = 0; i < 4; i++) {
                            pieza[i][0]=new JLabel();
                            pieza[i][0].setSize(5,5);
                            pieza[i][0].setBackground(Color.cyan);
                        }
                    }
                    if(tipo.equals(Tipo.menor)   || tipo.equals(Tipo.mayor)){
                         for (int i = 0; i < 4; i++) {
                            pieza[3][i]=new JLabel();
                            pieza[3][i].setSize(5,5);
                            pieza[3][i].setBackground(Color.cyan);
                        }
                    }
                    break;
                case "j":
                    break;
                case "l":
                    break;
                case "o":
                    break;
                case "s":
                    break;
                case "z":
                    break;
                case "t":
                    break;
            }
        }
    }
}
