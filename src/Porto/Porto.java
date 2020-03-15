/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Porto;

import java.util.*;

/**
 *
 * @author fredericos
 */
public class Porto {
    private List<Navio> navios;
    
    public Porto(){
        navios = new ArrayList<>();
    }
    
    private boolean procura(Navio nv){
        for(Navio n:navios){
          if(n.getMatricula().equals(nv)) return true;
        } return false;
    }
 
    public void addNavio(Navio n){
        if(!procura(n))
           navios.add(n);
        }
    
    public int getMaxContentores(){
        int ct = 0;
        for(Navio n: navios)
        if(n instanceof PortaContentores)
        ct += ((PortaContentores) n).getMaxContentores();
        
            return ct;
    }
    
    public float getTotalCarga(){
        float ct = 0;
        for(Navio n:navios){
            if(n instanceof PortaContentores)
            ct += ((PortaContentores) n).getMaxContentores() + 10f;
            if(n instanceof Petroleiro)
            ct += ((Petroleiro) n).getCarga();
        }
        return ct;
    }
    
    public void listNavios(){
        for(Navio n:navios)
            System.out.println(n);
    }

public static void main(String[] args) {
      Porto p = new Porto();
      Navio n = new Navio("1");
      Petroleiro pt = new Petroleiro("2");
      PortaContentores pc = new PortaContentores("3");
      
      n.setNome("NV1");
      pt.setNome("PT1"); pt.setCarga(200);
      pc.setNome("PC1"); pc.setMaxContentores(100);
      n.setComprimento(10);
      pt.setComprimento(10);
      pc.setComprimento(10);
      
    p.addNavio(n);
    p.addNavio(pt);
    p.addNavio(pc);
    
    p.listNavios();
    System.out.printf("Total de carga = %.1f \n" , p.getTotalCarga());
    
    }
}


    

