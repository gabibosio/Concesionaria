package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void crearAuto(String color, String marca, String modelo, String patente, double Motor, int Puertas) {
        Automovil auto = new Automovil();
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setMotor(Motor);
        auto.setCantidadPuertas(Puertas);
        
        controladoraPersis.crearAuto(auto);
    }

    public List<Automovil> traerAutos() {
      return controladoraPersis.traerAutos();
    }

    public void eliminarAuto(int id) {
       controladoraPersis.elminarAuto(id);
    }

    public Automovil traerAuto(int id) {
       return controladoraPersis.traerAuto(id);
    }

    public void editarAuto(Automovil auto, String color, String marca, String modelo, String patente, double Motor, int Puertas) {
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setMotor(Motor);
        auto.setCantidadPuertas(Puertas);
        
        controladoraPersis.editarAuto(auto);
    }

    
    
}
