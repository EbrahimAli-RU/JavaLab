package main;

/**
 * Calculator class implement that
 * simplify addition of two given double and Print
 * simplify multiplication of two given double and Print
 * simplify substraction of two given double and Print
 * simplify modulus of two given double and Print
 * @author EBRAHiM ALi
 *@version 1.0
 *@since 2018-10-29
 */
public class Calculator 
{
	/**
	 * this method used to add two double number
	 * simplify two given integer and print
	 * @param num1 this is first parameter of CalculatingSum method 
	 * @param num2 this is second parameter of CalculatingSum method
	 * @return this return summation of num1 and num2 parameter
	 */
	public static double CalculatingSum(double num1,double num2)
	{
		return num1+num2;
	}
	/**
	 * this method used to multiply two double number
	 * simplify two given integer and print
	 * @param num1 this is first parameter of CalculatingSum method 
	 * @param num2 this is second parameter of CalculatingSum method
	 * @return this return multiplication of num1 and num2 parameter
	 */
	public static double CalculatingMul(double num1,double num2)
	{
		return num1*num2;
	}
	/**
	 * this method used to multiply two double number
	 * simplify two given integer and print
	 * @param num1 this is first parameter of CalculatingSum method 
	 * @param num2 this is second parameter of CalculatingSum method
	 * @return this return subtraction of num1 and num2 parameter
	 */
	public static double CalculatingSub(double num1,double num2)
	{
		return num1-num2;
	}
	public static void main(String arg[])
	{
		double sum,mul,sub;
		/**
		 * CalculatingSum method call
		 *print summation of two double parameter
		 */
		sum=CalculatingSum(10,20);
		System.out.println(sum);
		/**
		 * CalculatingSub method call
		 * print subtraction of two double prameter
		 */
		sub=CalculatingSub(100,20);
		System.out.println(sub);
		/**
		 * CalculatingMul method call
		 * print multiplication of two double prameter
		 */
		mul=CalculatingMul(10,20);
		System.out.println(mul);
	}
}
 