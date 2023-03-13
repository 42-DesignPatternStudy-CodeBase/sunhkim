package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.*;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;
    
    public ColleagueCheckbox(String label, CheckboxGroup group, boolean state) {
        super(label, group, state);
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
	public void itemStateChanged(ItemEvent e) {
		System.out.println("" + e);
		mediator.colleagueChanged(this);
	}
}
