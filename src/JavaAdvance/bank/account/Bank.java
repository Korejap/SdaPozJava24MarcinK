package JavaAdvance.bank.account;

public class Bank {
    public static void main(String[] args) {
        Client c1 = new PersonalClient("Jan", "Kowalski");
        Client c2 = new BussinesClient("Firma");
        ///odwolywanie sie do obiektow i nazwenictwo//   rzutowanie klasy dziedziczonej!  Nie da sie rzutowac dwoch oddzielnych obeiktow (np. biznesowego na personalnego,
        // mozna przekonwertowac na nowy obiekt w takim przypadku) // tak sie robie zeby np byla jedna tablica klientow a nie biznesowych i personalnych
        if(c2 instanceof BussinesClient){
            System.out.println("Biznesowy " + ((BussinesClient) c2).getNip());
        }
        System.out.println("Biznesowy " + ((BussinesClient) c1).getNip());


        Account a1 = new CreditAccount("1234", 500, c1);
        Account a2 = new CheckingAccount("2444", 100, c1);
        Account a3 = new CreditAccount("3233", 200, c2);
        System.out.println(a2);
        System.out.println(a1.toString()  );
        System.out.println("Stan konta a3:" + a3.getBalance());
        System.out.println(c1);
    }


}
