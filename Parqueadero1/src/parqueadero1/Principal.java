/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero1;

/**
 *
 * @author DELL
 */
public class Principal {
    public static void main (String[]args){
  
        Propietario fabian = new Propietario();
        Propietario carlos = new Propietario();
        Propietario diana = new Propietario();
        Propietario laura= new Propietario();
        
        fabian.metEbrio(0);
        fabian.metGafas(true);
        fabian.metGenero('H');
        
        carlos.metEbrio(9);
        carlos.metGafas(false);
        carlos.metGenero('H');
        
        diana.metEbrio(0);
        diana.metGafas(false);
        diana.metGenero('M');
        
        laura.metEbrio(1);
        laura.metGafas(true);
        laura.metGenero('M');
                

       Celador cela = new Celador();
        System.out.println("Don Donald habrame la puerta por favor");
        System.out.println(cela.saludar(fabian.funGafas(),fabian.funGenero(),fabian.funEbrio()));
        System.out.println("Don Donald habrame la puerta por favor");
        System.out.println(cela.saludar(carlos.funGafas(),carlos.funGenero(),carlos.funEbrio()));
        System.out.println("Don Donald habrame la puerta por favor");
        System.out.println(cela.saludar(diana.funGafas(),diana.funGenero(),diana.funEbrio()));
        System.out.println("Don Donald habrame la puerta por favor");
        System.out.println(cela.saludar(laura.funGafas(),laura.funGenero(),laura.funEbrio()));
        
        
        
    }
    
    
        
        
    }
        
    
    

