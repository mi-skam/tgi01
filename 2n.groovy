BigDecimal twoN(int n) {
    int twoN

    twoN = 1

    if (n == 0) {
        return 1
    }

    if (n < 0) {
        n = -n
        while (n > 0) {
            twoN = twoN * 2
            n--
        }
        return 1 / twoN
    }

    while (n > 0) {
        twoN = twoN * 2
        n--
    }
    return twoN
}
// test1 => 2
println(twoN(1))

// test1 => 4
println(twoN(2))

// test1 => 8
println(twoN(3))

// test1 => 0.5
println(twoN(-1))

// test1 => 1
println(twoN(0))
