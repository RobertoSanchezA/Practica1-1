import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.*;
import java.util.ArrayList;

public class Practica1 {
    public static void main(String[] args) {
        //leer el archivo con los registros
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        // genero dos arrayLists, uno con todos los alumnos
        // y uno donde guardo los seleccionados
        ArrayList<String> arrayAlumnos = new ArrayList<String>();
        ArrayList<String> alumnosRandom = new ArrayList<String>();
        ArrayList<Double> notasRandom = new ArrayList<Double>();
        try {
            archivo = new File("D:\\2º DAM\\P. multimedia y dispositivos moviles\\Listado.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // guardo en el arrayList todos los alumnos
            String linea;
            while ((linea = br.readLine()) != null) {
                arrayAlumnos.add(linea);
            }

            //Guardar los 10 alumnos seleccionados en el arrayList alumnosRandom
            int posicionAlumno;
            for (int i = 0; i < 10; i++) {
                posicionAlumno = (int) (Math.random() * 79);
                alumnosRandom.add(arrayAlumnos.get(posicionAlumno));
                System.out.println(alumnosRandom.get(i));
            }

            //Generar notas aleatorias
            for (int i = 0; i < 10; i++) {
                Double nota = (Math.random() * 10);
                notasRandom.add(nota);
                System.out.println(notasRandom.get(i));
            }
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
