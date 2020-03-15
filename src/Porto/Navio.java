/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Porto;

/**
 *
 * @author fredericos
 */
public class Navio {
    
    private String nome;
    private String matricula;
    private float comprimento;
    
    public Navio(String matricula) {
        this.matricula = matricula;
        nome = ""; comprimento = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getMatricula() {
        return matricula;
    }
    
    @Override
    public String toString() {
        return "Navio{" + "matricula=" + matricula + ", nome=" + nome + ", comprimento=" + comprimento + '}';
    }
    
    
}
