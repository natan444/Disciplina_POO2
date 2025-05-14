/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aluno
 */
public class Cliente {
    public static void main(String[] args) throws Exception{
        String ip= "10.105.15.245";
        int porta= 12345;
        InetAddress endereco= InetAddress.getByName(ip);
        
       Socket conexao= new Socket(endereco,porta);
        
        System.out.println("Conexão realizada " + conexao);
        
        ObjectOutputStream output;
        output= new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        
        ObjectInputStream input;
        input= new ObjectInputStream(conexao.getInputStream());
        
        output.close();
        input.close();
        conexao.close();
        
 
    }
}
