public class Main {
    public static void main(String[] args) {
        System.out.println(solution(37));
    }

    //submitted solution
    @SuppressWarnings("SameParameterValue")
    static int solution(int n) {
        return (int) Math.pow(2, Integer.toBinaryString(n).length() - 1 - (Integer.toBinaryString(n).substring(0, Integer.toBinaryString(n).lastIndexOf('0')) + '2' +
                Integer.toBinaryString(n).substring(Integer.toBinaryString(n).lastIndexOf('0') + 1)).lastIndexOf('0'));
    }

    //simpler version
    static int solution1(int n) {
        String binary = Integer.toBinaryString(n);

        binary = binary.substring(0, binary.lastIndexOf('0')) + '2' +
                binary.substring(binary.lastIndexOf('0') + 1);

        return (int) Math.pow(2, binary.length() - 1 - binary.lastIndexOf('0'));
    }
}