class Relational_Operator{
	public static void main(String[] args){
		
		int var_1, var_2, var_3;
		var_1 = 10;
		var_2 = 20;
		var_3 = 20;
		
		System.out.println(var_1 + " is less than " + var_2 + " " + (var_1 < var_2));
		System.out.println(var_1 + " is greater than " + var_2 + " " + (var_1 > var_2));
		System.out.println(var_2 + " is equals to " + var_3 + " " + (var_2 == var_3));
		System.out.println(var_1 + " is not equals to " + var_2 + " " + (var_1 != var_2));
		System.out.println(var_1 + " is greater and equals to " + var_2 + " " + (var_1  >= var_2));
		System.out.println(var_1 + " is not greater than " + var_2 + " " + (var_1 <= var_2));
		System.out.println(var_2 + " can directly divisible by " + var_1 + " without getting reminder " + (var_2 % var_1 ==  0));
	
		
		
	}

}