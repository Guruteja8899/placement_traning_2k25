public class numbercommandline {
    static int add(int n1, int n2){
        return n1 + n2;
    }
        public static void main(String[] args){
            int sum = add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            System.out.println("The sum is " + sum);
        }
}