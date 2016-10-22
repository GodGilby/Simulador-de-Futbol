
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballMarkerPro;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rene Arzeno
 */
public class equipo {
    
    private String nombre;
    private jugador[] jugadores = new jugador[14];

    public equipo(String gnombre) {
        initJugadores();
        nombre = gnombre;
    }
    
    
    int tarjetasAmarillas ,tarjetasRojas, tirosdeE,saquedeB,tirofallido, balonesPerdidos,pases,puntos,posicionAdelantada, asistencia;
    public int posbalon, posanterior, sustituciones,cantJ=11;
    Random ran = new Random();
    
    
    //En esta funcion se inicializan los catorce jugadores
    public void initJugadores(){
        for (int i=0;i<14;i++){
            jugadores[i]=new jugador(i);
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String name){
        nombre = name;
    }

    public jugador[] getJugadores() {
        return jugadores;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public int getTirosdeE() {
        return tirosdeE;
    }

    public int getSaquedeB() {
        return saquedeB;
    }

    public int getTirofallido() {
        return tirofallido;
    }

    public int getBalonesPerdidos() {
        return balonesPerdidos;
    }

    public int getPases() {
        return pases;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPosicionA() {
        return posicionAdelantada;
    }
    
    public void swap(int A, int B){
        jugador  C = jugadores[A];
        jugadores[A] = jugadores[B];
        jugadores[B]= C;
    }
    
    public boolean tiroalaPorteria (ArrayList<String> historial, int min, int secs){
        
        int p  = ran.nextInt(10);
        //Si el tiro resulta  fallido
        if (p <=7){
            tirofallido++;
            int F = ran.nextInt(10);
            historial.add("*Tiro Fallido,    equipo: "+getNombre()+" minuto: "+String.valueOf(min)+":"+String.valueOf(secs));
            //Si el balon queda en el equipo contrario
            if(F<7){
                
                // posbalon = 14;
                
                return false;            
            }

            //Si el balon queda en el mismo equipo
            else{
                int J = ran.nextInt(cantJ-1);
                posanterior = posbalon;
                posbalon = 1+ J;
                return true;
            }
            //historial.add("Tiro Fallido, equipo: "+getEquipo()+"   minuto:"+String.valueOf(min)+":"+String.valueOf(secs));
        }
        //Si el tiro resulta exitoso
        else{
            historial.add("*GOOOOOOOL!!!!!!!!!,    equipo: "+getNombre()+" minuto: "+String.valueOf(min)+":"+String.valueOf(secs));
            puntos++;
            jugadores[posbalon].anotarPuntos();
            jugadores[posanterior].asistencia();
            asistencia ++;
            return false;
        }
        
    }
    
    public boolean pases (){
        
        int p = ran.nextInt(100);
        //Si el pase resulta exitoso a un compañero
        if(p <90){
            pases++;
            jugadores[posbalon].darPases();
            int J = ran.nextInt(cantJ-1);
            //Si random cae en la misma posicion del jugador
            if (posbalon==J){
                int c = posbalon;
                posbalon = posanterior;
                posanterior = c;
            }
            //Si el random es diferente de la posicion del jugador
            else{
                posanterior = posbalon;
                posbalon = 1 + J;
            }
            return true;
        }
        //Si se pierde el balon
        else if(p < 98){
            balonesPerdidos++;
            //posbalon = 14;
            return false;
        }
        //Si el pase es adelantado
        else{
                posicionAdelantada++;
                //posbalon = 14;
                return false;
                }
        
    }
    public void falta(ArrayList<String> historial,int min,int secs){
        
        int p = ran.nextInt(cantJ-1);
        //Si la falta resulta una tarjeta amarilla
        if(p < 9){
            tarjetasAmarillas++;
            jugadores[posbalon].darFaltas(1);
            //Esta funcion indica si el jugador tiene que abandonar el equipo por exceder la  cantidad de faltas permitidas
            if(jugadores[posbalon].getTarjetasA() == 2){
                swap(posbalon,cantJ-1);
                cantJ-=1;
            }
            //Esta condicion indica si despues del jugador dar una falta se sustituira o no
            else if(sustituciones <3){
                int f = ran.nextInt(3);
                if (f<2){
                    sustituciones++;
                    swap(posbalon,10+sustituciones);
                    
                }
                
            }
            historial.add("*Tarjeta Amarilla,    equipo: "+getNombre()+"   minuto:"+String.valueOf(min)+":"+String.valueOf(secs));
        }
        //Si la falta resulta una tarjeta roja
        else{
            tarjetasRojas++;
            jugadores[posbalon].darFaltas(2);
            swap(posbalon,cantJ-1);
            cantJ-=1;
            historial.add("*Tarjeta Roja,    equipo: "+getNombre()+"       minuto:"+String.valueOf(min)+":"+String.valueOf(secs));
        }
        // posbalon = 14;
    }
    
    public boolean saque(ArrayList<String> historial, int min, int secs){
        //Esta fucion sirve para cuando se realiza un saque
        int s = ran.nextInt(2);
        int j = 1+ran.nextInt(cantJ-1);
        posbalon = j;
        if (s==1){
            saquedeB++;
            historial.add("*Saque de Banda, equipo: "+getNombre()+"       minuto:"+String.valueOf(min)+":"+String.valueOf(secs));
        }else{
            tirosdeE++;
            historial.add("*Tiro de Esquina, equipo: "+getNombre()+"       minuto:"+String.valueOf(min)+":"+String.valueOf(secs));
        }
        return pases();
    }
    
}
