package TareasEntregables_PrincipiosDePoo;

public class Curso {
    private int id;
    private String Nombre;
    private String Descripcion;
    private int NumeroCreditos;
    private String Version;

    public Curso(int id, String nombre, String descripcion, int numeroCreditos, String version) {
        this.id = id;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.NumeroCreditos = numeroCreditos;
        this.Version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getNumeroCreditos() {
        return NumeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.NumeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        this.Version = version;
    }

    public void actualizarDescripcion(String nuevaDescripcion) {
        this.Descripcion = nuevaDescripcion;
    }

    public void actualizarNumeroCreditos(int nuevosCreditos) {
        this.NumeroCreditos = nuevosCreditos;
    }

    @Override
    public String toString() {
        return "cursos"+"\n"+
                "nombre: "+Nombre + "* descripcion: " + Descripcion + "* numero de creditos: " + NumeroCreditos + "* versión:"+Version;
    }
}

