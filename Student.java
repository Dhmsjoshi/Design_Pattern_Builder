package Design_Pattern_Builder;



public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradeYear;
    private double psp;
    private String batchName;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradeYear = builder.gradeYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    public  static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradeYear=" + gradeYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    //________
    static class Builder {
        public int id;
        public String name; // validate -> name is not null
        public int yoe; // validate -> yoe >= 1
        public int gradeYear; // validate gradeYear >=2022
        public double psp;
        public String batchName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradeYear(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public void validate(){
            if(name==null){
                throw new InvalidNameException("Name should not be null. !!");
            }
            if(yoe<1){
                throw new InvalidYOEException("Years of experience should not be 0..!!");
            }
            if(gradeYear > 2022){
                throw new InvalidGradeYearException("Grade year should be 2022 or before..!!");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;

        }

    }


}
