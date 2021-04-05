/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author johnleles
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        
        //Criação e instância do objeto colaborador
        Funcionario colaborador = new Funcionario();
        
        //Construção do objeto apresentarFuncionario
        colaborador.setMatricula(123456);
        colaborador.setNome("João");
        colaborador.setNivel('P');
        colaborador.setSalario(5.000);
        
        //Imprimindo os dados do objeto apresentarFuncionario
        System.out.println("\n\t\t\t --- Funcionário 1 ---");
        colaborador.apresentarFuncionario();
        
        //Cálculo salário com desconto dos impostos
        colaborador.calcularSalario();
        
        //Imprimindo salário com desconto
        System.out.printf("Salário líquido: %.3f\n", colaborador.getSalario());
        
        //Criação e instância do objeto colaboradorVendedor
        Vendedor colaboradorVendedor = new Vendedor();
        
        //Construção do objeto colaboradorVendedor
        colaboradorVendedor.setMatricula(654321);
        colaboradorVendedor.setNome("Maria");
        colaboradorVendedor.setNivel('P');
        colaboradorVendedor.setSalario(5000);
        colaboradorVendedor.setComissao(600);
        
        //Imprimindo Vendedor
        System.out.println("\n\t\t\t -- Vendedor 1 -- ");
        colaboradorVendedor.comissao();
        
    }
    
    
}
