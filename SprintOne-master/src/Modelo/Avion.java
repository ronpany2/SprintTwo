/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author RONNY PANTOJA
 */
public class Avion {
    private int matricula;
    private float alto;
    private float ancho;
    private float largo;
    private int propietario;

    public Avion(int matricula, float alto, float ancho, float largo, int propietario) {
        this.matricula = matricula;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.propietario = propietario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }
    
    
    
    
}
