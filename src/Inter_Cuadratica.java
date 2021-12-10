
import java.util.Scanner;



/**
Metodo de intercalacion cuadratica
* Consiste en realizar sucedidas particiones y fusiones a un arreglo para producir
* secuencias ordenadas de longitud cada vez mayor, para decir que en la primera 
* pasada la longitud de la particion
 */
public class Inter_Cuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Igresa coeficiente cuadratico");
        int a=sc.nextInt();
        
        System.out.println("Ingrese coeficiente lineal");
        int b=sc.nextInt();
        
        System.out.println("Ingresa constante");
        int c=sc.nextInt();
        
        double disc=Math.pow(b,2)-4*a*c;
        
        if(a!=0){
            
            if(disc<0){
                System.out.println("Tiene raices imaginarias");
            }else{
                double x1=(+b+Math.sqrt(disc)/(2*a));
                double x2=(-b+Math.sqrt(disc)/(2*a));
                System.out.println("X1 = "+x1+" X2 = "+x2);
            }
        }else{
            System.out.println("El coeficiente cuadratico debe");
        }
        
    }
    
}
