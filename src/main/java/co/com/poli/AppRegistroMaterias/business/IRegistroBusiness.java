package co.com.poli.AppRegistroMaterias.business;

import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public interface IRegistroBusiness {
    List<Registro> obtenerRegistros();
    Registro obtenerRegistro(String idRegistro);
    String crearRegistro(Registro registro);
    String eliminarRegistro(String idRegistro);
    
    String mayorCosto();
}
