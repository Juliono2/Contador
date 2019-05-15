/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *Clase
 * @author Estudiantes
 */
public class Contador {
    
    private int valor;
    /* 
    Metodo constructor de la clase Contador 
    */
    public Contador() {
        this.valor =0;
    }
    /* 
    Metodo que retorna valor, atributo de la clase contador
    @return el valor del contador
    */
    public int getValor() {
        return valor;
    }
    /* 
    Metodo que asigna un valor a la variable "Valor" de la clase contador
    @param valor: Entero que se setea en el atributo de la clase contador
    */
    public void setValor(int valor) {
        this.valor = valor;
    }
    /* 
    Metodo que avanza el valor del cronometro 
    */
    public void avanzar(){
        this.valor +=1;
    }
    /* 
    Metodo que retrocede el valor del contador
    */
    public void retroceder(){
        this.valor -=1;
    }
    /* 
    Metodo que borra el valor del cronometro 
    */
    public void borrar(){
       this.valor = 0; 
    }
}
