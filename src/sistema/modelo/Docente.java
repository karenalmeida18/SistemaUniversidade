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
public abstract class Docente extends Funcionario {
    protected String titulacao;
   
    public Docente(){
        super();
    }
    public Docente(String codigo, String nome, double salario,String nivel, String titulacao){
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
   
    @Override
    public String toString() {
        return "\nDocente : " + "codigo = " + codigo + ", nome = " + nome + ", salario = " + salario +
                 "titulação=" + titulacao + "nivel= " +nivel ;
    }
    
}
