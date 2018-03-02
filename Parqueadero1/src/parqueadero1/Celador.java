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
public class Celador {
    String saludar(boolean gafas, char genero, int ebrio){
        if(ebrio>0 ){
            if(genero !='H')
                return saludar(ebrio) + saludar(genero)+saludar(gafas);
            else
                return saludar(ebrio)+saludar(gafas);
        }else {
            if (genero =='H'){
                if(gafas == true){
                    return saludar(ebrio) + saludar(genero) + saludar(gafas);
                }else{
                    return saludar(ebrio) + saludar(genero)+ saludar(gafas);
                }
            }else{
                if(gafas == true){
                    return saludar(ebrio) + saludar(genero) + saludar(gafas);
                }else{
                    return saludar(ebrio) + saludar(genero) + saludar(gafas);
                }
            }
        }
    }
    
    String saludar(int ebrio){
        if(ebrio>0)
            return "  Fuera de aqui";
        else
            return " ";
    }
    
    String saludar(char genero){
        if(genero =='H')
            return " Hola doctor";
        else
            return " y le hago de todo cosita rica";
    }
    
    String saludar(boolean gafas){
        if(gafas==true)
            return " y recuerde las gafas eminencia";
        else
            return " asshh y no trajo gafas no ";
    }
    
    
    
}

    
   


    

