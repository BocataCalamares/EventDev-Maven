package com.azahartech.eventdev.modelo;

import java.time.LocalDate;

public class Evento {

    //ATRIBUTOS
    private String nombre;
    private LocalDate fecha;
    private Recinto recinto;
    private double precio;

    //METODOS
    //CONSTRUCTOR

    /**
     * Creacion de un evento y registro de sus atributos dentro del sistema EventDEV.
     *
     * @author Jonathan Rosa Aledón
     * @version 1.0
     *
     */
    public Evento(String nuevoNombre, LocalDate nuevaFecha, Recinto nuevoRecinto, double nuevoPrecio){
        nombre=nuevoNombre;
        fecha=nuevaFecha;
        recinto=nuevoRecinto;
        precio=nuevoPrecio;
    }
    //CONSULTAS

    /**
     * Metodo para obtener el nombre de un evento.
     * @return Devuelve el nombre del evento
     */
    public String consultarNombre(){
        return nombre;
    }
    public String consultarFecha(){
        return fecha.toString();
    }

    public double consultarPrecio(){
        return precio;
    }
    public Recinto consultarRecinto(){
        return recinto;
    }
    public void mostrarInformacion(){
        System.out.printf("---EVENTO---%nEl evento %s se realizará el dia %s en %s%n---%n", nombre, fecha, recinto.consultarNombreRecinto());
    }

    /**
     * Metodo para reguistrar una venta
     * @param cantidad cantidad de entradas a comprar
     */
    public void registrarVenta(int cantidad){
        System.out.printf("Venta registrada%n");
    }
}
