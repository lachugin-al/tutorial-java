package lessons.java101.nestedclass;

public class Human {

    Relations relations;
    String name;
    int age;

    // nested static class (внутри может иметь еще nested static class и т.д.)
    static public class Relations {

        private final String surname;

        public Relations(final String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }
    }
}
