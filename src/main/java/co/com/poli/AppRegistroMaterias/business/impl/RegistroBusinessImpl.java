package co.com.poli.AppRegistroMaterias.business.impl;

import co.com.poli.AppRegistroMaterias.business.IRegistroBusiness;
import co.com.poli.AppRegistroMaterias.dao.IMateriaDao;
import co.com.poli.AppRegistroMaterias.dao.IRegistroDao;
import co.com.poli.AppRegistroMaterias.data.MateriaData;
import co.com.poli.AppRegistroMaterias.data.RegistroData;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
@Service
public class RegistroBusinessImpl implements IRegistroBusiness {

    @Autowired
    private IRegistroDao registroDao;
    @Autowired
    private IMateriaDao materiaDao;

    @Override
    public List<Registro> obtenerRegistros() {
        return registroDao.obtenerRegistros();
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        return registroDao.obtenerRegistro(idRegistro);
    }

    @Override
    public String crearRegistro(Registro registro) {
        String respuesta = "";
        double contadorRegistros = 0, cupoMax =0;

        List<Materia> listaMaterias = MateriaData.getListaMaterias();

        List<Registro> listaRegistros = RegistroData.getListaRegistros();
        
        if (listaMaterias.contains(registro.getMateria().getIdMateria())) {
            cupoMax = materiaDao.obtenerMateria(registro.getMateria().getIdMateria()).getCupoMax();
        }
        
        for (Registro reg : listaRegistros) {
            if (reg.getMateria().getIdMateria().equals(registro.getMateria().getIdMateria())) {
                contadorRegistros++;
            }
        }        
        
        if (listaRegistros.contains(registro.getDocumento()) && listaRegistros.contains(registro.getMateria().getIdMateria())) {
            respuesta = "Ya esta registrado en la materia, no puede registrar";
        }else if (contadorRegistros >= cupoMax) {
            respuesta = "Cupo maximo alcanzado, no puede registrar";
        }else if (listaRegistros.contains(registro)) {
            respuesta = "Registro ya esta registrado...";
        }else {
            respuesta = registroDao.crearRegistro(registro);
        }
        return respuesta;
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        String respuesta = "Materia no Existe";
        List<Registro> listaRegistros = RegistroData.getListaRegistros();

        if (listaRegistros.contains(registroDao.obtenerRegistro(idRegistro))) {
            respuesta = registroDao.eliminarRegistro(idRegistro);
        }
        return respuesta;
    }

    @Override
    public String mayorCosto() {
        return "";
    }

}
