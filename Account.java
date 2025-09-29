package tugas;

public class Account {
    private long acc_no;
    private String name, email;
    private int amount;
    
    public long getAcc_no(){
        return acc_no;
    }
    
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public static void main(String[] args){
        Account zero = new Account();
        zero.setAcc_no(123456);
        zero.setName("Maudy Ayunda");
        zero.setEmail("mayunda@gmail.com");
        zero.setAmount(50000000);
        
        System.out.print(zero.getAcc_no() +" " +zero.getName() +" " +zero.getEmail() +" " +zero.getAmount());
    }
    
}
