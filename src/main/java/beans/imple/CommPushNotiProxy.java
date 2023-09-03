package beans.imple;

import org.springframework.stereotype.Component;

import beans.CommNotiProxy;
import domain.Comment;
import util.UTF_8_Printer;

@Component
public class CommPushNotiProxy implements CommNotiProxy {

	@Override
	public void notifyComment(Comment comment) {
		UTF_8_Printer.printStream.println("푸쉬된 코멘트 텍스트: " + comment.getText());
	}

}
