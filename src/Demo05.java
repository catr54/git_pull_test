public class Demo05 {
    public static void main(String[] args) {
    // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税
        Income[] incomes = new Income[] {
            new Income(3000),
            new SalaryIncome(7500),
            new StateCouncilSpecialAllowance(15000)
        };
            System.out.println(totalTax(incomes));

    }
    public static double totalTax(Income...incomes){
        double total = 0;
        for(Income income : incomes)
        total = total + income.getTax(); 
        return total;
    }
}