import java.util.HashSet;
import java.util.Set;

public class SetContent {
    static void main() {

        // Set<E>: Garantia de Elementos Únicos
        // Use um Set quando a regra de negócio exigir que não existam elementos duplicados ou quando você precisar verificar a existência de algo de forma instantânea.

        Set<String> emailsAutorizados = new HashSet<>();

        // 1. add(element): Adiciona o item. Retorna 'false' se o item JÁ EXISTIA.
        // Uso: Excelente para checagens rápidas sem precisar de 'if'.
        boolean inseriu = emailsAutorizados.add("admin@empresa.com"); // true
        boolean inseriuDenovo = emailsAutorizados.add("admin@empresa.com"); // false (não duplica!)

        // 2. contains(object): Busca instantânea. - O(1)
        // Uso: Filtros de segurança e validações de regras de negócio.
        if (emailsAutorizados.contains("dev@empresa.com")) {
            // Permite acesso
        }

        // 3. Operações Teóricas de Conjuntos (União, Interseção, Diferença)
        Set<String> grupoA = new HashSet<>(Set.of("Java", "Spring", "Docker"));
        Set<String> grupoB = new HashSet<>(Set.of("Docker", "AWS", "PostgreSQL"));

        // União: Junta tudo sem repetir
        Set<String> uniao = new HashSet<>(grupoA);
        uniao.addAll(grupoB); // ["Java", "Spring", "Docker", "AWS", "PostgreSQL"]

        // Interseção: Mantém apenas o que existe nos DOIS ao mesmo tempo
        Set<String> intersecao = new HashSet<>(grupoA);
        intersecao.retainAll(grupoB); // ["Docker"]

        // Diferença: Remove do Grupo A tudo o que faz parte do Grupo B
        Set<String> diferenca = new HashSet<>(grupoA);
        diferenca.removeAll(grupoB); // ["Java", "Spring"]

    }
}
