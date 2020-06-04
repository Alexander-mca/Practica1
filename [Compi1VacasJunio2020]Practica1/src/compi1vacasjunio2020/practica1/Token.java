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
public class Token {
    public String lexema;
    int fila,columna;
    public Tipo tipo;

    public Token(String lexema, int fila, int columna, Tipo tipo) {
        this.lexema = lexema;
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }
    
    
    public enum  Tipo{
     error,id,numero,asterisco,numeral,coma, mayor,menor,abajo,arriba,ComentarioSimple,ComentarioMult,guion
    }        
}
