package onboarding;

import java.util.List;

/**
 * [기능 요구사항 목록]
 * 1. 예외사항 처리 메서드 checkPage
 * 2. 각 자리 숫자를 모두 더하는 메서드 addPage
 * 3. 각 자리 숫자를 모두 곱하는 메서드 multiPage
 * 4. 승자 출력 메서드 getWinner
 */
class Problem1 {
    public static boolean checkPage(List<Integer> pages) {

        if (pages.size() != 2) return false;

        int left = pages.get(0);
        int right = pages.get(1);

        if ((left + 1) != right) return false;
        if (left <= 1 || right >= 400) return false;

        return true;
    }

    public static int addPage(int page) {
        int sum = 0;
        while (page > 0) {
            sum += (page % 10);
            page = page / 10;
        }
        return sum;
    }

    public static int multiPage(int page) {
        int base = 1;
        while (page > 0) {
            int r = page % 10;
            if (r == 0) return 0;
            base = base * r;
            page = page / 10;
        }
        return base;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        if (!checkPage(pobi) || !checkPage(crong)) return -1;
        return answer;
    }

}