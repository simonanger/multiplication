package microservices.book.multiplication.challenge;

public interface ChallengeService {
    /**
     * Verifies if an attempt coming from the presentation layer is correct or not
     *
     * @returns the resulting ChallengeAttempt object
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
