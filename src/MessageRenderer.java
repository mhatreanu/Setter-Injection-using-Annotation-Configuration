package com.capgemini.renderer;
import com.capgemini.provider.MessageProvider;
import com.capgemini.provider.implementer.HelloMessageProvider;
import com.capgemini.provider.GmMessageProvider;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRenderer{

		private MessageProvider provider;
		
		public void render(){
		
			System.out.println(provider.printMessage());
		}
		 @Autowired
    		@Qualifier("gm")
    		public void setMessageProvider(MessageProvider provider){
    		this.provider = provider;			
}
}