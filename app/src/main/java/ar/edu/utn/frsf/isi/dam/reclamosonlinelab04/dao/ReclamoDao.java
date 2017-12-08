package ar.edu.utn.frsf.isi.dam.reclamosonlinelab04.dao;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.reclamosonlinelab04.modelo.Estado;
import ar.edu.utn.frsf.isi.dam.reclamosonlinelab04.modelo.TipoReclamo;

/**
 * Created by mdominguez on 26/10/17.
 */

public interface ReclamoDao {
    public List<Estado> estados();
    public List<TipoReclamo> tiposReclamo();
    public List<Estado.Reclamo> reclamos();
    public Estado getEstadoById(Integer id);
    public TipoReclamo getTipoReclamoById(Integer id);

    public void crear(Estado.Reclamo r);
    public void actualizar(Estado.Reclamo r);
    public void borrar(Estado.Reclamo r);
    }
