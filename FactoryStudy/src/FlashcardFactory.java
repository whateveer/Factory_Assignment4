public class FlashcardFactory implements ContentFactory{
    @Override
    public Content createContent() {
        return new Flashcard();
    }
}

