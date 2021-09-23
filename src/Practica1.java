import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.*;
public class Practica1 {
    public static void main(String[] args) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String alumnosSeleccionados [];
        try{
            archivo = new File("D:\\2º DAM\\P. multimedia y dispositivos moviles\\Listado.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null)
                System.out.println(linea);

        } catch (Exception error){
            error.printStackTrace();
        }
    }
}
