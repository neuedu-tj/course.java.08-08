package testing.question;


import lombok.Data;
import testing.question.support.Option;

@Data
public class SingleQuestion extends ChoiceQuestion {
	
	public char answer;
	
	public SingleQuestion(String title , Option[] options  , char answer) {
		super(title , options);
		this.answer = answer;
	}

}
