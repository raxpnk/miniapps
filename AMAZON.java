import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class AMAZON {
    public static Scanner sc=new Scanner(System.in);
    public static SimpleDateFormat sdf= new SimpleDateFormat("dd//MM//yyyy HH:mm:ss");
    public static Date date=new Date();
    public static String merchant[]={"nike","adidas","0"};
    public static String merchantpass[]={"1234","1234","0"};
    public static String username[]={"rax","sri","0"};
    public static String userpin[]={"1111","2222","0"};
    public static String products[]={"nikeshoes","nikefootball","adidasshoes","adidasfootball"};

    //refreshscreen
    public static void refreshscreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    
    //delay
    public static void delay(int delay){
        try{
            Thread.sleep(delay);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    //new merchant reg
    public static void newmerchant(){
        refreshscreen();
        System.out.print("ENTER MERCHANT USERNAME : ");
        String newmerchantusername=sc.next();
        sc.nextLine();
        System.out.print("ENTER MERCHANT PASSWORD : ");
        String newmerchantpass=sc.next();
        sc.nextLine();
    }

    //mains
    public static void main(String[] args){
        int block=0;
        b:while(true){
            refreshscreen();
            System.out.println("\tWELCOME TO AMAZON\n1.ADMIN LOGIN\n2.MERCHANT LOGIN\n3.USER LOGIN");
            System.out.println();
            System.out.print("ENTER YOUR OPTION HERE : ");
            int mainoption=sc.nextInt();
            if(mainoption==1){
                a:while(true){
                refreshscreen();
                System.out.print("ENTER YOUR ADMIN USERNAME : ");
                String adminlogin=sc.next();
                sc.nextLine();
                System.out.print("ENTER ADMIN PASSWORD : ");
                int adminpass=sc.nextInt();
                    if(adminlogin.equals("admin") && adminpass==0000){
                        while(true){
                            refreshscreen();
                            System.out.println("\tWEMCOME Mr.ADMIN\n1.ADD/REMOVE MERCHANT\n2.VIEW ALL PRODUCT");
                            System.out.println("3.ADD PRODUCT\n4.APPROVE MERCHANT\n5.HOME");
                            System.out.print("ENTER YOUR OPTION HERE : ");
                            int adminoption=sc.nextInt();
                            if(adminoption==5){
                                break a;
                            }
                            if(adminoption==4){
                            }
                            else{
                                System.out.println("INVALID INPUT!!!");
                                System.out.println("PLEASE CHOOSE FROM OPTIONS ABOVE!!!");
                                delay(2000);
                            }
                        }

                    }
                else{
                    System.out.println("INVALID ADMINNAME AND PASSWORD");
                    System.out.print("ENTER 1 TO GO BACK TO MAINPAGE : ");
                    int one=sc.nextInt();
                    if(one==1){break b;}                    
                    delay(2000);
                }
                }  
            }
            if(mainoption==2){
                block=1;
                c:while(true){
                    refreshscreen();
                    System.out.println("1.OLD MERCHANT\n2.NEW MERCHANT\n3.HOME");
                    System.out.print("ENTER YOUR OPTION HERE : ");
                    int sidemerchantoption=sc.nextInt();
                    if(sidemerchantoption==2){
                        newmerchant();
                        System.out.println("WAITING FOR APPROVAL FROM ADMIN...");
                        delay(2000);
                    }
                    else if(sidemerchantoption==1){
                        refreshscreen();
                        System.out.print("ENTER MERCHANT USERNAME : ");
                        String merchantusername=sc.next();
                        sc.nextLine();
                        System.out.print("ENTER MERCHANT PASSWORD : ");
                        String merchantpassword=sc.next();
                        sc.nextLine();
                        if(block!=3){
                        for(int i=0;i<merchantusername.length();i++){
                                block=1;
                                a:while(true){
                                if(merchantusername.equals(merchant[i]) && merchantpassword.equals(merchantpass[i])){
                                    while(true){
                                    refreshscreen();
                                    System.out.println("\tWELCOME "+merchant[i].toUpperCase());
                                    System.out.println("1.HOME");
                                    System.out.print("ENTER YOUR OPTION HERE : ");
                                    int merchantoption=sc.nextInt();  
                                    if(merchantoption==1){
                                        break a;
                                    }
                                    else{
                                        System.out.println("INVALID OPTION!!!");
                                        System.out.println("PLEASE SELECT A VALID OPTION");
                                        delay(2000);
                                    }  
                                    }
                                }
                                }
                        }}
                    }
                    if(sidemerchantoption==3){
                        break c;
                    }
                }
            }
            if(mainoption==3){}
        }
    
    }
}
