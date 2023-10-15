package package1;
import java.util.Scanner;
import java.util.ArrayList;


public class TodoListApp {
    public static void main(String [] args){
        
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TodoListApp");

       
       

         while(true) {
            System.out.println("1.Add to list...");
            System.out.println("2.View the list...");
            System.out.println("3.Delete from the list...");
            System.out.println("0.Exit...");
            
            System.out.print("Enter a number of your  choice: ");
            int task = scanner.nextInt();
            scanner.nextLine(); 

            switch (task) {
                case 1:
                  System.out.print("Add to the list: ");
                  String addToList = scanner.nextLine();
                  list.add(addToList);
                  System.out.println("Task added to the list!! ");
                  break;

                case 2:
                  if(list.size() != 0){
                    System.out.println("LIST:");
                    for(int i = 0; i < list.size(); i++){
                       System.out.println((i+1) + ". " +list.get(i));
                    }
                    
                  }
                  else{
                    System.out.println("the list is empty!");
                  }
                  break;
                case 3:
                 System.out.print("Element you want to delete: ");
                 int a = scanner.nextInt();
                  for (int i = 0; i < list.size(); i++){
                    if (i == a){
                      list.remove(i+1);
                    }else{
                      System.out.println("the number you provide ain't on the list!");
                    }  
                  }
                  break;
                case 0:
                 System.out.println("Bye Bye!");   
                 System.exit(0);
                
                 default:
                 System.out.println("You entered the invalid number! "); 
                  

            }
         }    
        
        

    }  
}