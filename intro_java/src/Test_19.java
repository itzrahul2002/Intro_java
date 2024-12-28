public class Test_19 {
    static boolean isIdentity(int[][]mat) {
        int r = mat.length;
        int c = mat[0].length;
        if(r != c) {
            return false;
        }
        int i = 0;
        int j = 0;
        while(i < r && j < c) {
            if(mat[i][j] != 1) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
