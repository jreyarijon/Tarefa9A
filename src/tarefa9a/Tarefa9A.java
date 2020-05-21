/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9a;

import javax.swing.JOptionPane;

/**
 *
 * @author Josemolamazo
 */
public class Tarefa9A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
  
        int opcion = 0;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***MENU*** \n"
                    + "1. Engadir \n"
                    + "2. Ler lista \n"
                    + "3. Buscar \n"
                    + "4. Borrar \n"
                    + "5. Borrar ficheiro \n"
                    + "6. Sair"));
            switch (opcion) {
                case 1:
                    m.engadirCliente("ListaClientes.txt");
                    break;
                case 2:
                    m.lerListaClientes("ListaClientes.txt");
                    break;
                case 3:
                    m.buscarCliente("ListaClientes.txt");
                    break;
                case 4:
                    m.borrarCliente("ListaClientes.txt");
                    break;
                case 5:
                    
                    break;
                case 6: 
                    m.sair();
            }
        }
    }

}
