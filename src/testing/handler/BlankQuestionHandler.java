package testing.handler;


import org.apache.commons.lang3.ArrayUtils;
import testing.answer.Answer;
import testing.answer.BlankAnswer;
import testing.check.Check;
import testing.constant.Constant;
import testing.question.BlankQuestion;
import testing.question.Question;


public class BlankQuestionHandler implements Check {

	@Override
	public int check(Question question, Answer answer) {
		
		BlankQuestion blankQuestion = (BlankQuestion)question;
		BlankAnswer blankAnswer = (BlankAnswer)answer;
		
		int score = 0;
		
		if(blankAnswer.getContents()!=null && blankAnswer.getContents().length > 0 ) {
			for (int i = 0; i < blankAnswer.getContents().length; i++) {
				if( ArrayUtils.contains(blankQuestion.getAnswer(),  blankAnswer.getContents()[i]) ) {
					score += Constant.BLANK_SCORE;
				}
			}
		}
		

		return score;
	}

}
