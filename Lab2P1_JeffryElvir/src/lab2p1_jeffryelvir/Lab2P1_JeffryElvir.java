/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_jeffryelvir;
import java.util.Scanner;
/**
 *
 * @author jjea6
 */
public class Lab2P1_JeffryElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean seguir=true;
        while (seguir){
            Scanner leer= new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("Ingrese una opcion");
            System.out.println("1.Ejercicio 1");
            System.out.println("2.Ejercicio 2");
            System.out.println("3.Ejercicio 3");
            System.out.println("4.Cerrar programa");
            int opcion=0;
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Programa para saber si un numero es par o impar y si es primo o no");
                    System.out.println("Ingrese su numero");
                    int numero=0;
                    numero=leer.nextInt();
                    while (numero<0){
                        System.out.println("Ingrese un numero positivo porfavor");
                        numero=leer.nextInt();
                       
                    }// while de validacion
                    
                    boolean par=true;
                    
                    boolean primo=true;
                    if (numero%2==0){
                        par=true;
                       
                    
                    }
                    else {
                    par=false;
                        
                        
                    }
                        int contador_ciclo=1;
                        int contador=0; 
                        while (contador_ciclo<=numero){
                        if(numero%contador_ciclo==0){
                        contador=contador+1;
                        }
                        contador_ciclo=contador_ciclo+1;
                        }
                        if (contador==2){
                            primo=true;
                        }
                        else{
                        primo=false;
                        }
                        
                        if (par==true && primo==false ){
                            System.out.println("El numero es par y no es primo ");
                        }
                            
                            if (par==false && primo==false ){
                                System.out.println("El numero es inpar pero no primo");
                            }
                            if (par==false && primo==true ){
                                System.out.println("El numero es inpar y primo ");
                            }
                                
                        
                        
                    break;
                    
                case 2:
                    System.out.println("Ingrese su limite");
                    double limite=0;
                    limite=leer.nextInt();
                    int contador2=0;
                    double pi=0;
                    double respuesta=1;
                    while(limite<=0){
                        System.out.println("Ingrese un numero positivo ");
                        limite=leer.nextInt();
                    }
                    double i=1;
                    while(contador2<=limite){
                    
                    double potencia= Math.pow(i,2);
                        
                    double multiplicacion = 4*potencia;
                      
                    double resta=multiplicacion-1;
                      
                    double fraccion=multiplicacion/resta;
                      
                       pi=fraccion;
                        
                      pi=pi*respuesta;
                       
                       contador2=contador2+1;
                    i=i+1;
                    respuesta=pi;
                     
                    }
                    
                   
                    
                    respuesta=respuesta*2;
                    System.out.println("PI es igual a: "+respuesta);
                    break;
                    
                case 3:
                    int respuesta3=0;
                    
                    System.out.println("Ingrese el primer numero");
                    int numero1=leer.nextInt();
                    while (numero1<0){
                        System.out.println("Ingres un numero positivo");
                        numero1=leer.nextInt();
                    }
                    int numero1original=numero1;
                    System.out.println("Ingrese el segundo numero");
                    int numero2=leer.nextInt();
                    while (numero2<0){
                        System.out.println("Ingres un numero positivo");
                        numero2=leer.nextInt();
                    }
                    int numero2original=numero2;
                    while (numero1 != numero2){
                    if(numero1<numero2){
                    numero2=numero2-numero1;
                    }
                    
                    if(numero2<numero1){
                    numero1=numero1-numero2;
                    }
                    }
                    respuesta3=numero1;
                    System.out.println("El MCD de "+" "+numero1original+" y "+numero2original+"  "+" "+"es:"+" "+respuesta3);
                    break;
                    
                case 4:
                    seguir=false;
                    break;
            
            }//fin del switch
            
                    
                   
        }// Fin del while prin
        System.out.println("Cerrando programa");
    }
    
}
