package testing.question;

import lombok.Data;
import testing.question.support.Option;

@Data
public class MultiQuestion extends ChoiceQuestion {

	public char[] answer;


	public MultiQuestion(String title, Option[] options , char[] answer) {
		super(title, options);
		this.answer = answer;
	}

}
