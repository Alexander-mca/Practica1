/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1vacasjunio2020.practica1;

import compi1vacasjunio2020.practica1.Token.Tipo;

/**
 *
 * @author alexa
 */
public class Pieza {
   private String pieza;
   private Tipo Orientacion;

    public Pieza(String pieza, Tipo Orientacion) {
        this.pieza = pieza;
        this.Orientacion = Orientacion;
    }

    public String getPieza() {
        return pieza;
    }

    public Tipo getOrientacion() {
        return Orientacion;
    }
    
}
