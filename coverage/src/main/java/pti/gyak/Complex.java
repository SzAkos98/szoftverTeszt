package pti.gyak;

class Complex {
    long func(long a, long b, long c) {
        if (a != 354) {
            if (a == 698) {
                a = -a;
            } else {
                a = Math.min(b, c);
            }
        }
        return a;
    }
}