public class checkString implements StringChecker{

    @Override
    public boolean checkString(String s) {
        
        if (s != null) { 
            return true;
        }

        return false;
    }
    
    
}
