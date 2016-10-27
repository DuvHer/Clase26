
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import vo.Player;

/**
 *
 * @author Estudiante
 */
public class DaoPlayer {
    //referencia a la fuente de datos
    private File player;
    ArrayList<Player> resultado=new ArrayList();
    public DaoPlayer() throws IOException{
        this.player=new File("player.txt");
        if(!this.player.exists()){
            this.player.createNewFile();
        }
    }
    
    public boolean write(ArrayList<Player> players) throws FileNotFoundException{
        PrintStream salida=new PrintStream(this.player);
        for(Player p: players){
            salida.print(p.getName()+" "+p.getEmail());
        }
        salida.close();
        return true;
    }
    
    public ArrayList<Player> read() throws FileNotFoundException{
        Scanner lectura =new Scanner(this.player);
        while(lectura.hasNext()){
            String name=lectura.next();
            String email=lectura.next();
            Player p= new Player(name, email);
            resultado.add(p);
        }
    lectura.close();
    return resultado;
    }
}
