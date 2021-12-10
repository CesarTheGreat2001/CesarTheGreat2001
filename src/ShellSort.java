
import java.util.Scanner;


public class ShellSort {
    
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        
        int Arreglo[] = new int[20];
        
        int numero,i,j,k,incremento,aux;
        System.out.println("Ingrese la dimension del arreglo");
        numero=datos.nextInt();
        
        for(i=1;i<=numero;i++){
            System.out.print("A["+i+"]=");
            Arreglo[i]=datos.nextInt();
        }
        
        incremento = numero/2;
        
        while(incremento>0){
            for(i=incremento+1;i<=numero;i++){
                j = i-incremento;
                while(j>0){
                    if(Arreglo[j]>=Arreglo[j+incremento]){
                        aux=Arreglo[j];
                        Arreglo[j]=Arreglo[j+incremento];
                        Arreglo[j+incremento]=aux;
                    } else {
                        j=0;
                    }
                    j=j-incremento;
                }
            }
            incremento = incremento/2;
        } //while
        System.out.println("El arreglo esta ordenado");
           for(i=1;i<=numero;i++){
               System.out.println(""+Arreglo[i]);
           }
        
    }
}
