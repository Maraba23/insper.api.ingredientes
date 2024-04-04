package insper.store.ingrediente;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record IngredienteOut (
    String id,
    String name,
    String descricao
) {
    
}
