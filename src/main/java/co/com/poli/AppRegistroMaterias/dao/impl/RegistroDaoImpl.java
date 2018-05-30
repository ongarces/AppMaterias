package co.com.poli.AppRegistroMaterias.dao.impl;

import co.com.poli.AppRegistroMaterias.data.RegistroData;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;
import org.springframework.stereotype.Repository;
import co.com.poli.AppRegistroMaterias.dao.IRegistroDao;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
@Repository
public class RegistroDaoImpl implements IRegistroDao{

    @Override
    public List<Registro> obtenerRegistros() {
        return RegistroData.getListaRegistros();
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        Registro registro = null;
        List<Registro> listaMaterias = RegistroData.getListaRegistros();
        for (Registro r : listaMaterias) {
            if (r.getIdRegistro().equals(idRegistro)) {
                registro = r;
            }
        }
        return registro;
    }

    @Override
    public String crearRegistro(Registro registro) {
        List<Registro> listaRegistros = RegistroData.getListaRegistros();
        listaRegistros.add(registro);
        RegistroData.setListaRegistros(listaRegistros);
        return"Registro creado...";
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        List<Registro> listaRegistros = RegistroData.getListaRegistros();
        listaRegistros.remove(obtenerRegistro(idRegistro));
        RegistroData.setListaRegistros(listaRegistros);
        return "Registro eliminado..";
    }
    
}
