package com.capgemini.provider.implementer;
import com.capgemini.provider.MessageProvider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
	public class HelloMessageProvider implements MessageProvider{
		
		public String printMessage(){

			return "Hello";
		}
	}