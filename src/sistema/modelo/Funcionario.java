/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karen
 */
public abstract class Funcionario implements Cloneable {

    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    protected String codigoDep;

    public Funcionario() {
    }

    public Funcionario(String codigo, String nome, double salario, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public abstract double calcularSalario();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return calcularSalario();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public Funcionario clone() {
        try {
            return (Funcionario) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
