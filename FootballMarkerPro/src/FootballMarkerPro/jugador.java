/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballMarkerPro;

/**
 *
 * @author Rene Arzeno
 */
public class jugador {
    private int id, puntos,pases, tarjetasA,tarjetaR , asistencias;


    public jugador(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    
    public int getId() {
        return id;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @return the pases
     */
    public int getPases() {
        return pases;
    }

    /**
     * @return the tarjetasA
     */
    public int getTarjetasA() {
        return tarjetasA;
    }

    /**
     * @return the tarjetaR
     */
    public int getTarjetaR() {
        return tarjetaR;
    }

    /**
     * @return the asistencias
     */
    public int getAsistencias() {
        return asistencias;
    }
    
    public void anotarPuntos(){
                
        puntos++;
    
        
    }
    public void darPases(){
        
        pases++;
    }
    public void darFaltas (int p){
        if (p == 1){
            tarjetasA ++;
        }
        else{
             tarjetaR++;   
        }
    
    }
    public void asistencia(){
        asistencias++;
    }
    
    @Override
    public String toString(){
        String s="  Jugador: "+String.valueOf(id+1)+"\n";
        s=s+"Puntos:           "+puntos+"\n";
        s=s+"Pases:            "+pases+"\n";
        s=s+"T. Amarillas:  "+tarjetasA+"\n";
        s=s+"T.Rojas:          "+tarjetaR+"\n";
        s= s +"Asistencias:    "+asistencias+ "\n";
        s=s+"\n";
        return s;
    }
}
