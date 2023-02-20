import java.util.ArrayList;
import java.util.List;

public class FindAllSubString {

	public static void main(String[] args) {

		String inpString = "InPut";
		List<String> resultList = solution(inpString);
		System.out.println(resultList);

	}

	public static List<String> solution(String input) {
		int n = input.length();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String subString = input.substring(i, j);
				list.add(subString);
			}

		}
		return list;

	}

}
