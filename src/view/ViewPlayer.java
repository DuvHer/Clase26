/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DaoPlayer;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ViewPlayer {
    private DaoPlayer dao;
    
    public ViewPlayer(){
        try{
            this.dao=new DaoPlayer();        
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo");
        }
                
    }
    
    public void menu(){
        String opcion= JOptionPane.showInputDialog(null,"1. Crear\n2. Guardar\n3. Leer" );
        if(opcion.equals("1")){
            String name=JOptionPane.showInputDialog(null, "Name: ");
            String email=JOptionPane.showInputDialog(null, "Email: ");
            Player player=new Player(name, email);
        }else if(opcion.equals("2")){
        
        }else if(opcion.equals("3")){
            
        }else{
        
        }
    }
}

