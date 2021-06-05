int ggt(int a, int b) {
    int temp

    while (a != b) {
        if ( a > b) {
            // switch positions
            temp = a
            a = b
            b = temp
        }
            b = b - a
    }
    return a
}

// test 1 => 4
println(ggt(8, 4))

// test 1 => 1
println(ggt(7, 3))