package testing.question;


import lombok.Data;
import testing.question.support.Option;

@Data
public abstract class ChoiceQuestion extends Question{

	
	protected Option[] options;

	public ChoiceQuestion(String title, Option[] options) {
		super(title);
		this.options = options;
	
	}


}
