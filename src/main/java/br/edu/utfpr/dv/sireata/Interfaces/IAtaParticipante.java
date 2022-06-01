package br.edu.utfpr.dv.sireata.Interfaces;

import java.sql.SQLException;
import java.util.List;

import br.edu.utfpr.dv.sireata.model.AtaParticipante;

public interface IAtaParticipante {
    
    public AtaParticipante buscarPorId(int id) throws SQLException, Exception;
    public List<AtaParticipante> listarPorAta(int idAta) throws SQLException, Exception;
    public int salvar(AtaParticipante participante) throws SQLException, Exception;
    public void excluir(int id) throws SQLException, Exception;
}
