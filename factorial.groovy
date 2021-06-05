@groovy.transform.CompileStatic

int factorial(int n) {
    int nfactorial = 1

    while (n > 1) {
        nfactorial = nfactorial * n
        n--
    }
    return nfactorial
}

// test1 factorial(6) == 720
println(factorial(6))

// test2 factorial(3) == 6
println(factorial(3))
