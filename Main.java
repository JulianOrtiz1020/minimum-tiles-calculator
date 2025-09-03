import java.util.Scanner;

/**
 * The TileCalculator class provides a method to calculate the minimum number
 * of square tiles needed to cover a rectangular area.
 */
public class TileCalculator {

    /**
     * Calculates the minimum number of tiles necessary to cover the area.
     *
     * @param tileSide     the length of one side of the square tile, in units
     * @param areaLength   the length of the rectangular area, in units
     * @param areaWidth    the width of the rectangular area, in units
     * @return the minimum number of tiles required
     */
    public static int calculateMinimumTiles(int tileSide, int areaLength, int areaWidth) {
        // Calculate how many tiles fit horizontally, rounding up
        int tilesHorizontal = (areaLength + tileSide - 1) / tileSide;
        // Calculate how many tiles fit vertically, rounding up
        int tilesVertical = (areaWidth + tileSide - 1) / tileSide;
        // Total tiles needed
        return tilesHorizontal * tilesVertical;
    }

    /**
     * Main method to demonstrate the use of calculateMinimumTiles method.
     * Prompts the user for input and displays the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side size of the tile, the area length, and area width
        System.out.print("Enter the side length of the tile: ");
        int tileSide = scanner.nextInt();

        System.out.print("Enter the length of the area: ");
        int areaLength = scanner.nextInt();

        System.out.print("Enter the width of the area: ");
        int areaWidth = scanner.nextInt();

        // Calculate and display the minimum number of tiles needed
        int minimumTiles = calculateMinimumTiles(tileSide, areaLength, areaWidth);
        System.out.println("Minimum number of tiles required: " + minimumTiles);

        scanner.close();
    }
}
