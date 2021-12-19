package br.com.erudio;

public class User2 extends Participant {

	private String name;
	private ZoomChatRoom chat;

	@Override
	public void sendMsg(String msg) {
		this.chat.showMsg(msg, this);

	}

	@Override
	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public User2(ZoomChatRoom chat) {
		this.chat = chat;
	}
}