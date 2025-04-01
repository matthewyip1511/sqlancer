package sqlancer;

import java.util.List;

@FunctionalInterface
public interface SQLExpressionGenerator<G extends ExpandedGlobalState<?, ?>, C, E> {
    E generate(G globalState, List<C> column);
}
