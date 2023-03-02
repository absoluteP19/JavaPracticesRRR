package Practice6.Builder;
import Practice6.undo.Operation;

public interface Subscriber {
    void notifyMe(Operation operation);
}