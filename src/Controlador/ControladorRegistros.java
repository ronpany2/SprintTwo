/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Vista.Alquilar;
import Vista.AlquilarFinal;
import Vista.Menu;
import Vista.RegistrarAvion;
import Vista.RegistrarCliente;
import Vista.RegistrarHangar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RONNY PANTOJA
 */
public class ControladorRegistros implements ActionListener{
    public static int       index = -1;
    public static String    alto = "";
    public static String    ancho = "";
    public static String    largo = "";
    RegistrarHangar         registrarHangar;
    RegistrarCliente        registrarCliente;
    RegistrarAvion          registrarAvion;
    Alquilar                alquilarAvion;
    AlquilarFinal           alquilarFinal;
    Menu                    menu;

    public ControladorRegistros() {
        super();
    }

    public ControladorRegistros(RegistrarHangar registrarHangar,RegistrarCliente registrarCliente, RegistrarAvion registrarAvion,Alquilar alquilarAvion,AlquilarFinal alquilarFinal, Menu menu) {
        this.registrarHangar    = registrarHangar;
        this.registrarCliente   = registrarCliente;
        this.registrarAvion     = registrarAvion;
        this.alquilarAvion      = alquilarAvion;
        this.alquilarFinal      = alquilarFinal;
        this.menu               = menu;
        agregarEventos();
        
        menu.setVisible(true);
        
        
      
    }
    public void agregarEventos(){
        registrarHangar.getBtn_Registrar().addActionListener(this);
        registrarCliente.getBtn_registrar().addActionListener(this);
        registrarAvion.getBtn_registrar().addActionListener(this);
        alquilarAvion.getBtn_alquilar().addActionListener(this);
        alquilarAvion.getBtn_refrescar().addActionListener(this);
        alquilarFinal.getBtn_alquilar().addActionListener(this);
        alquilarFinal.getBtn_registrar().addActionListener(this);
        alquilarFinal.getBtn_buscar().addActionListener(this);
        alquilarFinal.getBtn_refrescar().addActionListener(this);
        menu.getBtn_alquilar().addActionListener(this);
        menu.getBtn_cliente().addActionListener(this);
        menu.getBtn_hangar().addActionListener(this);
        
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==registrarHangar.getBtn_Registrar()){
            registrarHangar();
        }
        if(ae.getSource()==registrarCliente.getBtn_registrar()){
            registrarCliente();
        }
        if (ae.getSource()==registrarAvion.getBtn_registrar()){
            registrarAvionHangar();
        }
        if(ae.getSource()==alquilarAvion.getBtn_refrescar()){
            refrescar();
        }
        
        if(ae.getSource()==alquilarAvion.getBtn_alquilar()){
            alquilar();
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_refrescar()){
            refrescarAviones();
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_registrar()){
            registrarAvion.setVisible(true);
        }
        
        if(ae.getSource()==alquilarFinal.getBtn_buscar()){
            buscarAvionesHangar();
        }
        
        if (ae.getSource()==alquilarFinal.getBtn_alquilar()){
            GuardarAlquiler(index,alto,largo,ancho);
        }
        if(ae.getSource()==menu.getBtn_alquilar()){
            alquilarAvion.setVisible(true);
        }
        
        if(ae.getSource()==menu.getBtn_cliente()){
            registrarCliente.setVisible(true);
        }
        
        if(ae.getSource()==menu.getBtn_hangar()){
            registrarHangar.setVisible(true);
        }
    }
// ================================== REGISTRAR HANGAR =========================================================================
    public boolean validarCamposHangar(){
        boolean band = false;
        if (registrarHangar.getTxt_Alto().getText().equals("") || registrarHangar.getTxt_Ancho().getText().equals("") || registrarHangar.getTxt_Largo().equals("")){
        JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{
        band = true;}
    return band;
    }  
    public boolean registrarHangar(){
        
        boolean band=false;
        if(validarCamposHangar()){
            String alto = registrarHangar.getTxt_Alto().getText();
            String ancho = registrarHangar.getTxt_Ancho().getText();
            String largo = registrarHangar.getTxt_Largo().getText();

            String sql = "INSERT INTO hangar (idhangar,alto,largo,ancho,estado) VALUES(?,?,?,?,?)";
            Connection conectar;
            PreparedStatement pst;
            try {
                conectar = Conexion.getConnection();
                pst = conectar.prepareStatement(sql);
                pst.setInt(1, 0);
                pst.setString(2, alto);
                pst.setString(3, largo);
                pst.setString(4, ancho);
                pst.setInt(5, 0);
                int i = pst.executeUpdate();
                if(i!=0){
                    JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");
                    band = true;
                }else{
                    band= false;
                }
            } catch (SQLException e) {
            }
        
        }
    return band;
    }
    
//=================================== REGISTRAR CLIENTE =============================================================================

    public boolean registrarCliente(){
        boolean band = false;
        if(validarCamposCliente()){
                if(buscarCliente()==false){
                int idcliente = Integer.parseInt(registrarCliente.getTxt_identificacion().getText());
                String nombre = registrarCliente.getTxt_nombre().getText();
                String email = registrarCliente.getTxt_email().getText();
                String direccion = registrarCliente.getTxt_direccion().getText();
                String telefono = registrarCliente.getTxt_telefono().getText();

                String sql = "INSERT INTO cliente (idcliente,nombre,email,direccion,telefono) VALUES(?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idcliente);
                    pst.setString(2, nombre);
                    pst.setString(3, email);
                    pst.setString(4, direccion);
                    pst.setString(5, telefono);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");
                        registrarAvion.getTxt_propieetario().setText(registrarCliente.getTxt_identificacion().getText());
                        registrarAvion.setVisible(true);
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
            
        }
        }
    return band;
    }
    public boolean buscarCliente(){
        boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = ?");
            ps.setInt(1, Integer.parseInt(registrarCliente.getTxt_identificacion().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idcliente");
                JOptionPane.showMessageDialog(null, "EL CLIENTE CON ID: "+id+" YA SE ENCUENTRA REGISTRADO");
                band = true;
            }else{}
        } catch (Exception e) {
        }
        
        
        
    return band;
    }
    
    public boolean buscarClienteAvion(){
        boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idcliente FROM cliente WHERE idcliente = ?");
            ps.setInt(1, Integer.parseInt(registrarAvion.getTxt_propieetario().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idcliente");
                band = true;
            }else{}
        } catch (Exception e) {
        }
        
        
        
    return band;
    }
    
    public boolean validarCamposCliente(){
        boolean band = false;
        if(registrarCliente.getTxt_direccion().getText().equals("")||registrarCliente.getTxt_email().getText().equals("")||registrarCliente.getTxt_identificacion().getText().equals("")||registrarCliente.getTxt_nombre().getText().equals("")||registrarCliente.getTxt_telefono().getText().equals("")){
             JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{band = true;}
    return band;
    }
    
//=================================== REGISTRAR AVION ================================================================================
    public boolean registrarAvion(){
        boolean band = false;
        if(validarCamposCliente()){
            if (buscarAvion()==false && validarCamposAvion()==true){
                int idavion = Integer.parseInt(registrarAvion.getTxt_matricula().getText());
                String alto = registrarAvion.getTxt_alto().getText();
                String largo = registrarAvion.getTxt_largo().getText();
                String ancho = registrarAvion.getTxt_ancho().getText();
                int idcliente = Integer.parseInt(registrarAvion.getTxt_propieetario().getText());
                String estado = "0";
                
                System.out.println(idavion+" \n"+alto);
                
                String sql = "INSERT INTO avion (idavion,alto,largo,ancho,idcliente,estado) VALUES(?,?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idavion);
                    pst.setString(2, alto);
                    pst.setString(3, largo);
                    pst.setString(4, ancho);
                    pst.setInt(5, idcliente);
                    pst.setString(6, estado);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");          
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
                
            }
        }
        registrarAvion.getTxt_alto().setText("");
        registrarAvion.getTxt_ancho().setText("");
        registrarAvion.getTxt_largo().setText("");
        
        registrarAvion.getTxt_aerolinea().setText("");
            
    return band;
    }
    
    public boolean registrarAvionHangar(){
        boolean band = false;
        if (buscarAvion()==false && validarCamposAvion()==true){
            if(buscarClienteAvion()==true){
            
                int idavion = Integer.parseInt(registrarAvion.getTxt_matricula().getText());
                String alto = registrarAvion.getTxt_alto().getText();
                String largo = registrarAvion.getTxt_largo().getText();
                String ancho = registrarAvion.getTxt_ancho().getText();
                int idcliente = Integer.parseInt(registrarAvion.getTxt_propieetario().getText());
                String estado = "0";
                
                System.out.println(idavion+" \n"+alto);
                
                String sql = "INSERT INTO avion (idavion,alto,largo,ancho,idcliente,estado) VALUES(?,?,?,?,?,?)";
                Connection conectar;
                PreparedStatement pst;
                try {
                    conectar = Conexion.getConnection();
                    pst = conectar.prepareStatement(sql);
                    pst.setInt(1, idavion);
                    pst.setString(2, alto);
                    pst.setString(3, largo);
                    pst.setString(4, ancho);
                    pst.setInt(5, idcliente);
                    pst.setString(6, estado);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente");          
                        band = true;
                    }else{
                        band= false;
                    }
                } catch (SQLException e) {
                }
            
            }else{JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE");     }
                
                
            }
        return band;
    }
    
    public boolean buscarAvion(){
         boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idavion FROM avion WHERE idavion = ?");
            ps.setInt(1, Integer.parseInt(registrarAvion.getTxt_matricula().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idavion");
                JOptionPane.showMessageDialog(null, "EL AVION CON ID: "+id+" YA SE ENCUENTRA REGISTRADO");
                band = true;
            }else{}
        } catch (Exception e) {
        }       
                
    return band;
    }
    public boolean validarCamposAvion(){
        boolean band = false;
         if (registrarAvion.getTxt_aerolinea().getText().equals("")||registrarAvion.getTxt_alto().getText().equals("")||registrarAvion.getTxt_ancho().getText().equals("")||registrarAvion.getTxt_largo().getText().equals("")||registrarAvion.getTxt_matricula().getText().equals("")||registrarAvion.getTxt_propieetario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS! "); 
        }else{ band = true;}
        
    return band;    
    }
    
    //================================== ALQUILAR HANGAR ==================================================================================
    public void refrescar(){
         try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarAvion.getTbl_hangares().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idhangar, alto, largo, ancho, estado FROM hangar";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("ID Hangar");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("Estado");

            while(rs.next()){

                Object [] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }

                modelo.addRow(filas);
            }
            

        }catch(SQLException ex){

            System.err.println(ex.toString());
        }
         
        for(int i = 0; i<alquilarAvion.getTbl_hangares().getRowCount(); i++) {//para recorrer la filas de jtabla
                           
                String s = alquilarAvion.getTbl_hangares().getValueAt(i, 4).toString();
                
                if(!s.equals("0")){
                    alquilarAvion.getTbl_hangares().setValueAt("NO DISPONIBLE", i, 4);                   
                }
                else{                
                    alquilarAvion.getTbl_hangares().setValueAt("DISPONIBLE", i, 4);  
                }             
            
        }
        
    }  

    public void alquilar(){
        
        try {
            
        int indice_1 = alquilarAvion.getTbl_hangares().getSelectedRow();        
        
        if(indice_1<0){
        
            JOptionPane.showMessageDialog(null, "ESCOJA UN HANGAR PARA ALQUILAR"); 
            
        }else{
            String indice = alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 4).toString();
            if (indice.equals("NO DISPONIBLE")){
        
            JOptionPane.showMessageDialog(null, "EL HANGAR YA ESTA OCUPADO, ESCOJA UN HANGAR DISPONIBLE"); 
        }
        else{
            
            alquilarFinal.setVisible(true);
                        
        }
        }
        index=indice_1+1;
        alto= alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 1).toString();
        largo=alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 2).toString();
        ancho=alquilarAvion.getTbl_hangares().getValueAt(alquilarAvion.getTbl_hangares().getSelectedRow(), 3).toString();
        } catch (Exception e) {
            
        }
        
    }
    
    
    public void refrescarAviones(){
    
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarFinal.getTbl_aviones().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idavion, alto, largo, ancho, idcliente, estado FROM avion";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("ID Cliente");
            modelo.addColumn("Estado");

            while(rs.next()){

                Object [] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }

                modelo.addRow(filas);
            }
            

        }catch(SQLException ex){

            System.err.println(ex.toString());
        }
        
        for(int i = 0; i<alquilarFinal.getTbl_aviones().getRowCount(); i++) {//para recorrer la filas de jtabla
                           
                String s = alquilarFinal.getTbl_aviones().getValueAt(i, 5).toString();
                
                if(!s.equals("0")){
                    alquilarFinal.getTbl_aviones().setValueAt("EN HANGAR", i, 5);                   
                }
                else{                
                    alquilarFinal.getTbl_aviones().setValueAt("SIN HANGAR", i, 5);  
                }             
            
        }
    }
    
    public void buscarAvionesHangar(){
        String matricula    = alquilarFinal.getTxt_matricula().getText();
        String where        = "";
        
        if(!matricula.equals("")){
        
            where = "WHERE idavion = '"+matricula+"'";
        }
        else{JOptionPane.showMessageDialog(null, "INGRESE UNA MATRICULA");}
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            alquilarFinal.getTbl_aviones().setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT idavion, alto, largo, ancho, idcliente FROM avion "+where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modelo.addColumn("Matricula");
            modelo.addColumn("Alto");
            modelo.addColumn("Largo");
            modelo.addColumn("Ancho");
            modelo.addColumn("ID Cliente");

            while(rs.next()){

                Object [] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }

                modelo.addRow(filas);
            }
            

        }catch(SQLException ex){

            System.err.println(ex.toString());
        }
        
    }
    
    public void GuardarAlquiler(int idhangar, String alto, String largo, String ancho){
        try {
            String s = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 5).toString();

       if (s.equals("EN HANGAR")){
       
           JOptionPane.showMessageDialog(null, "ESCOJA UN AVION SIN HANGAR");
       }
       else{ 
            String x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 1).toString();
            int alto_1 = Integer.parseInt(x);

            x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 2).toString();
            int largo_1 = Integer.parseInt(x);

            x = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 3).toString();
            int ancho_1 = Integer.parseInt(x);

            int alto_2  = Integer.parseInt(alto);
            int largo_2 = Integer.parseInt(largo);
            int ancho_2 = Integer.parseInt(ancho);

            String matricula_avion = alquilarFinal.getTbl_aviones().getValueAt(alquilarFinal.getTbl_aviones().getSelectedRow(), 0).toString();

            if(alto_1<alto_2 && largo_1<largo_2 && ancho_1<ancho_2){
                if(buscarAvionHangar()){
                 PreparedStatement PS;
                 Connection CN =null;
                 String idavion = alquilarFinal.getTxt_matricula().getText();

                 String sql = "UPDATE hangar SET estado ="+idavion+" WHERE idhangar ="+idhangar;
                 int res =0;
                 try {
                 CN= Conexion.getConnection();
                 PS=CN.prepareStatement(sql);
                 res = PS.executeUpdate();
                 if(res>0){                
                     String estado = idhangar+"";
                     sql = "UPDATE avion SET estado ="+estado+" WHERE idavion ="+matricula_avion;
                     res =0;
                     try{
                         CN= Conexion.getConnection();
                         PS=CN.prepareStatement(sql);
                         res= PS.executeUpdate();
                         if(res>0){
                             JOptionPane.showMessageDialog(null, "SE REGISTRO CORRECTAMENTE");
                             refrescarAviones();
                         }
                     }catch(SQLException e){
                         JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR CON LA BASE DE DATOS!");
                     }
                 }
                 } catch (SQLException e) {
                     JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR CON LA BASE DE DATOS!");
                 }
                 }
                 else{JOptionPane.showMessageDialog(null, "INGRESE UNA MATRICULA EXISTENTE");}
            }
            else {JOptionPane.showMessageDialog(null, "EL AVION ES MUY GRANDE PARA EL HANGAR");}

       
        
       }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR UN AVION! ");}

        
    }
    
    public boolean buscarAvionHangar(){
         boolean band = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT idavion FROM avion WHERE idavion = ?");
            ps.setInt(1, Integer.parseInt(alquilarFinal.getTxt_matricula().getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("idavion");
                band = true;
            }else{}
        } catch (Exception e) {
        }       
                
    return band;
    }

    
}
