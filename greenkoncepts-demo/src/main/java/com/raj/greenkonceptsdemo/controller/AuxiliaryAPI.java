package com.raj.greenkonceptsdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.greenkonceptsdemo.entities.Auxiliary;
import com.raj.greenkonceptsdemo.entities.AuxiliaryResponse;
import com.raj.greenkonceptsdemo.service.AuxiliaryService;

/**
 * 
 * @author Irudaya Raj
 * End points for supporting functions APIs
 */

@RestController
@RequestMapping("/api/v1/auxiliary")

public class AuxiliaryAPI {
	
	@Autowired
	private AuxiliaryService auxiliaryService;

	@PostMapping
    public ResponseEntity<AuxiliaryResponse> create(@RequestBody Auxiliary auxiliary) {
		Integer numberOfWords = auxiliaryService.countWords(auxiliary.getSentence());
		return ResponseEntity.ok(new AuxiliaryResponse(auxiliary.getSentence(), numberOfWords));                
    }
	

}
