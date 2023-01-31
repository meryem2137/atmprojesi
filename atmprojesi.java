import java.util.Scanner;

public class atmprojesi{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right=3,balance=2000;
        int price,select;
        String username,password;
        while(right>0){
            System.out.print("Kullanıcı adınız: ");
            username=input.nextLine();
            System.out.print("şifreniz: ");
            password=input.nextLine();
            if((username.equals("sevgi"))&&password.equals("sevgi123")){
                System.out.println("Sisteme hoş geldiniz ");
                do{System.out.println("1-para yatırmak \n 2-para çekmek\n 3-bakiye sorgulama\n 4-çıkış");
                    System.out.print("yapmak istediğiniz işlemi seçiniz: ");
                     select=input.nextInt();
                     switch (select) {
                         case 1:
                             System.out.print("para miktarı: ");
                             price = input.nextInt();
                             int total = balance += price;
                             System.out.println("toplam bakiyeniz: " + total);
                             break;
                         case 2:
                             System.out.print("para miktarı: ");
                             price = input.nextInt();
                             if (price > balance) {
                                 System.out.println("bakiye yetersiz");
                             } else {
                                 balance -= price;
                                 System.out.print(balance);
                                 break;
                             }
                         case 3:
                             System.out.println("Bakiyeniz: " + balance);
                             break;
                     }break;







                }while(select!=4);
                System.out.println("tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre girdiniz.");
            }
            if(right==0) {

                System.out.print("hesap bloke olmuştur.");
            }else{

                    System.out.println("kalan hakkınız:"+right);}























        }




        }






    }








//www.patika.dev



































































