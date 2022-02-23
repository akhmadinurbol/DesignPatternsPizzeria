import OtherClass.Order;
import OtherClass.Pay;
import OtherClass.ShowAllMenu;


public class Main {

    public static void main(String[] args) {


       //Showing menu
        ShowAllMenu showAllMenu = new ShowAllMenu();
        showAllMenu.Menu();


        //Ordering
        Order order = new Order();
        order.Ordering();            //Next -> Pay


    }
}
