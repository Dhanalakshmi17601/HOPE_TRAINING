import java.util.*;

class Locker{
    private String lockerid;
    private String PIN;
    private String stored_item;
    private boolean islocked;
    public Locker(String id, String pincode)
    {
        this.lockerid=id;
        this.PIN=pincode;
        stored_item="";
        islocked=true;
    }

    public void storeItem(String item, String pin)
    {
        if(this.PIN.equals(pin))
        {
            if(!islocked)
            {
                stored_item=item;
                islocked=true;
                System.out.println("Item stored successfully");
            }
            else{
                System.out.println("Locker is Locked");
            }
        }
        else{
            System.out.println("Invalid PIN");
        }
    }

    public void RetriveItem(String pin)
    {
        if(this.PIN.equals(pin))
        {
            if(!islocked && stored_item!=null){
                System.out.println("Retriving data: "+stored_item);
                stored_item=null;
            }
            else if(stored_item==null)
            {
                System.out.println("Locker is empty");
            }
            else{
                System.out.println("Locker is Locked");
            }
        }
        else{
            System.out.println("Invalid PIN");
        }
    }


    public void Unlock(String pin)
    {
        if(this.PIN.equals(pin))
        {
            islocked=false;
            System.out.println("Locker is Unlocked");
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    public void Lock()
    {
        if(islocked)
        {
            islocked=false;
            System.out.println("Locker is locked successfully");
        }
        
    }

}

public class Locker_System {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Locker l=new Locker("SD45059","9751");
        l.storeItem("Gold", "9751");
        // l.RetriveItem("1251");
        l.Unlock("9751");
        l.storeItem("Gold", "9751");
        l.Unlock("9751");
        l.RetriveItem("9751");
        l.Lock();


    }
    
}
