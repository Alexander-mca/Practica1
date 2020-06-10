/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

import compi1vacasjunio2020.practica1.Token.Tipo;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author alexa
 */
public class Item {
   private Pieza datos;
    private JButton[][] pieza;

    public Pieza getDatos() {
        return datos;
    }

    public JButton[][] getPieza() {
        return pieza;
    }

    public Item(Pieza datos) {
        this.datos = datos;
        this.pieza=new JButton[4][4];
    }
    public void CrearPieza(){
        if(datos!=null){
            Tipo tipo=datos.getOrientacion();
            switch(datos.getPieza()){
                case "i":
                    if(tipo.equals(Tipo.arriba) || tipo.equals(Tipo.abajo)){
                        for (int i = 0; i < 4; i++) {
                            pieza[i][0]=new JButton();
//                            pieza[i][0].setSize(5,5);
                            pieza[i][0].setBackground(Color.cyan);
                           
                        }
                    }
                    if(tipo.equals(Tipo.menor)   || tipo.equals(Tipo.mayor)){
                         for (int i = 0; i < 4; i++) {
                            pieza[3][i]=new JButton();
//                            pieza[2][i].setSize(5,5);
                            pieza[3][i].setBackground(Color.cyan);
                        }
                    }
                    break;
                case "j":
                    switch (tipo) {
                        case arriba:
                            for (int i = 0; i < 3; i++) {
                                pieza[i][1]=new JButton();
                                pieza[i][1].setBackground(Color.blue);
                            }
                            pieza[3][0]=new JButton();
                            pieza[3][0].setBackground(Color.blue);
                            break;
                        case abajo:
                             for (int i = 1; i < 4; i++) {
                                pieza[i][1]=new JButton();
                                pieza[i][1].setBackground(Color.blue);
                            }
                            pieza[1][2]=new JButton();
                            pieza[1][2].setBackground(Color.blue);
                            break;
                        case mayor:
                             for (int i = 0; i < 3; i++) {
                                pieza[3][i]=new JButton();
                                pieza[3][i].setBackground(Color.blue);
                            }
                            pieza[2][0]=new JButton();
                            pieza[2][0].setBackground(Color.blue);
                            break;
                        case menor:
                            for (int i = 0; i < 3; i++) {
                                pieza[2][i]=new JButton();
                                pieza[2][i].setBackground(Color.blue);
                            }
                            pieza[3][2]=new JButton();
                            pieza[3][2].setBackground(Color.blue);
                            break;
                            
                    }
                    break;
                case "l":
                    Color color=new Color(255,102,0);
                     switch (tipo) {
                        case arriba:
                            for (int i = 1; i < 4; i++) {
                                pieza[i][1]=new JButton();
                                
                                pieza[i][1].setBackground(color);
                            }
                            pieza[3][2]=new JButton();
                            pieza[3][2].setBackground(color);
                            break;
                        case abajo:
                             for (int i = 1; i < 4; i++) {
                                pieza[i][1]=new JButton();
                                pieza[i][1].setBackground(color);
                            }
                            pieza[1][0]=new JButton();
                            pieza[1][0].setBackground(color);
                            break;
                        case mayor:
                             for (int i = 0; i < 3; i++) {
                                pieza[2][i]=new JButton();
                                
                                pieza[2][i].setBackground(color);
                            }
                            pieza[3][0]=new JButton();
                            pieza[3][0].setBackground(color);
                            break;
                        case menor:
                            for (int i = 0; i < 3; i++) {
                                pieza[3][i]=new JButton();
                                pieza[3][i].setBackground(color);
                            }
                            pieza[2][2]=new JButton();
                            pieza[2][2].setBackground(color);
                            break;
                            
                    }
                    break;
                case "o":
                    for (int i = 2; i < 4; i++) {
                        pieza[i][0]=new JButton();
                        pieza[i][1]=new JButton();
                        pieza[i][0].setBackground(Color.yellow);
                        pieza[i][1].setBackground(Color.yellow);
                                
                    }
                    break;
                case "s":
                    if(tipo.equals(Tipo.arriba) || tipo.equals(Tipo.abajo)){
                    for (int i = 0; i < 2; i++) {
                        pieza[3][i]=new JButton();
                        pieza[3][i].setBackground(Color.green);
                        pieza[2][i+1]=new JButton();
                        pieza[2][i+1].setBackground(Color.green);
                    }
                     return;
                    }
                    
                    for (int i = 1; i < 3; i++) {
                         pieza[i][1]=new JButton();
                        pieza[i][1].setBackground(Color.green);
                        pieza[i+1][2]=new JButton();
                        pieza[i+1][2].setBackground(Color.green);
                    }
                    break;
                case "z":
                    if(tipo.equals(Tipo.arriba) || tipo.equals(Tipo.abajo)){
                    for (int i = 0; i < 2; i++) {
                        pieza[3][i+1]=new JButton();
                        pieza[3][i+1].setBackground(Color.red);
                        pieza[2][i]=new JButton();
                        pieza[2][i].setBackground(Color.red);
                    }
                     return;
                    }
                    
                    for (int i = 1; i < 3; i++) {
                         pieza[i+1][1]=new JButton();
                        pieza[i+1][1].setBackground(Color.red);
                        pieza[i][2]=new JButton();
                        pieza[i][2].setBackground(Color.red);
                    }
                    break;
                case "t":
                     switch (tipo) {
                        case mayor:
                            for (int i = 1; i < 4; i++) {
                                pieza[i][1]=new JButton();
                                pieza[i][1].setBackground(Color.magenta);
                            }
                            pieza[2][0]=new JButton();
                            pieza[2][0].setBackground(Color.magenta);
                            break;
                        case menor:
                             for (int i = 1; i < 4; i++) {
                                pieza[i][1]=new JButton();
                                pieza[i][1].setBackground(Color.magenta);
                            }
                            pieza[2][2]=new JButton();
                            pieza[2][2].setBackground(Color.magenta);
                            break;
                        case arriba:
                             for (int i = 0; i < 3; i++) {
                                pieza[2][i]=new JButton();
                                pieza[2][i].setBackground(Color.magenta);
                            }
                            pieza[3][1]=new JButton();
                            pieza[3][1].setBackground(Color.magenta);
                            break;
                        case abajo:
                            for (int i = 0; i < 3; i++) {
                                pieza[3][i]=new JButton();
                                pieza[3][i].setBackground(Color.magenta);
                            }
                            pieza[2][1]=new JButton();
                            pieza[2][1].setBackground(Color.magenta);
                            break;
                            
                    }
                    break;
            }
        }
    }
}
