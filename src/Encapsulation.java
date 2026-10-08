    class student{

    //// Private variables
        private String name;
        private int age;

        //// Setter for name
        public void  setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.age=age;
        }

        // Getter for name

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
    }
    class Encapsulation {
        public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Satyam");
        s1.setAge(20);

            System.out.println("Name " + s1.getName());
            System.out.println("Age " + s1.getAge());
        }
    }

