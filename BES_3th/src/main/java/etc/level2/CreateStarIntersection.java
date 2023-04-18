package etc.level2;

import java.util.*;

class CreateStarIntersection {
    public String[] solution(int[][] line) {
        Set<Point> points = new HashSet<>();
        long[] xRange = new long[2];
        long[] yRange = new long[2];

        rangeValueInit(xRange, yRange);

        for(int i = 0; i < line.length - 1; i++) {
            for(int j = i + 1; j < line.length; j++) {
                Point point = intersection(line[i], line[j]);
                if (point == null) {
                    continue;
                }
                points.add(point);
                if (point.x < xRange[0]) {
                    xRange[0] = point.x;
                }
                if (point.x > xRange[1]) {
                    xRange[1] = point.x;
                }
                if (point.y < yRange[0]) {
                    yRange[0] = point.y;
                }
                if (point.y > yRange[1]) {
                    yRange[1] = point.y;
                }
            }
        }

        String[] answer = new String[(int) (yRange[1] - yRange[0] + 1)];
        for (int i = 0; i < answer.length; i++) {
            char[] row = new char[(int) (xRange[1] - xRange[0] + 1)];
            Arrays.fill(row, '.');

            for (Point p : points) {
                if (i == p.y - yRange[0]) {
                    row[(int) (p.x - xRange[0])] = '*';
                }
            }
            answer[i] = String.copyValueOf(row);
        }


        return reverseArray(answer);
    }

    private void rangeValueInit(final long[] xRange, final long[] yRange) {
        xRange[0] = Long.MAX_VALUE;
        xRange[1] = Long.MIN_VALUE;
        yRange[0] = Long.MAX_VALUE;
        yRange[1] = Long.MIN_VALUE;
    }

    private String[] reverseArray(final String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);

        return list.toArray(new String[list.size()]);
    }

    private Point intersection(int[] line1, int[] line2) {
        // Ax + By + E = 0
        double A = line1[0];
        double B = line1[1];
        double E = line1[2];

        // Cx + Dy + F = 0
        double C = line2[0];
        double D = line2[1];
        double F = line2[2];

        double divisor = A * D - B * C;

        if (divisor == 0) {
            return null;
        }

        double x = (B * F - E * D) / divisor;
        double y = (E * C - A * F) / divisor;

        if (x != (long) x || y != (long) y) {
            return null;
        }

        return Point.of(x, y);
    }
}

class Point {
    public final long x;
    public final long y;

    private Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(double x, double y) {
        return new Point((long) x, (long) y);
    }

    @Override
    public int hashCode() {
        int result = (int) (x ^ (x >>> 32));
        result = 31 * result + (int) (y ^ (y >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public String toString() {
        return "x = " + x +
            ", y = " + y;
    }

}