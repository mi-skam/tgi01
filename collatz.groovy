@groovy.transform.CompileStatic
int collatz(int n) {
    int t = n

    while (t != 1) {
        if (t % 2 != 0) {
            t = 3 * t + 1
        } else {
            t = t / 2 as Integer
        }
    }
    return t
}

// test 1
println(collatz(243))
