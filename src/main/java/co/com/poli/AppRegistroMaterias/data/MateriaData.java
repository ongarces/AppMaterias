package co.com.poli.AppRegistroMaterias.data;

import co.com.poli.AppRegistroMaterias.model.Materia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public class MateriaData {
    private static List<Materia> listaMaterias;
    
    static{
        listaMaterias = new ArrayList<Materia>(){
            {
                add(new Materia("1010", "Matematicas", 4, 5, 15));
                add(new Materia("1020", "Ingles", 2, 5, 15));
                add(new Materia("1030", "Sociales", 3, 4, 15));
                add(new Materia("1040", "Biologia", 3, 5, 15));
            }        
    };
    }

    public static List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public static void setListaMaterias(List<Materia> aListaMaterias) {
        listaMaterias = aListaMaterias;
    }
    
}
