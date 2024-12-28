interface Menu{
    public void showMenu();
}

class VegMenu implements Menu{
    public void showMenu(){
        System.out.println("Veg Biryani");
    }
}
class NonVegMenu implements Menu{
    public void showMenu(){
        System.out.println("chicken Biryani");
    }
}
 
class HotelServiceStaff{
    NonVegMenu nonVegMenu;
    VegMenu vegMenu;

    public HotelServiceStaff(){
        this.vegMenu=new VegMenu();
        this.nonVegMenu=new NonVegMenu();
    }

    public void showVegMenu(){
        this.vegMenu.showMenu();
    }
    
    public void showNonVegMenu(){
        this.nonVegMenu.showMenu();
    }
    public void showVegNonVegMenu(){
        this.vegMenu.showMenu();
        this.nonVegMenu.showMenu();
    }

    
}

public class FacadeDesignPatternDemo {
    public static void main(String[] args) {
        HotelServiceStaff hss=new HotelServiceStaff();
        System.out.println("show veg menu");
        hss.showVegMenu();

        System.out.println("show Nonveg menu");
        hss.showNonVegMenu();

        System.out.println("show veg& nonveg menu");
        hss.showVegNonVegMenu();
        
        
    }
    
}
