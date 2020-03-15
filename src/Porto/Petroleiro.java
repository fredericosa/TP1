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
public class Petroleiro extends Navio {
    private float carga;
    
    public Petroleiro(String matricula){
        super(matricula);
        carga = 0;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    @Override
    public String toString() {
        return super.toString() +  "Petroleiro{" + "carga=" + carga + '}';
    }

    void setMaxContentores(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
