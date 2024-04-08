package insper.api.ingrediente;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record IngredienteIn (
    String name,
    String descricao
) {
    
}
