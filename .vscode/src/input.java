import java.util.Scanner;

public class input {

    public static void main(String[] args){
          
        char Reproductor;
        int valor;


    Scanner opcion = new Scanner(System.in);
    valor = opcion.nextInt();
    // System.out.println(valor);


    if(valor == 1){
         System.out.println("puto el que lo lea " + valor);
    }

    if(valor == 2){
         System.out.println("puto el que lo lea " + valor);
    }

    if(valor == 3){
         System.out.println("puto el que lo lea " + valor);     
    }

    if(valor == 4){
         System.out.println("Reproducir cancion aleatoria " + valor);
         try {
              Reproductor mi_reproductor = new Reproductor();
              mi_reproductor.AbrirFichero("C:\Users\Dan_G\OneDrive\Documents\GitHub\ProyectoFinal\.vscode\canciones");
              mi_reproductor.Play();
            } catch (Exception ex) {
              System.out.println("Error: " + ex.getMessage());
            }
    
        }
}