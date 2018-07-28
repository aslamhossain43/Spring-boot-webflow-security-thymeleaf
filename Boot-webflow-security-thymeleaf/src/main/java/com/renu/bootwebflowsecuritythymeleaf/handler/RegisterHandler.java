package com.renu.bootwebflowsecuritythymeleaf.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.renu.bootwebflowsecuritythymeleaf.models.BillingInfo;
import com.renu.bootwebflowsecuritythymeleaf.models.PersonalInfo;
import com.renu.bootwebflowsecuritythymeleaf.models.RegisterModel;
import com.renu.bootwebflowsecuritythymeleaf.repository.BillingInfoRepository;
import com.renu.bootwebflowsecuritythymeleaf.repository.PersonalInfoRepository;


@Component
public class RegisterHandler {
@Autowired
	private PersonalInfoRepository personalInfoRepository;
@Autowired	
private BillingInfoRepository billingInfoRepository;
	public RegisterModel init() {
		return new RegisterModel();
	}

	public void addPersonalInfo(RegisterModel registerModel, PersonalInfo personalInfo) {
		registerModel.setPersonalInfo(personalInfo);
	}

	public void addBillingInfo(RegisterModel registerModel, BillingInfo billingInfo) {
		registerModel.setBillingInfo(billingInfo);
	}

	public String saveAll(RegisterModel registerModel, MessageContext error) {
		String transitionValue = "success";

BillingInfo billingInfo=registerModel.getBillingInfo();
PersonalInfo personalInfo=registerModel.getPersonalInfo();
personalInfoRepository.save(personalInfo);
billingInfoRepository.save(billingInfo);

		return transitionValue;
	}

	public String validatePersonalInfo(PersonalInfo personalInfo, MessageContext error) {
		String transitionValue = "success";

		// Checking that username is not equal to 'Vakho' :d XXX do whatever you want!
		if (personalInfo.getUsername().equalsIgnoreCase("Vakho")) {
			error.addMessage(new MessageBuilder(). 
					error() 
					.source("username") 
					.defaultText("You are not allowed to use Vakho as the username!") 
					.build());

			transitionValue = "failure";
		}

		// Checking if password matched the confirm password
		if (!personalInfo.getPassword().equals(personalInfo.getConfirmPassword())) {
			error.addMessage(new MessageBuilder(). 
					error() 
					.source("confirmPassword") 
					.defaultText("Password doesn't match up the confirm password!") //
					.build());

			transitionValue = "failure";
		}
		return transitionValue;
	}
}
