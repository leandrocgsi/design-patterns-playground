package br.com.erudio;

public class User1 extends Participant {

	private String name;
	private ZoomChatRoom chat;

	@Override
	public void sendMsg(String msg) {
		chat.showMsg(msg, this);
	}

	@Override
	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public User1(ZoomChatRoom chat) {
		this.chat = chat;
	}
}