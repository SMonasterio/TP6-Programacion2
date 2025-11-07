/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CP3;

/**
 *
 * @author sofim
 */
import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
            System.out.println("Profesor " + p.getNombre() + " asignado al curso " + c.getNombre());
        } else {
            System.out.println("No se encontró el curso o profesor indicado.");
        }
    }

    public void listarProfesores() {
        System.out.println("\n--- PROFESORES EN LA UNIVERSIDAD ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }
    }

    public void listarCursos() {
        System.out.println("\n--- CURSOS EN LA UNIVERSIDAD ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c);
            }
            cursos.remove(c);
            System.out.println("Curso eliminado: " + c.getNombre());
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor eliminado: " + p.getNombre());
        }
    }

    public void reporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: CANTIDAD DE CURSOS POR PROFESOR ---");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }
}
