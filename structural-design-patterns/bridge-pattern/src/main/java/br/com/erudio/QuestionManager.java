package br.com.erudio;

public class QuestionManager {
	
	protected Question question;
	public String catalog;

	public QuestionManager(String catalog) {
		this.catalog = catalog;
	}

	public void next() {
		question.nextQuestion();
	}

	public void previous() {
		question.previousQuestion();
	}

	public void newOne(String quest) {
		question.newQuestion(quest);
	}

	public void delete(String quest) {
		question.deleteQuestion(quest);
	}

	public void display() {
		question.displayQuestion();
	}

	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		question.displayAllQuestions();
	}
}