/* Facade */

class MaquinaDeLavar {
  
  private Secar secador;
  private Enchagua Enchaguando;
  private Lavar lavaARoupa;

  public MaquinaDeLavar() {
    this.lavaARoupa = new Lavar();
    this.Enchaguando = new Enchagua();
    this.secador = new Secar();
  }
  
  public void run() {
  lavaARoupa.lavaRoupa();
  Enchaguando.enchaguar();
  secador.secando();
  }
  
}