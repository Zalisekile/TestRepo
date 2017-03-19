/**
 * Created by Zalisekile on 2017/03/17.
 */
public class Chapter2
{
        private double price;
        private int digit;

        public Chapter2(double price)
        {
            this.price = price;
        }

        public double getPrice()
        {
            return price;
        }
        public void setDigit(int digit){this.digit = digit;}
        public void setPrice (double price){this.price = price;}
        public int getDigit(){return digit;}

        public Chapter2()
        {

        }

        public class Dog
        {
            String breed;
            String name;
            char gender;
            int age;
            String colour;

            public Dog(String breed, String name, char gender, int age, String colour) {
                this.breed = breed;
                this.name = name;
                this.gender = gender;
                this.age = age;
                this.colour = colour;
            }

            public Dog()
            {

            }

            public String getBreed() {
                return breed;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public char getGender() {
                return gender;
            }

            public void setGender(char gender) {
                this.gender = gender;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getColour() {
                return colour;
            }

            public void setColour(String colour) {
                this.colour = colour;
            }
        }
}
