package co.com.poli.AppRegistroMaterias.dao;

import co.com.poli.AppRegistroMaterias.model.Materia;
import java.util.List;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public interface IMateriaDao {
    List<Materia> obtenerMaterias();
    Materia obtenerMateria(String idMateria);
    String crearMateria(Materia materia);
    String eliminarMateria(String idMateria);
}
