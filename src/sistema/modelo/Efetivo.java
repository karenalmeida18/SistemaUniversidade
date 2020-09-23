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
public class Efetivo extends Docente {

    private String area;

    public Efetivo() {
        super();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Efetivo(String codigo, String nome, double salario, String titulacao, String nivel, String area) {
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        if (nivel.equals(Constantes.D1)) {
            return salario + (salario * 0.05);
        } else if (nivel.equals(Constantes.D2)) {
            return salario + (salario * 0.1);
        }
        return salario + (salario * 0.2);
    }

    @Override
    public String toString() {
        return "\nDocente Efeitvo = " + "codigo: " + codigo + ", nome: " + nome + ", salario : " + calcularSalario()
                + ", titulacao : " + titulacao + ", nivel :  " + nivel +  ", area : " +area;
    }

}
