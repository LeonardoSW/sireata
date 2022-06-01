package br.edu.utfpr.dv.sireata.Interfaces;

import java.sql.SQLException;
import java.util.List;

import br.edu.utfpr.dv.sireata.model.Anexo;

public interface IAnexo {
    
    public Anexo buscarPorId(int id) throws SQLException, Exception;
    
    public List<Anexo> listarPorAta(int idAta) throws SQLException, Exception;
    
    public int salvar(Anexo anexo) throws SQLException, Exception;
    
    public void excluir(int id) throws SQLException, Exception;
}
