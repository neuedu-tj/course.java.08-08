package testing.check;


import testing.answer.Answer;
import testing.question.Question;

public interface Check {
	
	int check(Question question, Answer answer);

}
