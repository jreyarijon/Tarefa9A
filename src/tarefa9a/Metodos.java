/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9a;

import java.io.*;
import librerias.Datos;

/**
 *
 * @author Josemolamazo
 */
public class Metodos {

    Cliente[] lista = new Cliente[3];
    

    public void engadirCliente(String ficheiro) {
        MeuFicheiro esc = null;

        try {
            esc = new MeuFicheiro(new FileOutputStream(ficheiro, true));

            for (int i = 0; i < lista.length; i++) {
                Cliente c = new Cliente(Datos.pedirString("DNI: "), Datos.pedirString("Nome: "),
                        Datos.pedirString("Telefono: "), Datos.pedirString("Direcion: "),
                        Datos.pedirFloat("Debeda: "));
                lista[i] = c;
            }
            esc.writeObject(lista);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (esc != null) {
                try {
                    esc.close();
                } catch (IOException e) {
                    System.out.println("ERROR escritura" + e.getMessage());
                }
            }
        }

    }

    public void lerListaClientes(String ficheiro) {
        ObjectInputStream ler = null;

        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
            Cliente[] aux = (Cliente[]) ler.readObject();
            for (Cliente c : aux) {
                System.out.println(c);
            }
        } catch (Exception ex) {
            System.out.println("ERROR lectura" + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("ERROR cierre" + ex.getMessage());
                }
            }
        }
    }

    public void buscarCliente(String ficheiro) {
        String busca = Datos.pedirString("DNI do cliente que quere buscar: ");
        ObjectInputStream ler = null;

        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
            Cliente[] aux = (Cliente[]) ler.readObject();
            for (int i = 0; i < aux.length; i++) {
                if (busca.equals(aux[i].getDni())) {
                    System.out.println("EXISTE*** " + aux[i]);
                } else if (i == aux.length) {
                    System.out.println("Non existe no ficheiro");
                }
            }

        } catch (Exception ex) {
            System.out.println("ERROR lectura" + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("ERROR cierre" + ex.getMessage());
                }
            }
        }

    }

    public void borrarCliente(String ficheiro) {
        String busca = Datos.pedirString("DNI do cliente que quere eliminar: ");
        ObjectInputStream ler = null;
        ObjectOutputStream esc = null;
        
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
            

            Cliente[] aux = (Cliente[]) ler.readObject();
            for (Cliente c : aux) {
                if(busca.equals(c.getDni())){ 
                    c = null;
                    System.out.println("ELIMINADO***");
                }
                
                System.out.println(c);
            }
            esc = new ObjectOutputStream(new FileOutputStream(ficheiro));
            esc.writeObject(aux);
        } catch (Exception ex) {
            System.out.println("ERROR lectura" + ex.getMessage());
        } finally {
            if (ler != null) {
                try {
                    ler.close();
                } catch (IOException ex) {
                    System.out.println("ERROR cierre" + ex.getMessage());
                }
            }
        }

    }
    
    public void borrarFicheiro(String ficheiro){
         
    }
    
    public void sair(){
        System.exit(0);
    }
}
