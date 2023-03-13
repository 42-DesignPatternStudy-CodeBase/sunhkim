package mediator;

import java.awt.TextField;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements TextListener, Colleague{
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
	
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

	@Override
	public void textValueChanged(TextEvent e) {
        System.out.println("" + e);
		mediator.colleagueChanged(this);
	}

}
