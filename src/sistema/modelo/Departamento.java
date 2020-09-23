/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.persistencia.DataBase;
import static sistema.persistencia.DataBase.MAX;

/**
 *
 * @author karen
 */
public class Departamento implements Cloneable {

    private String codigo;
    private String nome;
    private static DataBase db;
    private Funcionario funcionarios[];
    private int cont;
            

    public Departamento() {
        this.db = DataBase.getInstance();
        funcionarios = new Funcionario[MAX];
        cont = 0;
    }

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.db = DataBase.getInstance();
        cont = 0;
        funcionarios = new Funcionario[MAX];

    }

    public void addTecnico(String funçao, String codigo, String nome, double salario, String nivel) {
        Tecnico t = new Tecnico(funçao,codigo, nome, salario, nivel);
        db.addFuncionario(t);
        funcionarios[cont] = t;
        cont++;
    }

    public void addDocenteSub(String codigo, String nome, double salario, String titulacao, String nivel, int cargaHoraria) {
        Substituto s = new Substituto(codigo, nome, salario, titulacao, nivel, cargaHoraria);
        db.addFuncionario(s);
        funcionarios[cont] = s;
        cont++;
    }

    public void addDocenteEfetivo(String codigo, String nome, double salario, String titulacao, String nivel, String area) {
        Efetivo e = new Efetivo(codigo, nome, salario, titulacao, nivel, area);
        db.addFuncionario(e);
        funcionarios[cont] = e;
        cont++;
  
    }

    public int qdtFuncionario() {
        System.out.println(cont);
        return cont;
    }
    
    public Funcionario buscaFuncionario(String codigo){
        Funcionario f = db.buscaFuncionarioCodigo(codigo);
        if(f != null) return f;
        return null;
    }
    public String exibirFuncionarioCod(String codigo) {
        Funcionario f = db.buscaFuncionarioCodigo(codigo);
        String dados = "";
        if (f != null) {
            dados = f.toString();
        }
        return dados;
    }

     public double gastoTotal() {
        double soma = 0;
        for (int i = 0; i < cont; i++) {
            soma += funcionarios[i].calcularSalario();
        }
        return soma;
    }

    public String getFuncionarios() {
        String dados = "";
        for(int i=0; i<cont; i++){
            dados += funcionarios[i].toString();
        }
        return dados;
    }

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

    @Override
    public Departamento clone() {
        try {
            return (Departamento) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
