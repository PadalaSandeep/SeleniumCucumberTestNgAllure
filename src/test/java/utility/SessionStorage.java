package utility;

import java.util.HashMap;
import java.util.Map;

public class SessionStorage {
    private static final ThreadLocal<Map<String, Object>> session = ThreadLocal.withInitial(HashMap::new);

    private SessionStorage() {
        // Private constructor to prevent instantiation
    }

    // Store a variable
    public static void set(String key, Object value) {
        session.get().put(key, value);
    }

    // Retrieve a variable
    public static Object get(String key) {
        return session.get().get(key);
    }

    // Retrieve a variable with type casting
    @SuppressWarnings("unchecked")
    public static <T> T get(String key, Class<T> type) {
        return (T) session.get().get(key);
    }

    // Clear the session (useful after each test)
    public static void clear() {
        session.get().clear();
    }
}
