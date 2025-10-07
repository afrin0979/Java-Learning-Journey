public class UpdatedSwitchStatement{
    public static void main(String[] args) {
        
        String day= "Sunday";
        switch(day){
        
            case "Sunday","Saturday"->System.out.println("6am ");
            case "Monday"-> System.out.println("8am");
            default-> System.err.println("7am");    
        }
    }
}
// “In the latest Java versions, the switch statement has become much more powerful.
// It can now be used as both a statement and an expression that returns a value.
// We can use arrow labels (->), combine multiple case label"