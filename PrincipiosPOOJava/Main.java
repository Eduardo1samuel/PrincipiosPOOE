package TareasEntregables_PrincipiosDePoo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Pablo", "Hérnandez", new Date(), Estudiante.Estado.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2, "David", "Monrroy", new Date(), Estudiante.Estado.INACTIVO);

        Curso curso1 = new Curso(1, "Matematicas", "Programación Matemática", 3, "1,0");
        Curso curso2 = new Curso(2, "Ingenieria", "Cursos 3D", 2, "1,1");
        GestorAcademico gestor = new GestorAcademico();

        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
        } catch (EstudianteInscritoException e) {
            System.out.println(e.getMessage());
        }
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteNoInscritoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Estudiantes matriculados:"+"\n");
        for (Estudiante est : gestor.getEstudiantes()) {
            System.out.println(est);
        }
        System.out.println("Cursos disponibles:"+"\n");
        for (Curso cur : gestor.getCursos()) {
            System.out.println(cur);
        }
    }
}


