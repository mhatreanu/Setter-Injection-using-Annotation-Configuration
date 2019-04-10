package com.capgemini.provider;
import com.capgemini.provider.MessageProvider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component("gm")
	public class GmMessageProvider implements MessageProvider{
		
		public String printMessage(){

			return "Good Morning";
		}
	}