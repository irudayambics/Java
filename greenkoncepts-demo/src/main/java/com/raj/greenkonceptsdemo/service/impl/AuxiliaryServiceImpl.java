/**
 * 
 */
package com.raj.greenkonceptsdemo.service.impl;

import org.springframework.stereotype.Service;

import com.raj.greenkonceptsdemo.service.AuxiliaryService;
import com.raj.greenkonceptsdemo.utils.StringUtils;



/**
 * @author user
 *
 */
@Service
public class AuxiliaryServiceImpl implements AuxiliaryService {

	public int countWords(String sentence) {
		return StringUtils.countWordsInSentence(sentence);
	}
}
