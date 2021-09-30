import java.io.*;
import java.util.*;

public class Fichero {

    public  ArrayList<Alumno> leerFicheroConTodosAlumnos(){
        ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>();
        File fichero = new File("..\\Listado.csv");
        String nombreAlumno;
        try{
            BufferedReader bReader = new BufferedReader(new FileReader(fichero));
            //leo la primera linea para saltar la cabecera
            bReader.readLine();
            //agrego todos los alumnos del CSV a un arrayList
            while ((nombreAlumno = bReader.readLine()) != null) {
                //por cada una de las lineas creo al alumno y lo agrego al arraylist
                Alumno alumno = new Alumno();
                alumno.setNombre(nombreAlumno);
                arrayAlumnos.add(alumno);
            }
        } catch (IOException error){
            error.printStackTrace();
        }
        return arrayAlumnos;
    }

    public void crearFicheroSalida(ArrayList<Alumno> arrAlumno) throws IOException {
        File ficheroSalida = new File("..\\prueba.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(ficheroSalida));
        String cabecera = "Nombre   Nota1   Nota2   Nota3   Nota4 \n";
        bf.write(cabecera);
        System.out.print(cabecera);
        for (Alumno alumno : arrAlumno) {
            bf.write(alumno.getNombre() + ", \t " +
                    String.format("%.2f", alumno.getNota1()) + ", \t " +
                    String.format("%.2f", alumno.getNota2()) + ", \t " +
                    String.format("%.2f", alumno.getNota3()) + ", \t " +
                    String.format("%.2f", alumno.getNota4()) + " \t  media -> " + String.format("%.2f", alumno.getMedia()) + "\n" +
                    "---------------------- \n"
            );

            System.out.print(
                    alumno.getNombre() + ", \t" +
                    String.format("%.2f", alumno.getNota1()) + ", \t" +
                    String.format("%.2f", alumno.getNota2()) + ", \t" +
                    String.format("%.2f", alumno.getNota3()) + ", \t" +
                    String.format("%.2f", alumno.getNota4()) + " \t media -> " + String.format("%.2f", alumno.getMedia()) + "\n" +
                    "---------------------- \n"
            );
        }

        bf.flush();

        //finally
        bf.close();
    }

}
