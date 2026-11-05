import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKVContent {
    static void main() {

        // Map<K, V>: Dicionários de Chave e Valor
        // Ao contrário das listas (onde o índice é sempre um número sequencial 0, 1, 2...), no Map você define a chave de acesso: pode ser um CPF, um UUID, um E-mail ou um código de produto.

        //* Diferença conceitual: List vs Map
        //  - Use List se você tem  um grupo de objetos simples e quer iterar sobre eles na sequência.
        //  - Use Map se você precisar localizar um objeto específico usando um identificador único sem ter que varrer uma lista inteira.
        // */

        Map<String, Usuario> usuariosPorCpf = new HashMap<>();

        // 1. put(chave, valor): Insere a chave e o valor. Se a chave já existir, SOBRESCREVE o valor antigo.
        usuariosPorCpf.put("123.456.789-00", new Usuario("Luis", "Admin"));

        // 2. putIfAbsent(chave, valor): Só insere se a chave AINDA NÃO EXISTIR.
        // Uso: Evitar sobrescrever dados já gravados.
        usuariosPorCpf.putIfAbsent("123.456.789-00", new Usuario("Outro Luis", "user")); // Não sobrescreve

        // 3. get(chave): Retorna o valor ou 'null' se a chave não existir.
        Usuario u = usuariosPorCpf.get("123.456.789-00");

        // 4. getOrDefault(chave, valorPadrao): Evita erros de NullPointerException se a chave não existir.
        // Uso: Muito usado para contadores ou valores default.
        Usuario usuarioPadrao = new Usuario("Visitante", "guest");
        Usuario resultado = usuariosPorCpf.getOrDefault("999.999.999-99", usuarioPadrao);

        // 5. computeIfAbscent(chave, k -> ...) se a chave não existir, executa o código e salva no mapa.
        // Uso: O método definitivo para agrupar listas dentro de mapas (ex: agrupar pedidos por cliente).
        Map<String, List<String>> pedidosPorCliente = new HashMap<>();

        // Se não existir uma lista para o cliente "Luis", ele cria a ArrayList na hora e adiciona o pedido.
        pedidosPorCliente.computeIfAbsent("Luis", k -> new ArrayList<>()).add("Pedido #1001");
        pedidosPorCliente.computeIfAbsent("Luis", k -> new ArrayList<>()).add("Pedido #1002");

        // 6. entrySet(): A forma correta e mais rápida de passar por todas as chaves e valores juntos.
        for (Map.Entry<String, Usuario> entry : usuariosPorCpf.entrySet()) {
            System.out.println("CPF: " + entry.getKey() + " | Usuário: " + entry.getValue().getUsuario());
        }

    }
}

class Usuario {

    private String usuario;
    private String tipoAcesso;

    public Usuario(String usuario, String tipoAcesso) {
    }

    public String getUsuario() {
        return usuario;
    }
}
