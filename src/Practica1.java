

import java.io.*;
import java.util.*;

public class Practica1 {
    public static void main(String[] args) {
        Fichero ficheroAlumnos = new Fichero();
        ArrayList<Alumno> alumnoArrayList = ficheroAlumnos.leerFicheroConTodosAlumnos();
        alumnoArrayList = seleccionarAlumnos(alumnoArrayList);
        alumnoArrayList = notasAlumnos(alumnoArrayList);

    }
    //metodo para generar numero aleatorio
    public static ArrayList<Alumno> seleccionarAlumnos(ArrayList<Alumno> arrAlumno){
        ArrayList<Alumno> alumnosRandom = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAlumno = (int)(Math.random()*79);
            alumnosRandom.add(arrAlumno.get(numeroAlumno));
        }
        return alumnosRandom;
    }

    public static ArrayList<Alumno> notasAlumnos(ArrayList<Alumno> arrayAlumnos) {
        ArrayList<Alumno> arrayNotasAlumno = new ArrayList<Alumno>();
        Double[] cantidadNotas = new Double[4];
        double notaGeneradaRandom = 0;
        double sumaNotas = 0;
        for (int i = 0; i < 10; i++) {
            sumaNotas = 0;
            for (int j = 0; j < cantidadNotas.length; j++) {
                notaGeneradaRandom = (Math.random() * 10);
                cantidadNotas[j] = notaGeneradaRandom;
                sumaNotas += notaGeneradaRandom;
            }
            arrayNotasAlumno.get(i).setNota1(cantidadNotas[0]);
            arrayNotasAlumno.get(i).setNota2(cantidadNotas[1]);
            arrayNotasAlumno.get(i).setNota3(cantidadNotas[2]);
            arrayNotasAlumno.get(i).setNota4(cantidadNotas[3]);
            double media = sumaNotas / 4;
            arrayNotasAlumno.get(i).setMedia(media);
        }

        return arrayNotasAlumno;
    }
}
