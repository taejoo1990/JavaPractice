package awt;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceHandler implements ItemListener{
	@Override
	public void itemStateChanged(ItemEvent e) {

		String str = (String)e.getItem();
		System.out.println( "���� : " + str );

	}	
}