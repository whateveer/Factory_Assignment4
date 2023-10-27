public class ExerciseFactory implements ContentFactory{

    @Override
    public Content createContent() {
        return new Exercise();
    }
}
