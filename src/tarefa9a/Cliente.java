/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa9a;

import java.io.Serializable;

/**
 *
 * @author Josemolamazo
 */
public class Cliente implements Serializable{

    private String dni;
    private String nome;
    private String tlf;
    private String direcion;
    private double debeda;

    public Cliente() {
    }

    public Cliente(String dni, String nome, String tlf, String direcion, double debeda) {
        this.dni = dni;
        this.nome = nome;
        this.tlf = tlf;
        this.direcion = direcion;
        this.debeda = debeda;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public double getDebeda() {
        return debeda;
    }

    public void setDebeda(double debeda) {
        this.debeda = debeda;
    }

    @Override
    public String toString() {
        return "dni = " + dni + ", nome = " + nome + ", tlf = " + tlf + ", direcion = " + direcion + ", debeda = " + debeda;
    }

}
