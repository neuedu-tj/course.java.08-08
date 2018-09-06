package testing.question;


import cases.testing.question.support.Option;
import lombok.Data;

@Data
public abstract class ChoiceQuestion extends Question{

	
	protected Option[] options;

	public ChoiceQuestion(String title, Option[] options) {
		super(title);
		this.options = options;
	
	}


}
