public class EnumDemo {

    enum Level {
        INFO(1),
        WARNING(2),
        ERROR(3),
        UNKNOWN(0);

        private int value;
        Level(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public static void main(String[] args) {
        System.out.println("LEVEL: " +Level.UNKNOWN.getValue());
    }
//        public static int getLevelValue (Level level) {
//            return switch (level) {
//                case INFO -> 1;
//                case WARNING -> 2;
//                case ERROR -> 3;
//                default -> 0;
//            };
//
//        }
}
