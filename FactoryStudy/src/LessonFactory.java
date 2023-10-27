public class LessonFactory implements ContentFactory{
    @Override
    public Content createContent() {
        return new Lesson();
    }
}
