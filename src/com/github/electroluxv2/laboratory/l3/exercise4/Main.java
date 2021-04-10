package com.github.electroluxv2.laboratory.l3.exercise4;

public class Main {

    public static void main(String[] args) {
        PC first = new PC();
        PC second = new PC(Kind.NOTEBOOK, PcSystem.MAC_OS, 20);

        System.out.println(first);
        System.out.println(second);
    }

    private enum PcSystem {
        MAC_OS("Big Sur"),
        WINDOWS("10"),
        LINUX("Kali");

        private final String value;

        PcSystem(final String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    private enum Kind {
        NOTEBOOK(1),
        DESKTOP(2);

        private final int value;

        Kind(final int value) {
            this.value = value;
        }

        public int GetKind() {
            return this.value;
        }
    }

    private static class PC {
        private final Kind kind;
        private final PcSystem pcSystem;
        private final boolean on = false;
        private final int cores;

        public PC() {
            this(Kind.DESKTOP, PcSystem.LINUX, 128);
        }

        public PC(Kind kind, PcSystem pcSystem, int cores) {
            this.kind = kind;
            this.pcSystem = pcSystem;
            this.cores = cores;
        }

        public String Information() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.kind.toString());
            stringBuilder.append(" with OS: ");
            stringBuilder.append(this.pcSystem.toString());
            stringBuilder.append(" with ");
            stringBuilder.append(this.cores);
            stringBuilder.append(" total cores, currently ");
            stringBuilder.append(this.on ? "on" : "off");
            return stringBuilder.toString();
        }

        @Override
        public String toString() {
            return this.Information();
        }
    }
}
