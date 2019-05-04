package lambdasinaction.chap8;

import java.util.function.Consumer;


public class OnlineBankingLambda {

    public static void main(String[] args) {
        new OnlineBankingLambda().processCustomer(1337,
                (Customer c) -> System.out.println(c.getId() + " Hello " + c.getName()));
    }

    public void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }

    /**
     * dummy Customer class
     */
    static private class Customer {
        private int id;
        private String name;

        public Customer() {
        }

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * dummy Database class
     */
    static private class Database {
        static Customer getCustomerWithId(int id) {
            return new Customer(id, "haha");
        }
    }
}
