public abstract class Aprovador {
  protected Aprovador proximo;

  public void definirProximo(Aprovador proximo) {
    this.proximo = proximo;
  }

  public abstract void aprovarDespesa(double valor);
}