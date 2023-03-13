package Question_1;

public class driver {
    public static void main(String[] args){
        SalariedEmployee Joe     = new SalariedEmployee("Joe", "Jones", "111-11-1111",2500);
        HourlyEmployee Stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee Mary      = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommisionEmployee Nicole = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee Renwa   = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee Mike        = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommisionEmployee Mahnaz = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        System.out.println("|First name | Last name | Social Sec # | Weekly Salary | Wage | Hours worked | Com rate | Gross salary | Base salary |");

        System.out.println(Joe.getFirst_name() + "           " + Joe.getLast_name() + "       " +  Joe.getSocial_security_number() + "       $" + Joe.getWeekly_salary());

        System.out.println(Stephanie.getFirst_name() + "     " + Stephanie.getLast_name() + "       " +  Stephanie.getSocial_security_number() + "                   $" + Stephanie.getWage() + "      " + Stephanie.getNumber_of_hours_worked());

        System.out.println(Mary.getFirst_name() + "          " + Mary.getLast_name() + "       " +  Mary.getSocial_security_number() + "                   $" + Mary.getWage() + "      " + Mary.getNumber_of_hours_worked());

        System.out.println(Nicole.getFirst_name() + "        " + Nicole.getLast_name() + "        " +  Nicole.getSocial_security_number() + "                                            " + Nicole.getComission_rate() + "       $" + Nicole.getGross_sales());

        System.out.println(Renwa.getFirst_name() + "         " + Renwa.getLast_name() + "      " +  Renwa.getSocial_security_number() + "       $" + Renwa.getWeekly_salary());

        System.out.println(Mike.getFirst_name() + "          " + Mike.getLast_name() + "   " +  Mike.getSocial_security_number() + "                                                                    $" + Mike.getBase_salary());

        System.out.println(Mahnaz.getFirst_name() + "        " + Mahnaz.getLast_name() + "      " +  Mahnaz.getSocial_security_number() + "                                            " + Mahnaz.getComission_rate() + "       $" + Mahnaz.getGross_sales());





    }
}
