public abstract class Assessment implements Gradable {
    protected int score;

    public Assessment(int score) {
        this.score = score;
    }

    public abstract int calculateFinalScore();

    @Override
    public int getGrade() {
        return calculateFinalScore();
    }
}
