package br.com.erudio.behavioral.observer;

public abstract class Observer {

  protected Subject subject;

  abstract void update();
}
