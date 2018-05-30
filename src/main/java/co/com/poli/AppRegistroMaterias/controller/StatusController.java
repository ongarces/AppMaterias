package co.com.poli.AppRegistroMaterias.controller;

import co.com.poli.AppRegistroMaterias.business.IMateriaBusiness;
import co.com.poli.AppRegistroMaterias.business.IRegistroBusiness;
import co.com.poli.AppRegistroMaterias.model.Materia;
import co.com.poli.AppRegistroMaterias.model.Registro;
import co.com.poli.AppRegistroMaterias.path.Path.PathMateria;
import co.com.poli.AppRegistroMaterias.path.Path.PathRegistro;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cgaop
 */

@RestController
@RequestMapping(value = "/" )
public class StatusController {
    
    @Autowired
    private IMateriaBusiness mBusiness;
    @Autowired
    private IRegistroBusiness rBusiness;
    
    @GetMapping(PathMateria.MATERIA)
    public List<Materia> obtenerMaterias(HttpServletResponse hsr){
        return mBusiness.obtenerMaterias();
    }
    
    @GetMapping(PathMateria.MATERIA_ID)//si me llega una variable, entro a obtener 1 producto
    public Materia obtenerMateria(@PathVariable String id_materia ,HttpServletResponse hsr){
        return mBusiness.obtenerMateria(id_materia);
    }
    
    @PostMapping(PathMateria.MATERIA)
    public String crearMateria(@RequestBody Materia materia, HttpServletResponse hsr){
        return mBusiness.crearMateria(materia);
    }
    
    @DeleteMapping(PathMateria.MATERIA_ID)
    private String eliminarMateria(@PathVariable String id_materia, HttpServletResponse hsr){
        return mBusiness.eliminarMateria(id_materia);
    }
    
    //---
    
    @GetMapping(PathRegistro.REGISTRO)
    public List<Registro> obtenerRegistros(HttpServletResponse hsr){
        return rBusiness.obtenerRegistros();
    }
    
    @GetMapping(PathRegistro.REGISTRO_ID)//si me llega una variable, entro a obtener 1 producto
    public Registro obtenerRegistro(@PathVariable String id_registro ,HttpServletResponse hsr){
        return rBusiness.obtenerRegistro(id_registro);
    }
    
    @PostMapping(PathRegistro.REGISTRO)
    public String crearMateria(@RequestBody Registro registro, HttpServletResponse hsr){
        return rBusiness.crearRegistro(registro);
    }
    
    @DeleteMapping(PathRegistro.REGISTRO_ID)
    private String eliminarRegistro(@PathVariable String id_registro, HttpServletResponse hsr){
        return rBusiness.eliminarRegistro(id_registro);
    }
    
    @GetMapping("/status")
    public String status(){
        return "running server";
    }
}
