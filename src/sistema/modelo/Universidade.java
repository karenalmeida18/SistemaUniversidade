/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

import sistema.persistencia.DataBase;

/**
 *
 * @author karen
 */
public class Universidade {

    private String nome;
    private static DataBase db;

    public Universidade(String nome) {
        this.nome = nome;
        this.db = DataBase.getInstance();
    }

    public void addDepartamento(String codigo, String nome) {
        Departamento d = new Departamento(codigo, nome);
        db.addDepartamento(d);
    }
       
    public void addTecnico(String funçao, String codigo, String nome, double salario, String nivel, String CodigoDep) {
        Departamento d = db.buscaDepartamento(CodigoDep);
         d.addTecnico(funçao, codigo, nome, salario, nivel);
    }
    
     public void addDocenteSub(String codigo, String nome, double salario, String titulacao, String nivel, int cargaHoraria, String CodigoDep) {
         Departamento d = db.buscaDepartamento(CodigoDep);
         d.addDocenteSub(codigo, nome, salario, titulacao, nivel, cargaHoraria);
    }

    public void addDocenteEfetivo(String codigo, String nome, double salario, String titulacao, String nivel, String area, String CodigoDep) {
        Departamento d = db.buscaDepartamento(CodigoDep);
        d.addDocenteEfetivo(codigo, nome, salario, titulacao, nivel, area);
    }
    public String exibirDepartamento(String codigo) {
        String dados = "";
        Departamento d = db.buscaDepartamento(codigo);
        if (d != null) {
            dados = "Nome: " + d.getNome() + "\n"
                    + "Quantidade de funcionarios : " + d.qdtFuncionario() + "\n"
                    + "Gasto total : " + d.gastoTotal();

        }
        return dados;
    }

    public Departamento buscaDepartamento(String codigo) {
        Departamento d = db.buscaDepartamento(codigo);
        if (d != null) {
            return d;
        }
        return null;
    }

    public String resumoDepartamentos() {
        Departamento vetor[] = db.getDepartamentos();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            dados = dados
                    + "\nNome: " + vetor[i].getNome() + "\n"
                    + "\nQuantidade de funcionarios : " + vetor[i].qdtFuncionario() + "\n"
                    + "\nGasto total : " + vetor[i].gastoTotal();
        }
        return dados;
    }

    public String infoGeral() {
        Departamento vetor[] = db.getDepartamentos();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            dados = dados
                    + "Nome do departamento : " + vetor[i].getNome() + "\n"
                    + "Funcionarios : " + vetor[i].getFuncionarios() + "\n"
                    + "Gasto total : " + db.gastoTotal() +" \n";
        }
        return dados;
    }

    public String departamentosFaixaGasto(double ini, double fin) {
        Departamento vetor[] = db.getDepartamentos();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            double gasto = vetor[i].gastoTotal();
            if (ini <= gasto && gasto <= fin) {
                dados = dados
                        + "Nome: " + vetor[i].getNome() + "\n"
                        + "Quantidade de funcionarios : " + vetor[i].qdtFuncionario() + "\n"
                        + "Gasto total : " + vetor[i].gastoTotal();
            }
        }
        return dados;
    }

    public String funcionariosFaixaSalario(double ini, double fim) {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            double salario = vetor[i].getSalario();
            if (salario >= ini && salario <= fim) {
                dados = dados + vetor[i].toString();
            }
        }
        return dados;
    }

    public String exibirFuncionarioNome(String nome) {
        Funcionario f = db.buscaFuncionarioNome(nome);
        String dados = "";
        if (f != null) {
            dados = f.toString();
        }
        return dados;
    }

    public String exibirFuncionarioCod(String codigo) {
        Funcionario f = db.buscaFuncionarioCodigo(codigo);
        String dados = "";
        if (f != null) {
            dados = f.toString();
        }
        return dados;
    }

    public String getFuncionarios() {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            dados = dados + vetor[i].toString();
        }
        return dados;
    }

    public String getTecnicos() {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] instanceof Tecnico) {
                dados = dados + vetor[i].toString();
            }
        }
        return dados;
    }

    public String getDocentes() {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] instanceof Docente) {
                dados = dados + vetor[i].toString();
            }
        }
        return dados;
    }

    public String getEfetivos() {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] instanceof Efetivo) {
                dados = dados + vetor[i].toString();
            }
        }
        return dados;
    }

    public String getSubstituto() {
        Funcionario vetor[] = db.getFuncionarios();
        String dados = "";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] instanceof Substituto) {
                dados = dados + vetor[i].toString();
            }
        }
        return dados;
    }

    public double gastoTotal() {
        return db.gastoTotal();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
