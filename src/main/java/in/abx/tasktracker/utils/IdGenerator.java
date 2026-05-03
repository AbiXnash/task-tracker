package in.abx.tasktracker.utils;

import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * IdGenerator
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class IdGenerator {
    private static Long counter;

    @PostConstruct
    private void setCounter() {
        counter = 0L;
    }

    public static Long generateId() {
        return counter == null ? 1 : counter++;
    }

}
