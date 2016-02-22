
package accidentestransito;

import java.util.Scanner;

public class personas {
    private Scanner lee;
    int nacimiento=0, sexo=0, registro=0;
    
    public void SetConductores(){
      lee = new Scanner(System.in); 
      System.out.println("Año de nacimiento");
      nacimiento=lee.nextInt();
      System.out.println("Sexo: F(1)  M(2)");
      sexo=lee.nextInt();
      System.out.println("Registro Medellin(1)  otras ciudades (2)");
      registro=lee.nextInt();
   }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

 
}
