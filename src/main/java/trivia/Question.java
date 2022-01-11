package trivia;

import java.util.*;
import java.util.function.Predicate;

public class Question {
    private final List<String> popQuestions = new LinkedList<>();
    private final List<String> scienceQuestions = new LinkedList<>();
    private final List<String> sportsQuestions = new LinkedList<>();
    private final List<String> rockQuestions = new LinkedList<>();

    private final Map<QuestionCategory, List<String>> questions = new HashMap<>();

    public Question() {
        for (QuestionCategory questionCategory : QuestionCategory.values()){
            questions.put(questionCategory, new ArrayList<>());
        }
        for (int i = 0; i < 50; i++) {
            popQuestions.add("Pop Question " + i);
            scienceQuestions.add("Science Question " + i);
            sportsQuestions.add("Sports Question " + i);
            rockQuestions.add("Rock Question " + i);

            questions.get(QuestionCategory.POP).add("Pop Question " + i);
            questions.get(QuestionCategory.SCIENCE).add("Science Question " + i);
            questions.get(QuestionCategory.SPORTS).add("Sports Question " + i);
            questions.get(QuestionCategory.ROCK).add("Rock Question " + i);
        }

    }


    public String extractNextQuestion(int index) {
        QuestionCategory questionCategory = currentCategory(index);
        return questions.get(questionCategory).remove(0);

    }


    public QuestionCategory currentCategory(int index) {
        return switch (index % 4) {
            case 0 -> QuestionCategory.POP;
            case 1 -> QuestionCategory.SCIENCE;
            case 2 -> QuestionCategory.SPORTS;
            case 3 -> QuestionCategory.ROCK;
            default -> throw new IllegalArgumentException();
        };
    }


}
