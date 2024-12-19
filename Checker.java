public final class Checker {

    public static Boolean checkVictory(Board aBoard, Player aPlayer) {

        return checkVerticalVictory(aBoard, aPlayer) ||
                checkHorizontalVictory(aBoard, aPlayer) ||
                checkDiagonalVictory(aBoard, aPlayer);
    }

    private static Boolean checkVerticalVictory(Board aBoard, Player aPlayer) {

        for (byte col = 0; col <= 2; col++) {
            if (aBoard.getCell((byte) 0, (byte) col) == aPlayer.getName() &&
                    aBoard.getCell((byte) 1, (byte) col) == aPlayer.getName() &&
                    aBoard.getCell((byte) 2, (byte) col) == aPlayer.getName()) {
                return true;
            }
        }

        return false;
    }

    private static Boolean checkHorizontalVictory(Board aBoard, Player aPlayer) {
        for (byte row = 0; row <= 2; row++) {
            if (aBoard.getCell((byte) row, (byte) 0) == aPlayer.getName() &&
                    aBoard.getCell((byte) row, (byte) 1) == aPlayer.getName() &&
                    aBoard.getCell((byte) row, (byte) 2) == aPlayer.getName()) {
                return true;
            }
        }
        return false;
    }

    private static Boolean checkDiagonalVictory(Board aBoard, Player aPlayer) {

        if (aBoard.getCell((byte) 0, (byte) 0) == aPlayer.getName() &&
                aBoard.getCell((byte) 1, (byte) 1) == aPlayer.getName() &&
                aBoard.getCell((byte) 2, (byte) 2) == aPlayer.getName()) {
            return true;
        }

        if (aBoard.getCell((byte) 0, (byte) 2) == aPlayer.getName() &&
                aBoard.getCell((byte) 1, (byte) 1) == aPlayer.getName() &&
                aBoard.getCell((byte) 2, (byte) 0) == aPlayer.getName()) {
            return true;
        }

        return false;
    }

}