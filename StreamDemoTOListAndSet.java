import java.util.*;
import java.util.stream.*;
class StreamDemoTOListAndSet
{
   public static void main(String[] args)
    {
          ArrayList<NamePhoneAndEmail> l=new ArrayList<NamePhoneAndEmail>();
         l.add(new NamePhoneAndEmail("Deepa","123456789","deepa1@gmail.com"));
         l.add(new NamePhoneAndEmail("thanga","23456789","deepa2@gmail.com"));
         l.add(new NamePhoneAndEmail("deepathanga","12398765","deepa4@gmail.com"));

        Stream<NameAndPhone> mystream=l.stream().map((a)->new  NameAndPhone( a.name,a.phone));
        List<NameAndPhone> l1=mystream.collect(Collectors.toList());
        System.out.println("Name and Phone numbers from list....................");
        for(NameAndPhone e:l1)
                System.out.println(e.name+"   :    "+e.phone);
        mystream=l.stream().map((a)->new   NameAndPhone(a.name,a.phone));
        Set<NameAndPhone> s=mystream.collect(Collectors.toSet());
        System.out.println("names and phones from set...........");
       for(NameAndPhone e:s)
            System.out.println(e.name+"   :    "+e.phone);
     }

}
class NamePhoneAndEmail
{
           String name;
           String  phone;
           String email;
          NamePhoneAndEmail(String name,String phone,String email)
         {

                    this.name=name;
                    this.phone=phone;
                     this.email=email;

          }
        


}
class  NameAndPhone
{
            String name;
            String phone;
            NameAndPhone(String name,String phone)
            {
                  this.name=name;
                  this.phone=phone;
            }
 
}