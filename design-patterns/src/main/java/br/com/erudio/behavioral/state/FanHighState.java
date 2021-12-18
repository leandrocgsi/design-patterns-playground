package br.com.erudio.behavioral.state;

public class FanHighState extends State {
  private Fan fan;

  public FanHighState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    System.out.println("Turning Fan Off");
    fan.setState(fan.getFanOffState());
  }

  @Override
  public String toString() {
    return "Fan is High";
  }
}
