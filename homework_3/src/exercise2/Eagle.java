package exercise2;

public class Eagle extends Bird {
        int lifetime;

        public Eagle(boolean vegan, String food, byte noOfLegs, int lifetime){
            super(vegan, food, noOfLegs);
            this.lifetime = lifetime;
        }

        public Eagle(boolean vegan, String food, byte noOfLegs){
            super(vegan, food, noOfLegs);
            this.lifetime = 5;
        }

        public Eagle(String food){
            super(false, food, (byte) 2);
            this.lifetime = 5;
        }

        public Eagle(){
            super(false, "unknown", (byte) 2);
            this.lifetime = 5;
        }

        public int getLifetime(){
            return this.lifetime;
        }
    }

