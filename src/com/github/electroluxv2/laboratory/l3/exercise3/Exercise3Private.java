package com.github.electroluxv2.laboratory.l3.exercise3;

public class Exercise3Private {

    // This is so weird, c++ is better in that case
    // https://programming.guide/java/accessing-private-fields-of-other-objects.html
    static class RemoteWithPrivate {
        private static class TVPrivate {
            private static final int MAX_VOLUME = 20;
            private static final int MIN_VOLUME = 1;

            private static final int HIGHEST_CHANNEL = 10;
            private static final int LOWEST_CHANNEL = 1;

            private int channel = 5, volume = 5;
            private boolean on = false;

            public boolean VolumeUp() {
                if (this.volume + 1 > MAX_VOLUME) return false;
                if (!this.on) return false;

                this.volume++;
                return true;
            }

            public boolean VolumeDown() {
                if (this.volume - 1 < MIN_VOLUME) return false;
                if (!this.on) return false;

                this.volume--;
                return true;
            }

            public boolean NextChannel() {
                if (!this.on) return false;

                if (++this.channel > HIGHEST_CHANNEL) {
                    this.channel = LOWEST_CHANNEL;
                }

                return true;
            }

            public boolean PreviousChannel() {
                if (!this.on) return false;

                if (--this.channel < LOWEST_CHANNEL) {
                    this.channel = HIGHEST_CHANNEL;
                }

                return true;
            }

            public void PowerOn() {
                this.on = true;
            }

            public void PowerOff() {
                this.on = false;
            }

            public int GetChannel() throws Exception {
                if (!this.on) throw new Exception("TV is not powered on!");

                return this.channel;
            }

            public int GetVolume() throws Exception {
                if (!this.on) throw new Exception("TV is not powered on!");

                return this.volume;
            }

            public boolean IsPoweredOn() {
                return this.on;
            }
        }
        private final TVPrivate assignedTV = new TVPrivate();

        public TVPrivate Control() {
            return this.assignedTV;
        }
    }


    public static void main(String[] args) throws Exception {
        RemoteWithPrivate remote = new RemoteWithPrivate();
        // remote.Control().PowerOn();
        // This should not be possible
        remote.assignedTV.on = true;


        for (int i = 0; i < 10; i++) {
            remote.Control().VolumeUp();
            remote.Control().VolumeUp();
            remote.Control().NextChannel();

            System.out.printf("Channel: %d, Volume: %d%n", remote.Control().GetChannel(), remote.Control().GetVolume());
        }
    }
}
