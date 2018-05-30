package co.com.poli.AppRegistroMaterias.model;

import java.util.Objects;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public class Registro {
    private String idRegistro;
    private String documento;
    private Materia materia;
    private String categoria;
    private double precio;

    public Registro() {
    }

    public Registro(String idRegistro, String documento, Materia materia, String categoria) {
        this.idRegistro = idRegistro;
        this.documento = documento;
        this.materia = materia;
        this.categoria = categoria;
    }

    public Registro(String idRegistro, String documento, Materia materia, String categoria, double precio) {
        this.idRegistro = idRegistro;
        this.documento = documento;
        this.materia = materia;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.idRegistro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        if (!Objects.equals(this.idRegistro, other.idRegistro)) {
            return false;
        }
        return true;
    }
    
    
}
