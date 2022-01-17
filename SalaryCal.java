 class SalaryCal {
    public static void main(String[] args) {
        if (args.length == 1) {
            float BasicSalary = Float.parseFloat(args[0]);

            float HRA = ((float) 30 / 100) * BasicSalary;
            float DA = ((float) 20 / 100) * BasicSalary;
            float TA = ((float) 10 / 100) * BasicSalary;
            float MA = ((float) 15 / 100) * BasicSalary;
            float PF = ((float) 5 / 100) * BasicSalary;

            float GrossSalary = BasicSalary + HRA + DA + TA + MA;
            float NetSalary = GrossSalary - PF;

            System.out.println("HRA : " + HRA);
            System.out.println("DA : " + DA);
            System.out.println("TA : " + TA);
            System.out.println("MA : " + MA);
            System.out.println("PF : " + PF);

            System.out.println("----------------------");

            System.out.println("Gross Salary -> " + GrossSalary);
            System.out.println("Net Salary -> " + NetSalary);

        } else {
            System.out.println("Wrong Number of Input");
        }
    }
}