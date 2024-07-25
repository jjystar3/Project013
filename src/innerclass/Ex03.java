package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		
		Button button = new Button("Click");
		frame.add(button);
		
		// 미리 구현한 클래스로 이벤트 등록
//		button.addActionListener(new EventHandler());
		
		// 익명클래스를 만들고, 객체를 바로 생성
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!!!!");	
			}
			
		});
		
	}

}

// ActionListener인터페이스를 상속받아서 구현 클래스 만들기
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");		
	}
	
}