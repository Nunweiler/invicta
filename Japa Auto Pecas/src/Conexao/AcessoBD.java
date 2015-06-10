//classe de acesso ao Banco de Dados urbanismo
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class AcessoBD {

    private Connection con = null;   
    private Statement statement;
    private PreparedStatement preparedStatement;
    private String nomeBD;

    public AcessoBD(String nomeBD) {
        //Configura o banco de dados
        
        //String user = "invicta", password = "123456";
        String user = "root", password = "";
        this.nomeBD = nomeBD;
        ConfigBD(nomeBD, user, password);
     
        
    }

    void Processo(String string) {
        AcessoBD bd;
    }
    //Configuração inicial do banco de dados

    private void ConfigBD(String nomeBD, String user, String password) {
            String driver = "com.mysql.jdbc.Driver",
            URL = "jdbc:mysql://192.168.124/" + nomeBD;
            //URL = "jdbc:mysql://192.168.0.2/" + nomeBD;

        //setar o driver
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexão com o banco de dados: " + nomeBD + " realizada com sucesso!");
            System.out.println(con);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.err.println(e.getMessage());

        }
    }

   public Connection getConnection() {
       return con;
    }

    //Consulta a Base de Dados
   public void testar(){
       System.out.println("teste");
   }
    public ResultSet consultaTable(String ConsultaSQL) throws SQLException {
        ResultSet resultado = null;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();
                }
                statement = con.createStatement();
                resultado = statement.executeQuery(ConsultaSQL);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            /*JOptionPane.showMessageDialog( null, "Nao foi possivel atender a solicitação");*/
        }
        return resultado;
    }

    public int updateBase(String updateSQL) {
        int execucaoOk = 1;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();  //Fechando a instrução
                }
                statement = con.createStatement();
                execucaoOk = statement.executeUpdate(updateSQL);
                JOptionPane.showMessageDialog( null,"Operação realizada com Sucesso!!", "Invicta Code", JOptionPane.INFORMATION_MESSAGE);
                
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Atualização não Realizada\n"
                    + "Verificar se o servidor está ligado. Se persistir o problema,\n"
                    + "entre em contato com a equipe da Invicta Code");
        }
        return execucaoOk;
    }
    
    public int updateBase10(String updateSQL) {
        int execucaoOk = 1;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();  //Fechando a instrução
                }
                statement = con.createStatement();
                execucaoOk = statement.executeUpdate(updateSQL);
                JOptionPane.showMessageDialog( null,"Operação realizada com Sucesso!!", "Invicta Code", JOptionPane.INFORMATION_MESSAGE);
            
                
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Atualização não Realizada\n"
                    + "Verificar se o servidor está ligado. Se persistir o problema,\n"
                    + "entre em contato com a equipe da Invicta Code");
        }
        return execucaoOk;
    }
    
    
    public int updateBase2(String updateSQL) { //Essa classe serve para atualizar o banco de dados sem JOptionPane de Mensagem
        int execucaoOk = 1;
        try {
            if (con != null) {
                if (statement != null) {
                    statement.close();  //Fechando a instrução
                }
                statement = con.createStatement();
                execucaoOk = statement.executeUpdate(updateSQL);
                
                
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Atualização não Realizada\n"
                    + "Verificar se o servidor está ligado. Se persistir o problema,\n"
                    + "entre em contato com a equipe da Invicta Code");
        }
        return execucaoOk;
    }
    //Retorna todos os registros da tabela

    public javax.swing.JTable obtemTable(ResultSet resultado) {
        javax.swing.JTable tabela;
        Vector cabecalho = new Vector();
        Vector linhas = new Vector();

        try {
            ResultSetMetaData rsmd = resultado.getMetaData();
            //obtem os nomes das colunas da tabela
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cabecalho.addElement(rsmd.getColumnName(i));
            }

            //obtem as linhas da tebela
            do {
                linhas.addElement(obtemRegistro(resultado, rsmd));
            } while (resultado.next());
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        //monta a tabela com cabeçalho e registros
        tabela = new javax.swing.JTable(linhas, cabecalho);
        return tabela;
    }
    //obtem os registros da tabela

    private Vector obtemRegistro(ResultSet resultado, ResultSetMetaData rsmd) {
        Vector registro = new Vector();
        java.text.SimpleDateFormat dataFormata = new java.text.SimpleDateFormat("dd/MM/yyyy");

        try {
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                switch (rsmd.getColumnType(i)) {
                    case Types.VARCHAR:
                        registro.addElement(resultado.getString(i));
                        break;
                    case Types.INTEGER:
                        registro.addElement(resultado.getInt(i));
                        break;
                    case Types.DECIMAL:
                        registro.addElement(resultado.getDouble(i));
                        break;
                    case Types.REAL:
                        registro.addElement(resultado.getDouble(i));
                        break;
                    case Types.TIMESTAMP:
                        registro.addElement(dataFormata.format(resultado.getDate(i)));
                        break;
                }
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return registro;
    }

    //Fecha a  Base de Dados
    public void finalizaBD() {
        try {
           /* if (con != null) {
                statement.close();
            }*/
            con.close();
            System.err.println("Banco de Dados: " + nomeBD + " fechado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}



