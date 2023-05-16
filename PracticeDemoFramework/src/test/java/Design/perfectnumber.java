package Design;

import java.util.ArrayList;
import java.util.List;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int perfectnumber = 25;
		int sum = 0;

		List<Integer> value = new ArrayList<Integer>();

		for (int i = 1; i <= perfectnumber - 1; i++) {

			if (perfectnumber % i == 0) {

				value.add(i);

			}

		}

		for (int j = 0; j <= value.size() - 1; j++) {

			sum = sum + value.get(j);

		}

		if (sum == perfectnumber) {

			System.out.println("The following is an perfect number");

		} else {

			System.out.println("This is an perfect number");

		}

	}

}
