import java.util.Scanner;
class CUSTOMDATA{

    int arr[],pointer=1;
  
    void initialize(){
      arr=null;
      arr=new int[11];
      arr[0]=0;
      pointer=1;
      System.out.println("INITIALIZED");
    }
  
    void insert(int x){
      arr[pointer]=x;
      pointer++;
      arr[0]++;
      System.out.println("INSERTED "+x);
    }
  
    void remove(){
      pointer--;
      arr[0]--;
      System.out.println("Last item removed");
    }
  
    void display(){
      System.out.println("\n----DATA-START------");
      for(int i=1;i<=pointer-1;i++){
        System.out.println(arr[i]);
      }
      System.out.println("----DATA-END-----\n");
    }
  
}

class Q2{
  public static void main(String[] args) {
    CUSTOMDATA data=new CUSTOMDATA();
    Scanner sc=new Scanner(System.in);
    int opt,value;
    while(true){
      Menu();
      opt=sc.nextInt();
      if(opt==1){
        data.initialize();
      }
      else if(opt==2){
        System.out.println("Enter value");
        value=sc.nextInt();
        data.insert(value);
      }
      else if(opt==3){
        data.remove();
      }
      else if(opt==4){
        data.display();
      }
      else if(opt==5){
        break;
      }
      else{
        System.out.println("Wrong opt");
      }
    }
  }
  static void Menu(){
    System.out.println(""
    +"MENU:\n\n"
    +"1.Initialize\n"
    +"2.INSERTED\n"
    +"3.Remove\n"
    +"4.Display\n"
    +"5.Quit\n\n");
  }
}