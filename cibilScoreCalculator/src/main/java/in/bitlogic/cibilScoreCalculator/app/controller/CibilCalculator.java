package in.bitlogic.cibilScoreCalculator.app.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bitlogic.cibilScoreCalculator.app.exception.InvalidPanNoException;

@RestController
@RequestMapping("/cibilCalculator")
public class CibilCalculator {

	
	@GetMapping("/getCibil/{panNo}")
	public Integer getCibil(@PathVariable("panNo") String panNo)
	{
		if(panNo.length()==9)
		{
			return new Random().nextInt(750,900);
		}
		else 
		{
			throw new InvalidPanNoException("Account not found , please! enter a valid Pan number...");
		}
	}
}
