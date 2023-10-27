import java.util.Scanner;

public class EducationalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the content type (Quiz, Flashcard, Lesson, Exercise): ");
        String contentType = scanner.nextLine();

        ContentFactory contentFactory = null;

        switch (contentType) {
            case "Quiz" -> contentFactory = new QuizFactory();
            case "Flashcard" -> contentFactory = new FlashcardFactory();
            case "Lesson" -> contentFactory = new LessonFactory();
            case "Exercise" -> contentFactory = new ExerciseFactory();
            default -> {
                System.out.println("Invalid content type selection.");
                scanner.close();
                return;
            }
        }

        Content content = contentFactory.createContent();
        content.display();

        scanner.close();
    }
}
