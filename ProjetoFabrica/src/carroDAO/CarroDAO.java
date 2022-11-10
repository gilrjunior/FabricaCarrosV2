
package carroDAO;

import carro.Carro;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO {
    
    Connection conexao;
    
    public CarroDAO() throws SQLException, ClassNotFoundException{
        
        this.conexao = Conexao.getConexao();
        
    }
    
    public void insertCarro(Carro carro){
        
        PreparedStatement ps_estado;
        String query = "insert into carros values(?,?,?,?,?)";
        
        try{ 
            
            ps_estado = this.conexao.prepareStatement(query);
            
            ps_estado.setString(1, carro.getChassi());
            ps_estado.setInt(2, carro.getAno());
            ps_estado.setString(3, carro.getModelo());
            ps_estado.setString(4, carro.getFabricante());
            ps_estado.setFloat(5, carro.getPotencia());
            ps_estado.execute();
            ps_estado.close();
            
            System.out.println("\n Informação Inserida no Banco");
            
        }catch(SQLException e){
            System.out.println("\n Erro ao adicionar no banco: "+e.toString());
        }
        
    }
    
    public ArrayList<Carro> mostraCarros(){
        
        PreparedStatement ps_estado;
        ResultSet res;
        ArrayList<Carro> listacarros = null;
        String query  = "select * from carros";
        try{
            ps_estado = this.conexao.prepareStatement(query);
            res = ps_estado.executeQuery();
            listacarros = new ArrayList<>();
            while(res.next())
            {
                Carro carro = new Carro();
                
                carro.setChassi(res.getString("chassi"));
                carro.setAno(res.getInt("ano"));
                carro.setModelo(res.getString("modelo"));
                carro.setFabricante(res.getString("fabricante"));
                carro.setPotencia(res.getFloat("potencia"));
                listacarros.add(carro);
            }
            res.close();
            ps_estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao buscar todos no banco: "+e.toString());
       }
       return (listacarros);
        
    }
    
    public void updateCarro(Carro carro){
        PreparedStatement ps_estado;
        String query = "update carros set ano=?, modelo=?, fabricante=?, potencia=? where chassi=?";
        
        try{
            ps_estado = this.conexao.prepareStatement(query);
            ps_estado.setInt(1, carro.getAno());
            ps_estado.setString(2, carro.getModelo());
            ps_estado.setString(3, carro.getFabricante());
            ps_estado.setFloat(4, carro.getPotencia());
            ps_estado.setString(5, carro.getChassi());
            ps_estado.execute();
            ps_estado.close();
        }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
        }
    }

    public void excluirCarro(String chassi){

        PreparedStatement ps_estado;
        String query = "delete from carros where chassi = ?";
        
        try{
            ps_estado = this.conexao.prepareStatement(query);
            ps_estado.setString(1, chassi);
            ps_estado.execute();
            ps_estado.close();
            System.out.println("\n Informacao removida com sucesso.");
        }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
        }



    }

}
