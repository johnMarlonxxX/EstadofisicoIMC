import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/* Programa para determinar si una persona es delgada, normal o gorda según su Índice de Masa Corporal (IMC) */
public class EstadofisicoIMC {
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);

        float peso,estatura,imc;/*El IMC se calcula dividiendo el peso (en kilogramos) entre el cuadrado de la estatura (en metros) de la persona */
        
        System.out.println("Para poder saber si su condición física es delgada, normal o gorda; se necesita primero determinar su Índice de Masa Corporal. \nIntroduzca su peso en kilogramos:");
        peso = dato.nextFloat();
    
        System.out.println("Introduzca su estatura en metros: \nACLARACIÓN: Para escribir su estatura separe los valores decimales por punto (.) y no por coma(,)");
        estatura = dato.nextFloat();
        
        imc = peso / (estatura * estatura);

        DecimalFormat redondeo = new DecimalFormat("##.#");
        String numeroredondeado = redondeo.format(imc);
        
        if(imc > 18.5 && imc < 24.9) {

            System.out.println("Su índice de masa corporal es: "+numeroredondeado+", usted puede considerarse normal");
        
        }else if(imc < 18.5){
            
            System.out.println("Su índice de masa corporal es: "+numeroredondeado+", usted puede considerarse delgado");
            
        }else {
           
            System.out.println("Su índice de masa corporal es: "+numeroredondeado+", usted puede considerarse gordo");
        }

    }

}




