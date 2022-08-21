package graphs.bookreviews.exeptions;

public class NodeNotFoundException extends RuntimeException {

    public NodeNotFoundException(final String nodeId) {
        super("Node not found: " + nodeId);
    }
}
