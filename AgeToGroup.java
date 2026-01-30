public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        int ageGroup = 1;

        ageGroup = (age>=18)?ageGroup:0;
        ageGroup = (age<=65)?ageGroup:2;     
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}