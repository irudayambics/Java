/**
 * 
 */
package com.raj.greenkonceptsdemo.entities;

/**
 * @author user
 *
 */
public class AuxiliaryResponse {

	private String sentence;
	
	private Integer numberOfWords;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public Integer getNumberOfWords() {
		return numberOfWords;
	}

	public void setNumberOfWords(Integer numberOfWords) {
		this.numberOfWords = numberOfWords;
	}
	
	public AuxiliaryResponse(String sentence, Integer numberOfWords) {
		this.sentence = sentence;
		this.numberOfWords = numberOfWords;
	}
	
}
