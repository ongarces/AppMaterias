package co.com.poli.AppRegistroMaterias.data;

import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Garces - Yulieth Ramirez
 */
public class RegistroData {
    private static List<Registro> listaRegistros;
    
    static{
        listaRegistros = new ArrayList<Registro>(){
            {
                add(new Registro("9010", "5555", new Materia("1050", "Java", 5, 10, 20), "A", 25000));
            }
        };
    }

    public static List<Registro> getListaRegistros() {
        return listaRegistros;
    }

    public static void setListaRegistros(List<Registro> aListaRegistros) {
        listaRegistros = aListaRegistros;
    }    
    
}
