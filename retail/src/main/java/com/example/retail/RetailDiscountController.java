import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retail")
public class RetailDiscountController {
 
    @Autowired
    UserData userdata;

    @PostMapping("/netAmount")
    public String finalAmount(@RequestBody UserData userdata) {
    	
    	int discount_Amount;
    	int net_Amount;
    	
    	if(userdata.getItem_type().equals("grocery")){
    		net_Amount=userdata.getAmount();
    	}
    	else{
    		
    	if(userdata.getUserType().equals("employee"))
    	{
    		discount_Amount=userdata.getAmount()*(30/100);
    		net_Amount=userdata.getAmount()-discount_Amount;
    	}
    	else if(userdata.getUserType().equals("affiliate"))
    	{
    		discount_Amount=userdata.getAmount()*(10/100);
    		net_Amount=userdata.getAmount()-discount_Amount;
    	}
    	else if(userdata.getUserType().equals("customer") && years>=2)
    	{
    		discount_Amount=userdata.getAmount()*(5/100);
    		net_Amount=userdata.getAmount()-discount_Amount;
    	}
    	
    	}
    	if(net_amount>=100)
    	{
    		
    			discount_Amount=net_amount*(5/100);
        		net_Amount=net_amount-discount_Amount;
    	}
    	
    	return "net_amount:"+net_amount;
   	  }
    
        
    }
  
 
}