public class Gerente extends Aprovador {
  @Override
  public void aprovarDespesa(double valor) {
    if (valor <= 1000) {
      System.out.println("Gerente aprovou a despesa de R$ " + valor);
    } else if (proximo != null) {
      proximo.aprovarDespesa(valor);
    }
  }
}