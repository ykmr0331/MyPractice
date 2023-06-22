package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NorthButtonActionEventHandler 
		implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("north button click!!");
		System.out.println("실행쓰레드이름:"
				+Thread.currentThread().getName());
		Object eventSource = e.getSource();
		System.out.println(eventSource);
		
	}

}