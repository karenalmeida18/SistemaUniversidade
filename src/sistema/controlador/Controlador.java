/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.controlador;

import sistema.modelo.Departamento;
import sistema.modelo.Funcionario;
import sistema.modelo.Universidade;

/**
 *
 * @author karen
 */
public class Controlador {

    private Departamento d = new Departamento();
    private Universidade u = new Universidade("UNESP");

    public void addTecnico(String funçao, String codigo, String nome, double salario, String nivel, String CodDep) {
        u.addTecnico(funçao, codigo, nome, salario, nivel, CodDep);
    }

    public void addDocenteSub(String codigo, String nome, double salario, String titulacao, String nivel, int cargaHoraria, String CodDep) {
        u.addDocenteSub(codigo, nome, salario, titulacao, nivel, cargaHoraria, CodDep);
    }

    public void addDocenteEfetivo(String codigo, String nome, double salario, String titulacao, String nivel, String area, String CodDep) {
        u.addDocenteEfetivo(codigo, nome, salario, titulacao, nivel, area, CodDep);
    }

    public void addDepartamento(String codigo, String nome) {
        u.addDepartamento(codigo, nome);
    }

    public String funcionariosFaixaSalario(double ini, double fim) {
        return u.funcionariosFaixaSalario(ini, fim);
    }

    public String getFuncionarios() {
        return u.getFuncionarios();
    }

    public String getTecnicos() {
        return u.getTecnicos();
    }

    public String getDocentes() {
        return u.getDocentes();
    }

    public String getEfetivos() {
        return u.getEfetivos();
    }

    public String getSubstituto() {
        return u.getSubstituto();
    }

    public String buscaFuncionarioCod(String codigo) {
        return u.exibirFuncionarioCod(codigo);
    }

    public String buscaFuncionarioNome(String nome) {
        return u.exibirFuncionarioNome(nome);
    }

    public Funcionario buscaFuncionario(String codigo) {
        return u.buscaFuncionario(codigo);
    }
    public Departamento[] getDepartamentos(){
        return u.getDepartamentos();
    }
    
    public String Departamento(String codigo) {
        return u.exibirDepartamento(codigo);
    }

    public Departamento buscaDepartamentoD(String codigo) {
        return u.buscaDepartamento(codigo);
    }

    public String resumoDepartamentos() {
        return u.resumoDepartamentos();
    }

    public String relatorioGeral() {
        return u.infoGeral();
    }

    public String departamentosFaixaGasto(double ini, double fin) {
        return u.departamentosFaixaGasto(ini, fin);
    }

}
