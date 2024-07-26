package Lang;

public class Logic{
    Logic()
    {
        System.out.println("Here you can customize the command directory.\nP.S: The line will be displayed from the very beginning of the main code.");
    }
    // Activity check
    private boolean isActive;
    public void kprint(){
        isActive = true;
    }
    // Implementation of the method
    public void print(final String text){
        kprint();
        if(isActive = true){
            System.out.println(text);
        } else{
            System.out.println("Error: text or function itself not found");
        }
    }
    public void print(final int a){
        kprint();
        if(isActive = true){
            System.out.println(a);
        } else{
            System.out.println("Error: text or function itself not found");
        }
    }
}
