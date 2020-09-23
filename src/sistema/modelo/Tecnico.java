/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelo;

/**
 *
 * @author karen
 */
public class Tecnico extends Funcionario {

    private String funcao;

    public Tecnico() {
        super();
    }

    public Tecnico(String funçao, String codigo, String nome, double salario, String nivel) {
        super(codigo, nome, salario, nivel);
        this.funcao = funçao;

    }

    public double calcularSalario() {
        if (nivel.equals(Constantes.T1)) {
            return salario + (0.1 * salario);
        }
        return salario + (0.2 * salario);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "\nTecnico = " + "codigo : " + codigo + ", nome : " + nome + ", salario : " + calcularSalario()
                + ", funcao : " + funcao + ", nivel : " + nivel;
    }

}
