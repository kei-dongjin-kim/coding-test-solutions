package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0874 {
    static class Pair {
        int x = 0;
        int y = 0;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }
    public int robotSim(int[] commands, int[][] obstacles) {
        int max = 0;
        int x = 0;
        int y = 0;
        int dir = 0;
        // 0N 1E 2S 3W
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Set<Pair> obs = new HashSet<>();
        for (int[] o : obstacles) {
            obs.add(new Pair(o[0], o[1]));
        }
        for (int i : commands) {
            if (i == -2) {
                // turn left
                dir = (dir + 3) % 4;
            } else if (i == -1) {
                // turn right
                dir = (dir + 1) % 4;
            } else {
                for (int j=0 ; j<i ; j++) {
                    if (obs.contains(new Pair(x + dx[dir], y + dy[dir]))) {
                        break;
                    }
                    x += dx[dir];
                    y += dy[dir];
                }
            }
            max = Math.max(max, x * x + y * y);
        }
        return max;
    }
}
