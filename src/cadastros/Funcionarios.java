/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

/**
 *
 * @author z
 */
public class Funcionarios {
    private String codInterno;
    private String nome;
    private String contato1;
    private String contato2;
    private boolean isFerias;
    private String obs;

    public Funcionarios(String codInterno, String nome, String contato1, String contato2, boolean isFerias, String obs) {
        this.codInterno = codInterno;
        this.nome = nome;
        this.contato1 = contato1;
        this.contato2 = contato2;
        this.isFerias = isFerias;
        this.obs = obs;
    }

    public Funcionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public String getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(String codInterno) {
        this.codInterno = codInterno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato1() {
        return contato1;
    }

    public void setContato1(String contato1) {
        this.contato1 = contato1;
    }

    public String getContato2() {
        return contato2;
    }

    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }

    public boolean isIsFerias() {
        return isFerias;
    }

    public void setIsFerias(boolean isFerias) {
        this.isFerias = isFerias;
    }
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setVisible(boolean True) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
