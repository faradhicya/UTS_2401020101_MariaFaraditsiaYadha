public class Exam extends Assessment {
    public Exam(int score) {
        super(score);
    }

    @Override
    public int calculateFinalScore() {
        return score;
    }
}
