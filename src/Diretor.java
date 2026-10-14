public class Diretor extends Aprovador {
  @Override
  public void aprovarDespesa(double valor) {
    if (valor <= 10000) {
      System.out.println("Diretor aprovou a despesa de R$ " + valor);
    } else {
      System.out.println("Despesa de R$ " + valor + " negada: acima do limite.");
    }
  }
}