import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userType;
    
    private int years;
    
    private int amount;
    
    private String item_type
    
    public Long getId() {
        return id;
      }
      public void setId(Long id) {
        this.id = id;
      }
      public String getUserType() {
        return userType;
      }
      public void setUserType(String userType) {
        this.userType = userType;
      }
      public int getYears() {
          return years;
        }
        public int setId(int years) {
          this.years = years;
        }
        
        public int getAmount() {
            return amount;
         }
        public int setAmount(int amount) {
            this.amount = amount;
        }
          
        public String getUserType() {
              return userType;
        }
        public void setItem_type(String item_type) {
              this.item_type = item_type;
        }
   
}

