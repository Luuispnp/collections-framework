import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueDeque {
    static void main() {

        // Queue<E> e Deque<E>: Filas e Pilhas de Processamento
        //* Estruturas projetadas para processamento sequencial de tarefas.
        //  - Queue (Fila - FIFO): First In, First Out (Primeiro a entrar, primeiro a sair). Como a fila de um banco.
        //  - Deque (Double Ended Queue): Permite inserir/remover em ambos os lados. Funciona tanto como Fila quanto como Pilha (LIFO - Last In, First Out).
        // */
        //* Comparativo: ArrayDeque vs PriorityDeque
        //  - ArrayDeque: Use para criar Filas e Pilhas em memória. Substitui completamente as antigas classes LinkedList e java.util.Stack
        // - PriorityQueue: Os elementos não saem por ordem de chegada, mas por prioridade (ex: pacientes com maior urgência saem primeiro).
        // */

        // Métodos de Queue / Deque: Lançar Exceção vs Valor Especial
        // Ao trabalhar com filas, você deve preferir métodos que retornam null ou false em vez de quebrar a aplicação com exceções quando a fila estiver vazia:

        // Uso como fila (FIFO)
        Queue<String> filaProcessamento = new ArrayDeque<>();

        filaProcessamento.offer("Email 1"); // Adiciona a fila
        filaProcessamento.offer("Email 2");

        String proximo = filaProcessamento.peek(); // Retorna "Email 1" sem tirar da fila
        String processado = filaProcessamento.poll(); // Retorna "Email 1" e REMOVE da fila

        // Uso como Pilha (LIFO - Desfazer/Undo)
        Deque<String> pilhaHistorico = new ArrayDeque<>();

        pilhaHistorico.push("Pagina inicial"); // Empilha
        pilhaHistorico.push("Perfil");
        pilhaHistorico.push("Configurações");

        String ultimaPagina = pilhaHistorico.pop(); // Retorna "Configurações e desempilha

    }
}
