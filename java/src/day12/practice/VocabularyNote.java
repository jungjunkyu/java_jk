package day12.practice;

/* 단어장 클래스
 * -단어들의 모임
 * -Word들의 모임
 */

public class VocabularyNote {
	//멤버 변수
	//단어들
	private Word wordList[];//단어들
	private int wordCount;//저장된 단어의 개수
	//생성자
	public VocabularyNote() {
		wordList = new Word[10];
	}
	public VocabularyNote(Word wordList[]) {
		this.wordList = new Word[10];
		for(int i = 0;i < wordList.length;i++) {
			this.wordList[i] = wordList[i];
		}
	}
	//메서드
	/**단어들을 출력하는 메서드
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메서드명 : print 
	 */
	public void print() {
		for(int i=0;i<wordCount;i++) {
			wordList[i].print();
		}
	}
	/**단어가 주어지면 단어장에 추가하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**단어가 주어지면 단어장에서 삭제하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**단어가 주어지면 단어장에 해당 단어를 출력하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**단어와 뜻이 주어지면 없는 단어이면 새로 단어를 추가하고, 있는 단어이면 뜻만 새로 추가하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**단어와 수정할 뜻의 번호와 수정할 뜻이 주어지면 단어의 뜻을 수정하는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
	
	/**
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : 
	 */
}
