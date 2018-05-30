package co.com.poli.AppRegistroMaterias.dao.impl;

import co.com.poli.AppRegistroMaterias.dao.IMateriaDao;
import co.com.poli.AppRegistroMaterias.data.MateriaData;
import co.com.poli.AppRegistroMaterias.model.Materia;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
@Repository
public class MateriaDaoImpl implements IMateriaDao{

    @Override
    public List<Materia> obtenerMaterias() {        
        return MateriaData.getListaMaterias();
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        Materia materia = null;
        List<Materia> listaMaterias = MateriaData.getListaMaterias();
        for (Materia m : listaMaterias) {
            if (m.getIdMateria().equals(idMateria)) {
                materia = m;
            }
        }
        return materia;
    }

    @Override
    public String crearMateria(Materia materia) {
        List<Materia> listaMaterias = MateriaData.getListaMaterias();
        listaMaterias.add(materia);
        MateriaData.setListaMaterias(listaMaterias);
        return"Materia creada...";
    }

    @Override
    public String eliminarMateria(String idMateria) {
        List<Materia> listaMaterias = MateriaData.getListaMaterias();
        listaMaterias.remove(obtenerMateria(idMateria));
        MateriaData.setListaMaterias(listaMaterias);
        return "Materia eliminada..";
    }
    
}
