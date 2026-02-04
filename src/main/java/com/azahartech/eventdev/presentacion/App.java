package com.azahartech.eventdev.presentacion;
import com.azahartech.eventdev.modelo.*;
import com.azahartech.eventdev.servicio.ServicioEvento;
import com.google.gson.Gson;

import java.time.LocalDate;

/**
 * Aplicación de gestión de eventos
 * @author Jonathan Rosa Aledón
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
        Recinto Cdf = new Recinto("Casal de Festes", "Calle Colón nº5", 550);
        Evento eventoDePrueba = new Evento("Feria de Mayo", LocalDate.of(2025, 12, 27), Cdf, 20);
                // 1. Creamos y damos datos a nuestro objeto Evento
       // Evento miConcierto = new Evento();
        //eventoDePrueba.() = "Concierto Inauguración Azahar Tech";
        //miConcierto.fecha = "2025-09-25";
        // 2. Usamos la herramienta Gson para la conversión
        Gson gson = new Gson();
        String textoJson = gson.toJson(eventoDePrueba);
        // 3. Mostramos el resultado
        System.out.println("--- CONVIRTIENDO OBJETO A JSON ---");
        System.out.println("La librería Gson ha convertido nuestros datos a este texto:");
        System.out.println(textoJson);
    }
}