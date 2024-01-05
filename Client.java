package Design_Pattern_Builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder() // Return empty builder object
                .setId(1) // set id and return same object
                .setName("Dhms")// set name and return same object
                .setGradeYear(2022) // set gradeyear  and return same object
                .setYoe(1) // set yoe and return same object
                .setPsp(80) // set psp and return same object
                .setBatchName("LLD_DEC_2023") // set bartchName and return same object
                .build(); //validate builder object and call student constructor and return student object

        System.out.println(s);

        //Student s = new Student(1,"Dhms", 2021, 1, 80, "LLD");
        //here we can not set which value 1 is used for which attribute and what is 80. So above approach is more readable.

        //Also Student class is secured and noone can create Student class without creating builder objeect and validate all attrtibutes and
        // running validate mehod.

    }
}
