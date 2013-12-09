class SFib {
  
  public static int fib(int number) {
    if (number <= 1) {
      return number;
    } else if (number % 2 == 0) {
      return fib(number / 2);
    } else {
      return fib(number - 1) + fib(number - 2);
    }
  }
  
  public static void main(String[] args) {
    int numbers = Integer.parseInt(args[0]);
    for (int i = 1; i <= numbers; i++) {
        if (i == numbers) {
          System.out.print(fib(i));  
        } else {
          System.out.print(fib(i) + ",");
        }
    }
  }
}