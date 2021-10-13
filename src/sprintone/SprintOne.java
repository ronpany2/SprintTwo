/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintone;

import Controlador.ControladorRegistros;
import Vista.Alquilar;
import Vista.AlquilarFinal;
import Vista.Menu;
import Vista.RegistrarAvion;
import Vista.RegistrarCliente;
import Vista.RegistrarHangar;

/**
 *
 * @author RONNY PANTOJA
 */
public class SprintOne {

    public static void main(String[] args) {
        RegistrarHangar     r          = new RegistrarHangar();
        RegistrarCliente    rc         = new RegistrarCliente();
        RegistrarAvion      ra         = new RegistrarAvion();
        Alquilar            a          = new Alquilar();
        AlquilarFinal       af         = new AlquilarFinal();
        Menu                mn         = new Menu();
        ControladorRegistros cr = new ControladorRegistros(r,rc,ra,a,af,mn);
     
        
    }
    
}
