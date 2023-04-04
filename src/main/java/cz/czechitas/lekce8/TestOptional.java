package cz.czechitas.lekce8;

import java.util.Optional;

public class TestOptional {
    public static void main(String[]args){
       new TestOptional().run();
    }
    public void run (){
     //   Optional<String> email = Optional.empty();
          Optional<String> email = Optional.ofNullable("test@example.com");

          email.ifPresent((e)->System.out.println(e));

          if (email.isPresent()){
              System.out.println(email.get());
          }
      /*
        Optional<String> filterdEmail = email.filter((e)->e.startsWith("a"));
        System.out.println(filterdEmail.orElse("E-mail nebyl zadán nebo nezačíná na 'a'."));

       */
/*
        String vypis1 = email.orElseGet(()-> "E-mail není zadán");
        String vypis2 = email.orElseGet(this::defaultniEmail);
        System.out.println(vypis1);
        System.out.println(vypis2);

 */

    }
    private String defaultniEmail(){
        return "E-mail není zadán";
    }
}
