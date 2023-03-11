package microservices.book.multiplication.challenge;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {
    private final Random random;

    ChallengeGeneratorServiceImpl() {
        this.random = new Random();
    }

    protected ChallengeGeneratorServiceImpl(final Random random) {
        this.random = random;
    }

    @Override
    public Challenge randomChallenge() {
        return null;
    }
}
