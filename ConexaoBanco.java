import java.sql.Connection;

public class ConexaoBanco{

private Connection conexao;
private String nomeBanco;
private String senhaBanco;
  
private static ConexaoBanco isntancia;
  
private ConexaoBanco(){

}

  public static synchronized ConexaoBanco getInstance(){
    if(isntancia == null){
      isntancia = new ConexaoBanco();
    }
  return isntancia;
  }

  public void conectar(){
    System.out.println("Conectei");
  }
  
  public void desconectar(){
    System.out.println("Desconectei");
  }

  
}