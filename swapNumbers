import java.util.ArrayList;
import java.util.Scanner;

public class swapper extends funcMaster {
    public swapper(String selection, ArrayList<Integer> nums) {
        super.selection = selection;
    }

    @Override
    public String getSelection() {
        return this.selection;
    }

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        //First user number
        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        //Second user number
        System.out.print("Number 2: ");
        int num2 = input.nextInt();

        nums.add(num1);
        nums.add(num2);

        //Before statement
        System.out.println("Before: " + nums.get(0) + " " + nums.get(1));

        //Switcher
        if(nums.get(0) > nums.get(1)) {
            Integer temp = nums.get(1);
            nums.set(1, nums.get(0));
            nums.set(0, temp);
        }

        //After statement
        System.out.println("After: " + nums.get(0) + " " + nums.get(1));

    }
}
