class Main {
  public static void main(String[] args) {
    System.out.println("");

    ConexaoBanco.getInstance().conectar();

    ConexaoBanco.getInstance().desconectar();


    
  }
}