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
 public class Substituto extends Docente {
    private int cargaHoraria;
  
    public Substituto(){
        super();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
  
    public Substituto(String codigo, String nome, double salario, String titulacao, String nivel, int cargaHoraria){
       super(codigo, nome, salario, nivel, titulacao);
       this.cargaHoraria = cargaHoraria;

    }
     
    @Override
    public double calcularSalario() {
        if(nivel.equals(Constantes.S1)) return salario + (salario * 0.05);
        else return salario + (salario*0.1); 
    }
    
    @Override
    public String toString() {
        return "\nDocente Sub =  " + "codigo : " + codigo + ", nome : " + nome + ", salario : " + calcularSalario() +
                 ", titulacao : " + titulacao + ", nivel: " +nivel+ ", carga horaria :" +cargaHoraria;
    }
    
    
}
