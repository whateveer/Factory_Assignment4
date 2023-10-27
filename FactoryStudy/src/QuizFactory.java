public class QuizFactory implements ContentFactory{
    @Override
    public Content createContent() {
        return new Quiz();
    }
}
