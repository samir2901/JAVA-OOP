import java.util.List;
import java.util.Scanner;

public class IFCSManager {
    private Equipment[] equipments;
    private int length;
    /**
     * Default constructor, initialises Equipment list
     */
    public IFCSManager(){
        equipments = new Equipment[10];
        length = 0;
    }
    /**
     * Inserts the Equipment into the list
     * @param eqp the Equipment instance to be inserted into the list
     * @return true if Equipment is successfully inserted
     */
    public boolean insert(Equipment eqp) {
        if(eqp.id.equals("null")){
            System.out.println("Error - id cannot be null");
            return false;
        }
        if(eqp.description.equals("null")){
            System.out.println("Error - description cannot be null");
            return false;
        }
        if(length + 1 < 11){
            equipments[length] = eqp;
            length++;
            return true;
        }
        return false;
    }
    /**
     * Removes the Equipment instance, specified by its id, from the list
     * @param id
     * @return true if Equipment is successfully removed
     */
    public boolean remove(String id) {
        if(id.equals("null")){
            System.out.println("Error - id cannot be null");
            return false;
        }
        for(int i=0; i<length; i++){
            if(equipments[i].id.equals(id)){
                for(int j=i+1; j<length; j++){
                    equipments[j-1] = equipments[i];
                }
                length--;
                return true;
            }
        }
        return false;
    }
    /**
     * Locates the Equipment instance with the specified id
     * @param id
     * @return
     */
    public boolean find(String id) {
        if(id.equals("null")){
            System.out.println("Error - id cannot be null.");
            return false;
        }
        for(int i=0; i<length; i++){
            if(equipments[i].id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for(int i=0; i<length; i++){
            System.out.println("id="+equipments[i].id+", "+
                    "desc="+equipments[i].description);
        }
    }

    public static void main(String[] args) {

        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        IFCSManager myMgr = new IFCSManager();

        // while loop for user input
        while(!quit){
            System.out.println("Enter choice number:");
            System.out.println("1. Insert\n2. Remove\n3. Report");
            System.out.print("4. Display\n5. Quit:");
            int choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.print("Enter id:");
                    String id = sc.next();
                    System.out.print("Enter description:");
                    String desc = sc.next();
                    if(myMgr.insert(new Equipment(id, desc)))
                        System.out.println("Equipment added to Lab");
                    else
                        System.out.println("Equipment cannot be added");

                }break;
                case 2:{
                    System.out.print("Enter id:");
                    String id = sc.next();
                    if(myMgr.remove(id))
                        System.out.println("Equipment removed from Lab");
                    else
                        System.out.println("Equipment with "+id+
                                " cannot be found.");

                }break;
                case 3:{
                    System.out.print("Enter id:");
                    String id = sc.next();
                    if(myMgr.find(id))
                        System.out.println("Equipment available in Lab");
                    else
                        System.out.println("Equipment not in Lab");

                }break;
                case 4:{
                    myMgr.display();
                }break;
                case 5:{
                    System.out.println("Exiting...");
                    quit = true;
                }break;
                default:
                    System.out.println("Invalid Choice");
            }
        }


    }


}
