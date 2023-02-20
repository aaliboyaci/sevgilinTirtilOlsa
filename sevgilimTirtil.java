package sevgilimTirtil;
import java.util.Scanner;

public class sevgilimTirtil {
    
    /**
     * 
     */
    public static void main(String args[]){

        
        Scanner kullaniciGiris = new Scanner (System.in);
        int i;
        int k1,k2,k3,k4,k5,k6,k7,k8,k9,k10;
        String kararAciklama=("Evet için 1, Hayır için 2 yaz ve Enter'a tıkla ");
        String utanmak=("KAYBETTİN ve KENDİNDEN UTANMALISIN!!");
        while(true) {
       
        System.out.println("");
        System.out.println("Sevgilim Tirtil Oyununa Hoşgeldin");
        System.out.println("Bu oyunda sevgiline karşı olan sevginin sınırları test edilecektir");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Soru 1: Sevgilin bir tırtıl olsa onu sever miydin? ");
        System.out.println(kararAciklama);
        k1 = kullaniciGiris.nextInt();
        if(k1==1){
            //birinci dallanma evet devam
            System.out.println("Sevgilin bir tırtıl fakat kozaya giriyor ve kozadan çıkana kadar onu sever miydin?");
            System.out.println(kararAciklama);
            k2 = kullaniciGiris.nextInt();
            if(k2==1){
                //ikinci soru evet devam
                System.out.println("Sevgilin kozaya girdi. Peki o anda sevgilin kozadan çıkıp kelebek olana kadar onu bekler miydin?");
                System.out.println(kararAciklama);
                k3 = kullaniciGiris.nextInt();
                
                if(k3 == 1 ){
                    //üçüncü soru evet devam        
                    System.out.println("Sevgilin kozadan çirkin berbat kapkara bir kelebek olarak çıktı. Ona olan sevgin azalır mıydı?");
                    System.out.println(kararAciklama);
                    k4 = kullaniciGiris.nextInt();
                    
                        if (k4==1){
                         //dördüncü soru evet devam        
                         System.out.println("Sevgilin ölene kadar başka kızlara bakar mıydın?");
                         System.out.println(kararAciklama);
                         k5 = kullaniciGiris.nextInt();
                            if(k5==1){
                            //beşinci soru evet ve kaybetme
                            System.out.println(utanmak);
                            }
                
                            else{
                                //beşinci soru hayır cevabı ve kazanma
                                System.out.println("Tebrikler kazandın, karını sevdiğini kanıtladın.");


                            }}
                        else{
                            //dördüncü soru hayır cevabı
                            System.out.println("Tebrikler kazandın, karını sevdiğini kanıtladın.");
                        }

                }
                else{ 
                    //üçüncü soru kaybetme
                    System.out.println(utanmak);
                }
            
            }
            else{ 
                //ikinci soru kaybetme
                System.out.println(utanmak);
            }
        }

        //birinci soru kaybetme
        else{
            System.out.println(utanmak);
        }
        
        }
    }

}
