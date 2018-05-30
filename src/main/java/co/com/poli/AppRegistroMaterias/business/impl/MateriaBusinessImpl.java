package co.com.poli.AppRegistroMaterias.business.impl;

import co.com.poli.AppRegistroMaterias.business.IMateriaBusiness;
import co.com.poli.AppRegistroMaterias.dao.IMateriaDao;
import co.com.poli.AppRegistroMaterias.data.MateriaData;
import co.com.poli.AppRegistroMaterias.model.Materia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
@Service
public class MateriaBusinessImpl implements IMateriaBusiness{

    @Autowired
    private IMateriaDao materiaDao;
    
    @Override
    public List<Materia> obtenerMaterias() {
        return materiaDao.obtenerMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        return materiaDao.obtenerMateria(idMateria);
    }

    @Override
    public String crearMateria(Materia materia) {
        String respuesta = "";
        List<Materia> listaMaterias = MateriaData.getListaMaterias();
      
            if (listaMaterias.contains(materia)) {
                respuesta = "Materia ya esta registrada...";
            } else {
                respuesta = materiaDao.crearMateria(materia);
            }
        
        return respuesta;
    }

    @Override
    public String eliminarMateria(String idMateria) {
        String respuesta = "Materia no Existe";
        List<Materia> listaMaterias = MateriaData.getListaMaterias();
        
        if (listaMaterias.contains(materiaDao.obtenerMateria(idMateria))) {
            respuesta = materiaDao.eliminarMateria(idMateria);
        }
        return respuesta;
    }
    
}
