class BucketFill {

    private char[][] pixels;

    public BucketFill(char[][] pixels) {
        this.pixels = pixels;
    }

    public void fill(int x, int y, char newColor, char oldColor) {
        if (x < 0) return;
        if (y < 0) return;
        if (x >= pixels.length) return;
        if (y >= pixels[x].length) return;

        oldColor = pixels[x][y];

        if (newColor == pixels[x][y]) return;
        if (oldColor != pixels[x][y]) return;

        pixels[x][y] = newColor;

        fill(x - 1, y, newColor, oldColor);
        fill(x + 1, y, newColor, oldColor);
        fill(x, y - 1, newColor, oldColor);
        fill(x, y + 1, newColor, oldColor);
    }

    public void inspect() {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                System.out.print(pixels[y][x]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String argv[]) {
        char pixels[][] =
        {
            { 'O', 'X', 'X', 'X', 'X' },
            { 'X', 'O', 'O', 'O', 'X' },
            { 'X', 'O', '#', 'O', 'X' },
            { 'X', 'O', 'O', 'O', 'X' },
            { 'X', 'X', 'X', 'X', 'X' },
            { 'X', 'X', 'X', '#', '#' },
            { 'X', 'X', 'X', 'X', 'X' }
        };
        BucketFill bucketFill = new BucketFill(pixels);
        bucketFill.fill(0, 0, '*', 'O');
        bucketFill.fill(3, 0, 'O', 'O');
        bucketFill.fill(2, 1, '@', 'O');
        bucketFill.inspect();
    }
}