package song.cpe.common.greeting.usecase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    @Test
    public void greetingTest() {
        GreetingUseCase greetingUseCase = new GreetingUseCaseImpl();
        String result = greetingUseCase.greeting("test");
        Assertions.assertEquals("greeting: test", result);
    }
}
