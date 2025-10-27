public class Assignment extends Assessment {
    public Assignment(int score) {
        super(score);
    }

    @Override
    public int calculateFinalScore() {
        return score;
    }
}
