package co.com.poli.AppRegistroMaterias.dao;

import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public interface IRegistroDao {
    
    List<Registro> obtenerRegistros();
    Registro obtenerRegistro(String idRegistro);
    String crearRegistro(Registro registro);
    String eliminarRegistro(String idRegistro);
}
