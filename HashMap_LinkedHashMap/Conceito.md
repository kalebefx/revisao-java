# HashMap e LinkedHashMap — Revisão Rápida

## HashMap

- Armazena pares chave → valor
- **Não garante ordem** de inserção
- Aceita `null` como chave (uma só) e como valor
- Performance O(1) para `get`/`put` na maioria dos casos

## LinkedHashMap

- Igual ao HashMap, mas **mantém a ordem de inserção**
- Levemente mais lento e consome um pouco mais de memória (mantém uma lista duplamente encadeada internamente)
- Útil quando a ordem importa (ex.: cache LRU, histórico)

## Métodos comuns a ambos

| Método | O que faz |
| --- | --- |
| `put(k, v)` | Insere ou atualiza |
| `get(k)` | Retorna valor pela chave |
| `getOrDefault(k, def)` | Retorna valor ou padrão se não existir |
| `containsKey(k)` | Verifica se chave existe |
| `remove(k)` | Remove a entrada |'
| `entrySet()` | Itera sobre pares chave-valor |
| `keySet()` / `values()` | Apenas chaves ou apenas valores |
