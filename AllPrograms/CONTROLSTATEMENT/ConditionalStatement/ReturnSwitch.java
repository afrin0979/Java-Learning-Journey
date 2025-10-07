public class ReturnSwitch{
    public static void main(String[] args) {

          String day= "wed";
        

        String result = switch(day)
        { 
        //     case "Sunday","Saturday"->result=("6am ");
        //     case "Monday"-> result=("8am");
        //     default-> result=("7am");   

       // -----------------------------------------------------------
        // case "Sunday","Saturday"->"6am ";
        // case "Monday"->"8am";
        // default-> "7am";
        //no need opf writing return also.


        //--------------------------------------------------------------- 
         case "Sunday","Saturday":yield "6am ";
        case "Monday":yield "8am";
        default:yield  "7am";
        //if we want to write : insted ofd-> just add :yield.java 12
        };
        System.out.println(result+ " " +day);
        
    }
}