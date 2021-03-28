package song.cpe.common.greeting.usecase;

public class GreetingUseCaseImpl implements GreetingUseCase{
    @Override
    public String greeting(String msg) {
        return "greeting: " + msg;
    }
}
