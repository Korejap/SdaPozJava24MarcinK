package JavaAdvance.bank.javaadvancebankaccount;

public class Bank {
    public static void main(String[] args) throws NullPointerException{
        Client c1 = new PersonalClient("Jan", "Kowalski");
        Client c2 = new BussinesClient("Firma");
        ///odwolywanie sie do obiektow i nazwenictwo//   rzutowanie klasy dziedziczonej!  Nie da sie rzutowac dwoch oddzielnych obeiktow (np. biznesowego na personalnego,
        // mozna przekonwertowac na nowy obiekt w takim przypadku) // tak sie robie zeby np byla jedna tablica klientow a nie biznesowych i personalnych
        if(c2 instanceof BussinesClient){
            System.out.println("Biznesowy " + ((BussinesClient) c2).getNip());
        }



        Account a1 = new CreditAccount("1234", 500, c1);
        Account a2 = new CheckingAccount("2444", 100, c1);
        Account a3 = new CreditAccount("3233", 200, c2);

        System.out.println(a2);
        System.out.println(a1.toString()  );
        System.out.println("Stan konta a3:" + a3.getBalance());
        System.out.println(c1);
        try {

            a2.withdraw(-5);
        } catch(NegatiweWithdrawExeption e) {
            System.out.println("Sytuacja wyjatkowa! " + e.getMessage());
        }finally{
            System.out.println("To jest blok finally. Zawsze sie wykonam. Nie wywali aplikacji");
        }
        System.out.println("Hello");

        try {
            a2.transfer(a1, -5);
        }catch (IllegalArgumentException e){
            System.out.println("Uwaga, tak sie nie da " + e.getMessage());
        }finally{
            System.out.println("Doładuj konto!");
        }

        try{
            Account a4 = new CreditAccount("220", 200, null);
        }catch(NullPointerException e){
            System.out.println("Nie da się " + e.getMessage());
        }finally {
            System.out.println("Wpisz klienta");
        }

    }


}
