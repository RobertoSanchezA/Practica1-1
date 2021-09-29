import java.io.*;
import java.util.*;

public class Fichero {

    String ficheroAlumnos;
    String ficheroAlumnosRandom;

    public String getFicheroAlumnos() {
        return ficheroAlumnos;
    }

    public void setFicheroAlumnos(String ficheroAlumnos) {
        this.ficheroAlumnos = ficheroAlumnos;
    }

    public String getFicheroAlumnosRandom() {
        return ficheroAlumnosRandom;
    }

    public void setFicheroAlumnosRandom(String ficheroAlumnosRandom) {
        this.ficheroAlumnosRandom = ficheroAlumnosRandom;
    }

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

        for (int i = 0; i < arrAlumno.size(); i++) {
            bf.write(arrAlumno.get(i).getNombre() + ", " +
                        arrAlumno.get(i).getNota1()+ ", " +
                        arrAlumno.get(i).getNota2()+ ", " +
                        arrAlumno.get(i).getNota3()+ ", " +
                        arrAlumno.get(i).getNota4()+ ", " +
                        arrAlumno.get(i).getMedia());
        }

        bf.flush();

        //finally
        bf.close();
    }

}
