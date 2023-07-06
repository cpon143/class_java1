// exception does not occur
// for eace try block there can be zero or more catch blocks, but only one finally block.
class TestFinallyException{
    public static void main(String args[]){
         
        try{
            int a=Integer.parseInt(args[0]);
            int b=a/0;
        }
        catch(NullPointerException e){
            System.out.println("I am handling the exception "+e);
        }
        catch(Exception e){
            System.out.println("I am handling all the exception "+e);
        }
        finally{
            System.out.println("Finaly block is always executed");
        }
        System.out.println("rest of the code");
        
    }
}