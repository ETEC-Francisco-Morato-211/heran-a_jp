/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author jwict
 */
public class Vendedor extends Funcionario{
    //Atributos
    private double comissao;
   
    //Métodos
    public void comissao(){
        System.out.println("Comissão: " + getComissao());
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void Vendedor() {
        this.setComissao(600);
        
    }

    @Override
    public void apresentarFuncionario() {
        super.apresentarFuncionario(); //To change body of generated methods, choose Tools | Templates.
        this.comissao();
    }

    
    
}
