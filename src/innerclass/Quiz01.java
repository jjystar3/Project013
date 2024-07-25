package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz01 {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);

		// 프레임을 열고, 키를 누르면 -> "키를 눌렀습니다!" 출력
//		frame.addKeyListener(new KeyEventHandler());

		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

}

class KeyEventHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키를 눌렀습니다!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}