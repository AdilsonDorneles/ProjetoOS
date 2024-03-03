package br.com.infotec.dao;

import java.sql.*;
import java.sql.Connection;
import br.com.infotec.dao.ModuloConexao;
import br.com.infotec.dto.ClienteDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OsDao {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;

    // Metodo para pesquisar Clientes pelo nome.
    public ArrayList<ClienteDto> pesquisar_cliente(ClienteDto clientedto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "select idcli as Id,nomecli as nome,fone from tbclientes where nomecli like ? ";
        ArrayList<ClienteDto> lista = new ArrayList<>();
        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, clientedto.getNome() + "%");
            rs = pst.executeQuery();

            while (rs.next()) {

                clientedto.setIdcli(rs.getInt("idcli"));
                clientedto.setNome(rs.getString("nomecli"));
                clientedto.setFone(rs.getString("fone"));

                lista.add(clientedto);

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "OsDao Pesquisar Clientes: " + erro);
        }
        return lista;

    }
}
