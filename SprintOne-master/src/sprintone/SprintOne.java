/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprintone;

import Controlador.ControladorRegistros;
import Vista.Alquilar;
import Vista.AlquilarFinal;
import Vista.CancelarAlquiler;
import Vista.ConsultarAvion;
import Vista.ConsultarCliente;
import Vista.ConsultarHangar;
import Vista.Factura;
import Vista.Menu;
import Vista.RegistrarAvion;
import Vista.RegistrarCliente;
import Vista.RegistrarHangar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.text.StyleConstants;

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
        Factura             fc         = new Factura();
       
        ConsultarCliente        cc= new ConsultarCliente();
        ConsultarHangar         ch = new ConsultarHangar();
        ConsultarAvion          ca = new ConsultarAvion();
        CancelarAlquiler        cAl = new CancelarAlquiler();
        ControladorRegistros cr = new ControladorRegistros(r,rc,ra,a,af,mn,cc,ch,ca,fc,cAl);
        
    }

    private static void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
