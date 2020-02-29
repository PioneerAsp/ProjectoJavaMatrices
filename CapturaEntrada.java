/*
López Valencia Luis Angel 1262057
grupo: 541  Programación Orientada a Objetos
*/

import java.util.*;
import java.util.Scanner;

public class CapturaEntrada {
    
    public static int capturaEntero(String msg){		//Captura las dimenciones de las matrices
       Scanner sc = new Scanner(System.in);
       System.out.println(""+msg+": ");
       return(sc.nextInt());
    }
    
   
    public static float capturaFlotante(String msg){	//De momento no se utiliza
        Scanner sc = new Scanner(System.in);
        System.out.println(""+ msg + ": ");
        return(sc.nextFloat());
    }
   
}//Fin de la clase captura