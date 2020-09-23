/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.persistencia;

import sistema.modelo.Departamento;
import sistema.modelo.Funcionario;

/**
 *
 * @author karen
 */
public class DataBase {

    public static final int MAX = 10000;
    private Funcionario[] funcionarios;
    private int contFuncionarios;
    private Departamento[] departamentos;
    private int contDepartamentos;
    private static DataBase instance;

    public DataBase() {
        this.funcionarios = new Funcionario[MAX];
        this.contFuncionarios = 0;
        this.departamentos = new Departamento[MAX];
        this.contDepartamentos = 0;
        this.instance = null;
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void addFuncionario(Funcionario F) {
        if (contFuncionarios < MAX) {
            funcionarios[contFuncionarios] = F;
            contFuncionarios++;
        }
    }

    public void addDepartamento(Departamento D) {
        if (contDepartamentos < MAX) {
            departamentos[contDepartamentos] = D;
            contDepartamentos++;
        }
    }

    public Departamento[] getDepartamentos() {
        Departamento vetDepartamentos[] = new Departamento[contDepartamentos];
        for (int i = 0; i < contDepartamentos; i++) {
            vetDepartamentos[i] = departamentos[i].clone();
            System.out.println("teste" + departamentos[i].qdtFuncionario());
        }
        return vetDepartamentos;
    }

    public Funcionario[] getFuncionarios() {
        Funcionario vetFuncionarios[] = new Funcionario[contFuncionarios];
        for (int i = 0; i < contFuncionarios; i++) {
            vetFuncionarios[i] = funcionarios[i].clone();
        }
        return vetFuncionarios;
    }

    public double gastoTotal() {
        double soma = 0;
        for (int i = 0; i < contFuncionarios; i++) {
            soma += funcionarios[i].calcularSalario();
        }
        return soma;
    }

    public int qdtFuncionario() {
        return contFuncionarios;
    }

    public Departamento buscaDepartamento(String codigo) {
        for (int i = 0; i < contDepartamentos; i++) {
            if (departamentos[i].getCodigo().equals(codigo)) {
                return departamentos[i];
            }
        }
        return null;
    }

    public Funcionario buscaFuncionarioCodigo(String codigo) {
        for (int i = 0; i < contFuncionarios; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public Funcionario buscaFuncionarioNome(String nome) {
        for (int i = 0; i < contFuncionarios; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }

}
