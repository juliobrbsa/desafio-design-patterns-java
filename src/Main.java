public class Main {
  public static void main(String[] args) {
    Aprovador gerente = new Gerente();
    Aprovador diretor = new Diretor();

    // Se o gerente não puder aprovar, passa para o diretor
    gerente.definirProximo(diretor);

    // Testando as aprovações
    gerente.aprovarDespesa(500); // O Gerente aprova
    gerente.aprovarDespesa(5000); // Passa para o Diretor aprovar
    gerente.aprovarDespesa(25000); // Negada (acima do limite)
  }
}