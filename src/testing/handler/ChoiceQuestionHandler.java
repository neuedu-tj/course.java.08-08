package testing.handler;


import org.apache.commons.lang3.ArrayUtils;
import testing.answer.Answer;
import testing.answer.ChoiceAnswer;
import testing.check.Check;
import testing.constant.Constant;
import testing.question.MultiQuestion;
import testing.question.Question;
import testing.question.SingleQuestion;

public class ChoiceQuestionHandler implements Check {

	@Override
	public int check(Question question, Answer answer) {

		ChoiceAnswer choiceAnswer = (ChoiceAnswer) answer;

		boolean flag = false;

		if (question instanceof SingleQuestion) {
			SingleQuestion single = (SingleQuestion) question;
			flag = single.getAnswer() == choiceAnswer.getChoice()[0];

		} else if ( question instanceof MultiQuestion) {
			MultiQuestion multi = (MultiQuestion) question;
			
			
			if (choiceAnswer.getChoice() != null && choiceAnswer.getChoice().length == multi.getAnswer().length) {

				for (int i = 0; i <  multi.getAnswer().length ; i++) {

					flag = ArrayUtils.contains(choiceAnswer.getChoice(), multi.getAnswer()[i]);

					if (!flag) break;
				}

			} 
		}
		
		if(flag) return Constant.CHOICE_SCORE;
		else return 0;
	}


}
