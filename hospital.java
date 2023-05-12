package day16;

import java.util.TreeMap;

public class hospital {
	public static void main(String[] args) {
		int[][] schedule = { { 1, 1, 5, 2, 3 }, { 4, 5, 6, 4, 3 }, { 9, 4, 4, 1, 5 } };
		int countDoctor = solution(schedule);
		System.out.println(countDoctor);
	}

	public static int solution(int[][] A) {
		TreeMap<Integer, Integer> scheduleInHospitals = new TreeMap<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				int doctorId = A[i][j];
				if (scheduleInHospitals.containsKey(doctorId)) {
					scheduleInHospitals.put(doctorId, scheduleInHospitals.get(doctorId) + 1);
				} else {
					scheduleInHospitals.put(doctorId, 1);
				}
			}
		}
		int countDoctor = 0;
		for (int doctor : scheduleInHospitals.values()) {
			if (doctor > 1) { //number of occurrences of a doctor in all hospitals
				countDoctor++;
			}
		}
		return countDoctor;
	}
}
