import java.util.ArrayList;
import java.util.Arrays;

public class ListContent {
    static void main() {

        // List<E>: Sequências Ordenadas por Índice
        // Uma List é a estrutura ideal quando a ordem dos elementos importa e você precisa acessar itens pela sua posição numérica (0, 1, 2...). Ela aceita elementos duplicados.

        // Métodos Principais de List e Casos Práticos

        java.util.List<String> tarefas = new ArrayList<>();

        // 1. add(elemento): Adiciona ao final da lista. - O(1)
        // Uso frequente: Preencher DTOs vindos de um banco de dados.
        tarefas.add("Enviar E-mail");
        tarefas.add("Gerar Relatório");

        // 2. add(index, elemento): Insere em uma posição específica empurrando os outros para a frente. - O(n)
        // Uso: Quando a ordem relativa importa (ex: colocar uma tarefa prioritária no topo de uma fila visual).
        tarefas.add(0, "Pagar Conta urgente");

        // 3. get(index): Pega o elemento na posição exata. - O(1)
        // Uso: Acessar um item especifico quando você já sabe seu índice.
        String primeiraTarefa = tarefas.get(0);

        // 4. set(index, elemento): Substitui o item de uma posição sem alterar o tamanho da lista. - O(1)
        // Uso: Atualizar um registro específico em uma lista em memória.
        tarefas.set(1, "Enviar E-mail de Boas-vindas");

        // 5. remove(index) vs remove(Object):
        // remove(0) remove pelo índice; remove("Gerar Relatório") busca pelo .equals() e remove a 1ª ocorrência. - O(1) ou O(n) pelo Object
        tarefas.remove("Gerar Relatório");

        // 6. contains(Object): Verifica se um elemento está na lista. - O(n)
        // Cuidado: Ele percorre a lista do começo ao fim. Se a lista tiver 100.000 itens, vai ser lento.
        boolean temEmail = tarefas.contains("Enviar E-mail");

        // Como Instaciar Listas no Java Moderno

        java.util.List.of("A", "B"); // Para criar listas somente-leitura (imutáveis). Se tentar dar .add(), o Java lança erro.

        Arrays.asList("A", "B"); // Lista de tamanho fixo. Permite alterar elementos com .set(), mas não permite .add() nem .remove()

        new ArrayList<>(java.util.List.of("A", "B")); // Cria uma lista modificável pré-populada. É a forma segura se você for alterar os dados depois.

    }
}
