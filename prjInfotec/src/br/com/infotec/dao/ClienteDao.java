package br.com.infotec.dao;

import br.com.infotec.dto.ClienteDto;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDao {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<ClienteDto> lista = new ArrayList<>();

    //Metodo para cadastrar Clientes.
    public void cadastrarClientes(ClienteDto clientedto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "insert into tbclientes (nomecli,endcli,fone,email) values (?,?,?,?)";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, clientedto.getNome());
            pst.setString(2, clientedto.getEndereco());
            pst.setString(3, clientedto.getFone());
            pst.setString(4, clientedto.getEmail());

            //Na linha abaixo essa condição me auxilia, se os campos nome e fone não forem preechidos ele avisa que são obrigatórios. 
            if ((clientedto.getNome().isEmpty()) || (clientedto.getFone().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Com * ! ");

            } else {
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showInternalMessageDialog(null, "Cliente adicionado com sucesso!");

                    pst.close();
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDao Cadastrar Clientes: " + erro);
        }

    }

    // Metodo para pesquisar Clientes pelo nome.
    public ArrayList<ClienteDto> consultar() {
        conexao = new ModuloConexao().conectorBD();
        String sql = "select * from tbclientes ";

        try {

            pst = conexao.prepareStatement(sql);
            //pst.setString(1,clientedto.getNome() + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                ClienteDto clientedto = new ClienteDto();
                clientedto.setIdcli(rs.getInt("idcli"));
                clientedto.setNome(rs.getString("nomecli"));
                clientedto.setEndereco(rs.getString("endcli"));
                clientedto.setFone(rs.getString("fone"));
                clientedto.setEmail(rs.getString("email"));

                lista.add(clientedto);

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDao Pesquisar Clientes: " + erro);
        }
        return lista;

    }

    //Metodo para editar Clientes;
    public void editar(ClienteDto clientedto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "update tbclientes set nomecli = ?, endcli = ? , fone = ? , email = ? where  idcli = ? ";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, clientedto.getNome());
            pst.setString(2, clientedto.getEndereco());
            pst.setString(3, clientedto.getFone());
            pst.setString(4, clientedto.getEmail());
            pst.setInt(5, clientedto.getIdcli());
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente Alterado com sucesso! ");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDao Editar " + erro);
        }
    }

    //Metodo para excluir Clientes.
    public void Excluir(ClienteDto clientedto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "delete from tbclientes where idcli = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, clientedto.getIdcli());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso! ");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDao Excluir " + erro);
        }

    }

}
