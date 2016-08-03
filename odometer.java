import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {
	static final Integer MAX = 9;

	public static void main(String[] args) {
		Integer nums = 3, distance = 14;
		try {
			System.out.println(startVal(nums));

			System.out.println(addDistance(startVal(nums), distance));
		} catch (IOException e) {
			System.out.println("Out of Range");
		}

	}

	private static List<Integer> addDistance(List<Integer> odometerReading, Integer distance) throws IOException {
		for (int i = 0; i < distance; i++)
			odometerReading = incrementDial(odometerReading);
		return odometerReading;
	}

	private static List<Integer> incrementDial(List<Integer> odometerReading) throws IOException {
		Collections.reverse(odometerReading);
		int i = 0;

		while (i < odometerReading.size()) {
			if (isAtBoundary(odometerReading.get(i), MAX - i)) {
				i++;
			} else {
				odometerReading.set(i, odometerReading.get(i) + 1);
				Collections.reverse(odometerReading);
				if(i!= 0)
					for(int j=i+1; j< odometerReading.size();j++)
						odometerReading.set(j, odometerReading.get(j-1)+1);
				return odometerReading;
			}

		}
		return startVal(odometerReading.size());
	}

	private static boolean isAtBoundary(Integer value, int boundary) {
		return value == boundary;
	}

	private static List<Integer> startVal(Integer nums) throws IOException {
		List<Integer> result = new ArrayList<Integer>();
		if (nums > 9)
			throw new IOException();
		for (int i = 1; i <= nums; i++) {
			result.add(i);
		}
		return result;
	}