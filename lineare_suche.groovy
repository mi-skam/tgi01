def lineareSuche(w, L) {
  i = 0
  while (i < L.size()) {
    if (L[i] == w) return true
    i++
  }
  return false
}
// test1
// w = 4
// L2 = [] // empty list raises missingPropertyException
// println(lineareSuche(w, L))

// test2
w = 44
L = [2]
println(lineareSuche(w, L))

// test3
w = 44
L = [44]
println(lineareSuche(w, L))

// test4
w = 44
L = [2, 3, 4, 5, 44, 9, 44, 5, 33, 44]
println(lineareSuche(w, L))