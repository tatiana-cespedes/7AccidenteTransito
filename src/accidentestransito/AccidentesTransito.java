
package accidentestransito;

import java.util.Scanner;


public class AccidentesTransito {
    //private Scanner leer;
   // personas infractor[] = new personas[20];
    static int opc=0, total=0,contnac=0, contsex=0, contregis=0, porcme25, porcfem, porcmed;
    
    public static void Porcentajes(personas infractor[]){
      //infractor[total]=new personas();  
      if(infractor[total].getNacimiento() >= 1991){
          contnac++;
      } 
      if(infractor[total].getSexo()==1){
          contsex++;
      }  
      if(infractor[total].getRegistro()==1){
          contregis++;
      }
      total++;
      porcme25=(contnac/total)*100;
      porcfem=(contsex/total)*100;
      porcmed=(contregis/total)*100;
    }
    
    public static void editar(personas infractor[]){
        //infractor[total]=new personas();
        System.out.println("editar");
        infractor[total].SetConductores();
        
        
    }
    
    public static void MostrarPorcentajes(){
        System.out.println("Porcentajes menores de 25 años :  "+ porcme25); 
        System.out.println("Porcentajes mujeres            :  "+ porcfem);
        System.out.println("Porcentajes medellín           :  "+ porcmed);
    }
  
    public static void menu(){
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese 1 para agregar un infractor, 2 para ver porcentajes y 0 para salir");
        opc= leer.nextInt();
    }
          
    public static void main(String[] args) {
        personas infractor[] = new personas[20];
        
        do{            
        menu();    
            switch(opc){
                case 1:
                    infractor[total]=new personas();
                    editar(infractor);
                    Porcentajes(infractor);
                    break;
                case 2:
                    MostrarPorcentajes();
                    break;
                default:
                    opc=0;
                    break;
            }
  
        
        }while(opc!=0);
    }
    
}
