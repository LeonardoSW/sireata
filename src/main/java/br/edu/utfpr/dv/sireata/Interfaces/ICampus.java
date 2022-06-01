package br.edu.utfpr.dv.sireata.Interfaces;

import java.sql.SQLException;
import java.util.List;

import br.edu.utfpr.dv.sireata.model.Campus;

public interface ICampus {
    
    public List<Campus> listarTodos(boolean apenasAtivos) throws SQLException, Exception;

    public Campus buscarPorId(int id) throws SQLException, Exception;

    public Campus buscarPorDepartamento(int idDepartamento) throws SQLException, Exception;
    
    public List<Campus> listarParaCriacaoAta(int idUsuario) throws SQLException, Exception;
    
    public List<Campus> listarParaConsultaAtas(int idUsuario) throws SQLException, Exception;
    
    public int salvar(Campus campus) throws SQLException, Exception;
}
